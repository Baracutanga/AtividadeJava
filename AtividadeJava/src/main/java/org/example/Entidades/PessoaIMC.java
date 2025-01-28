package org.example.Entidades;

public abstract class PessoaIMC extends Pessoa {
    private double peso;
    private double altura;

    public PessoaIMC(String nome, String dataNascimento, double peso, double altura) {
        super(nome, dataNascimento);
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public double calcularIMC(double peso, double altura) {
        double IMC = peso / (altura * altura);
        return IMC;
    }

    public abstract String resultIMC(String result);

    @Override
    public String toString() {
        return "Nome: " + getNome() +
                "\nData de nascimento: " + getDataNascimento() +
                "\nPeso: " + getPeso() +
                "\nAltura: " + getAltura();
    }
}
