package org.example.Entidades;

public class Homem extends PessoaIMC {

    public Homem(String nome, String dataNascimento, double peso, double altura) {
        super(nome, dataNascimento, peso, altura);
    }

    @Override
    public String resultIMC(String result) {
        double resultado = calcularIMC(getPeso(), getAltura());
        if (resultado < 20.7) {
            return "Abaixo do peso ideal";
        } else if (resultado > 20.7 && resultado < 26.4) {
            return "Peso ideal";
        } else {
            return "Acima do peso ideal";
        }
    }
}
