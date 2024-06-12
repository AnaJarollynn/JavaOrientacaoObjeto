package Animais;

public class Gato extends Animal {

    static int QuantidadeDeGatos;


    public Gato(String nome, String cor, double altura, double peso){
        super(nome, cor, altura, peso);
        QuantidadeDeGatos++;
    }

    @Override
    public String toString() {
        return "Gato(a): " + this._nome;
    }

    @Override
    public void Soar() {
        System.out.println("Meow Meow!");
    }

}
