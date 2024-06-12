package Animais;

public class Passaro extends Animal {

    static int QuantidadeDePassaros;

    public Passaro(String nome, String cor, double altura, double peso){
        super(nome, cor, altura, peso);
        QuantidadeDePassaros++;
    }

    @Override
    public void Soar() {
        System.out.println("Piu Piu!");
    }

}
