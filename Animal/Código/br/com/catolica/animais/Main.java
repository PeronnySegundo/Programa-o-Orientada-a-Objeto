package br.com.catolica.animais;

public class Main {
    public static void main(String[] args){
        Animal elefante = new Animal("Elefante das montanhas", 4, "cinza", true);
        Animal centopeia = new Animal("Centopeia", 44, "Vermelho escuro", false);
        Animal cachorro = new Animal("Caninus", 4, "caramelo", true);
        Animal unicornio = new Animal("Unicornio das galaxias", 4, "rosa", true);

        unicornio.cacar("Estrelas cadentes");
        System.out.println(elefante.beberAgua("lagos da floresta"));
    }
}
