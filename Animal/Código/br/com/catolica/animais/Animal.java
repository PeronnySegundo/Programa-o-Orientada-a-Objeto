package br.com.catolica.animais;

public class Animal {
    String raca;
    int quantidadeDePatas;
    String corDaPelagem;
    boolean vertebrado;

    public Animal(String raca, int quantidadeDePatas, String corDaPelagem, boolean vertebrado){
        this.raca = raca;
        this.quantidadeDePatas = quantidadeDePatas;
        this.corDaPelagem = corDaPelagem;
        this.vertebrado = vertebrado;
    }
    void cacar(String presa){
        System.out.printf("%s esta caçando %s\n", raca, presa);
    }String beberAgua(String localDaFonteDeAgua){
        String acaoDeBeberAgua = (raca + " esta bebendo agua na região de" + localDaFonteDeAgua + "\n");
        return acaoDeBeberAgua;
    }
}
