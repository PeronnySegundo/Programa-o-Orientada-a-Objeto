package br.com.catolica.veiculos;

public class Veiculo {
    String anoDeFabricacao;
    int quilometrosRodados;
    String numeroDoChassi;
    int numeroDeAcentos;

    public Veiculo(String anoDeFabricacao, int quilometrosRodados, String numeroDoChassi, int numeroDeAcentos){
        this.anoDeFabricacao = anoDeFabricacao;
        this.quilometrosRodados = quilometrosRodados;
        this.numeroDeAcentos = numeroDeAcentos;
        this.numeroDoChassi = numeroDoChassi;
    }

    int acelerar(int velocidadeEmQuilometrosPorHora){
        if (velocidadeEmQuilometrosPorHora <= 0){
            System.out.println("Digite um valor valido para a aceleração de um veiculo");
        }int velocidadeEmMetrosPorSegundo = velocidadeEmQuilometrosPorHora * 3;
        System.out.printf("A aceleração do veiculo em metros por segundo foi de %d\n", velocidadeEmMetrosPorSegundo);
        return velocidadeEmMetrosPorSegundo;
    }int frear(int velocidadeQueOVeiculoDeveEstar){
        if (velocidadeQueOVeiculoDeveEstar < 0){
            System.out.println("Digite um valor valido");
        }
        System.out.printf("A velocidade do veiculos foi reduzida para %d quilometros por hora\n", velocidadeQueOVeiculoDeveEstar);
        int velocidadeEmMetrosPorSegundo = velocidadeQueOVeiculoDeveEstar * 3;
        return velocidadeEmMetrosPorSegundo;
    }
}
