package br.com.catolica.veiculos;

public class Main {
    public static void main(String[] args){
        Veiculo carro = new Veiculo("10/05/2008", 150_000, "111.222.333", 5);
        Veiculo onibus = new Veiculo("04/03/1988", 300_000, "000.000.001", 48);
        Veiculo caminhao = new Veiculo("01/01/2024", 200_000, "428.656.231", 2);
        Veiculo moto = new Veiculo("28/12/2025", 1200, "999.999.999", 1);
        Veiculo tanqueDeGuerra = new Veiculo("01/03/1945", 2000, "423.564.435", 6);

        tanqueDeGuerra.frear(20);
        onibus.acelerar(60);
    }
}
