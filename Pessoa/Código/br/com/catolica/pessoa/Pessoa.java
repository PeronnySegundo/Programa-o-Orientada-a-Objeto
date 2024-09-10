package br.com.catolica.pessoa;

public class Pessoa {
    String nome;
    String paisDeNascimento;
    int idade;
    String estadoCivil;
    double saldoDaContaBancaria;

    public Pessoa(String nome, String paisDeNascimento, int idade, String estadoCivil, double saldoDaContaBancaria){
        this.nome = nome;
        this.paisDeNascimento = paisDeNascimento;
        this.idade = idade;
        this.estadoCivil = estadoCivil;
        this.saldoDaContaBancaria = saldoDaContaBancaria;
    }

    void falar(String textoParaSerFalado){
        if (textoParaSerFalado.length() <= 0){
            System.out.println("Digite algo valido");
        }
        System.out.printf("%s falou: %s\n", this.nome, textoParaSerFalado);
    }void dormir(int horasDeSono){
        if (horasDeSono < 0){
            System.out.println("Digite um numero de horas valido");
        }
        System.out.printf("%s dormiu por %d horas na noite passada\n", this.nome, horasDeSono);
    }
}
