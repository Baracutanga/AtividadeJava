package org.example.Entidades;

public class Mulher extends PessoaIMC {
    public Mulher(String nome, String dataNascimento, double altura, double peso) {
        super(nome, dataNascimento, altura, peso);
    }

    @Override
    public String resultIMC(String result) {
        double resultado = calcularIMC(getPeso(), getAltura());
        if (resultado < 19.0) {
            return "Abaixo do peso ideal";
        } else if (resultado > 19.0 && resultado < 25.8) {
            return "Peso ideal";
        } else {
            return "Acima do peso ideal";
        }
    }
}
