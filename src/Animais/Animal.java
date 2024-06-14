package Animais;

//Encapsulamento

//  Visibilidade                        |     Public    |   Protected   |    Default    |    Private     |
//A partir da mesma classe              |       V       |       V       |       V       |       V        |
//Qualquer Classe no mesmo pacote       |       V       |       V       |       V       |       X        |
//Qualquer Classe filha no mesmo pacote |       V       |       V       |       V       |       X        |
//Qualquer classe filha outro pacote    |       V       |       V       |       X       |       X        |
//Qualquer classe em pecote diferente   |       V       |       X       |       X       |       X        |


//Transformando em uma classe Abstrata ela não pode se tornar um Objeto
// Animal pode ser um Passaro, mas não é possível criar apenas um 'Animal'
public abstract class Animal { //Classe pai, ou seja, que possui características em comum com todas as outras, evitando repetição

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

    public String GetNome(){
        return this._nome;
    }

    public void SetNome(String nome){
        this._nome = nome;
    }

    public String GetCor(){
        return this._cor;
    }
    
    public void SetCor(String cor){
        this._cor = cor;
    }

    public double GetAltura(){
        return this._altura;
    }

    public void SetAlture(double altura){
        this._altura = altura;
    }

    public double GetPeso(){
        return this._peso;
    }

    public void SetPeso(double peso){
        this._peso = peso;
    }

    public void SetEstadoDeEspirito(String estadoDeEspirito){
        this._estadoDeEspirito = estadoDeEspirito;
    }

    public String GetEstadoDeEspirito(){
        return this._estadoDeEspirito;
    }

    void Comer(){}

    void Dormir(){}

    public abstract void Soar();
}
