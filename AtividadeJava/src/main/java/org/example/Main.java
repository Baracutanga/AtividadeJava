package org.example;

import org.example.Entidades.Homem;
import org.example.Entidades.Mulher;
import org.example.Entidades.PessoaIMC;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantas pessoas você deseja cadastrar o IMC?");
        System.out.print("> ");
        int qtd = sc.nextInt();
        PessoaIMC[] pessoas = new PessoaIMC[qtd];

        for (int i = 0; i < qtd; i++) {
            System.out.println("Qual o seu sexo?");
            System.out.print("> ");
            String sexo = sc.next();

            if (sexo.equals("M") || sexo.equals("Masculino") || sexo.equals("Homem")) {
                System.out.println("=== Digite a seguir ===");

                System.out.print("Nome: ");
                String nome = sc.next();

                System.out.print("Data de nascimento: ");
                String dataNascimento = sc.next();

                System.out.print("Peso: ");
                double peso = Double.parseDouble(sc.next());

                System.out.print("Altura: ");
                double altura = Double.parseDouble(sc.next());
                System.out.println("==============");

                pessoas[i] = new Homem(nome, dataNascimento, peso, altura);
            } else if (sexo.equals("F") || sexo.equals("Feminino") || sexo.equals("Mulher")) {
                System.out.println("=== Digite a seguir ===");

                System.out.print("Nome: ");
                String nome = sc.next();

                System.out.print("Data de nascimento: ");
                String dataNascimento = sc.next();

                System.out.print("Peso: ");
                double peso = Double.parseDouble(sc.next());

                System.out.print("Altura: ");
                double altura = Double.parseDouble(sc.next());
                System.out.println("==============");

                pessoas[i] = new Mulher(nome, dataNascimento, peso, altura);
            }
        }

        System.out.println("===== Pessoas cadastradas =====");
        if (pessoas.length == 0) {
            System.out.println("Nenhuma pessoa cadastrada.");
        } else {
            for (int i = 0; i < qtd; i++) {
                double imc = pessoas[i].calcularIMC(pessoas[i].getPeso(), pessoas[i].getAltura());
                System.out.println(pessoas[i]);
                System.out.println(pessoas[i].resultIMC(String.valueOf(imc)));
                System.out.println("=================");
            }
        }
    }
}