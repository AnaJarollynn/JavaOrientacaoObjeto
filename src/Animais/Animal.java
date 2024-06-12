package Animais;

//Encapsulamento

//  Visibilidade                        |     Public    |   Protected   |    Default    |    Private     |
//A partir da mesma classe              |       V       |       V       |       V       |       V        |
//Qualquer Classe no mesmo pacote       |       V       |       V       |       V       |       X        |
//Qualquer Classe filha no mesmo pacote |       V       |       V       |       V       |       X        |
//Qualquer classe filha outro pacote    |       V       |       V       |       X       |       X        |
//Qualquer classe em pecote diferente   |       V       |       X       |       X       |       X        |

public class Animal { //Classe pai, ou seja, que possui características em comum com todas as outras, evitando repetição

    protected String _nome;
    protected String _cor;
    protected double _altura;
    protected double _peso;
    protected String _estadoDeEspirito;

    Animal(String nome, String cor, double altura, double peso){

        this._nome = nome;
        this._cor = cor;
        this._altura = altura;
        this._peso = peso;
        this._estadoDeEspirito = "Neutro";
    }

    void Comer(){}

    void Dormir(){}

    void Soar(){
        System.out.println(" ");
    }
}
