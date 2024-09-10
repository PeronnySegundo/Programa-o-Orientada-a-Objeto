package br.com.catolica.pessoa;

public class Main {
    public static void main(String[] args){
        Pessoa pessoa1 = new Pessoa("Peronny", "Brasil", 18, "Solteiro", 100);
        Pessoa pessoa2 = new Pessoa("Erlon", "Brasil", 25, "Casado", 3000);
        Pessoa pessoa3 = new Pessoa("Silvio Santos", "Brasil", -1, "Casado", 600_000_000);
        Pessoa pessoa4 = new Pessoa("Kojiro", "Japão", 53, "Solteiro", 50_000);

        pessoa3.falar("olha o avião");
        pessoa2.dormir(8);
    }
}
