package Animais;


public class Cachorro extends Animal { //Extends, herdando informações da Classe 'Animal', ou seja, 'Cachorro' é uma classe 'Filha'

    //Características da Classe

    private double _tamanhoDoRabo;

    //Contagem de Objetos -- Static (NÃO É ALTERADO PELA CRIAÇÃO DO OBJETO)
    //Essa variável pertence a Classe e não a instância

    static int QuantidadeDeCachorros;

    //Construtor - Torna necessárias as informações a criar o Objeto

    public Cachorro(String nome, String cor, double altura, double peso, double tamanhoDoRabo){
        super(nome, cor, altura, peso);
        this._tamanhoDoRabo = tamanhoDoRabo;
        QuantidadeDeCachorros++;
    }

    //Getters -- Encapsulamento -- Verificar Informações (Retornando seu valor)

    public String GetNome(){ 
        return this._nome;
    }

    public String GetCor(){ 
        return this._cor;
    }

    public double GetAltura(){ 
        return this._altura;
    }

    public double GetPeso(){ 
        return this._peso;
    }

    public double GetTamanhoDoRabo(){ 
        return this._tamanhoDoRabo;
    }

    public String GetEstadoDeEspirito(){
        return this._estadoDeEspirito;
    }

    public int GetQuantidadadeDeCachorros(){
        return QuantidadeDeCachorros;
    }

    //Setters -- Encapsulamento -- Alterar Informações

    public void SetNome(String nome){ 
        this._nome = nome;
    }

    public void SetCor(String cor){ 
        this._cor = cor;
    }

    public void SetAltura(double altura){ 
        this._altura = altura;
    }

    public void SetPeso(double peso){ 
        this._peso = peso;
    }

    public void SetTamanhoDoRabo(double tamanhoDoRabo){ 
        this._tamanhoDoRabo = tamanhoDoRabo;
    }

    //Métodos

    public String Pegar(){ //Retorna uma String, no caso Bolinha
        return "Bolinha";        
    }

    public String Interagir(String acao){ //Retorna uma String e pede uma String

        acao = acao.toLowerCase(); //transforma a string em minusculo, evitar CaseSensitive

        switch(acao){ //Validação da Ação
            case "carinho":
            case "cafuné":
                this._estadoDeEspirito =  "Feliz";
                break;
            case "pisar":
            case "xingar":
            case "chutar":
                this._estadoDeEspirito =  "Raiva";
                break;
            case "não fazer Carinho":
            case "tirar Bolinha":
                this._estadoDeEspirito =  "Triste";
                break;
            default: //Caso não seja nenhuma das acima
                this._estadoDeEspirito =  "Neutro";
        }
        return this._estadoDeEspirito;
    }

    //Redefinir método com Override
    @Override
    public String toString(){
        return String.format("Cachorro: %s", this._nome);
    }

    @Override
    public void Soar() {
        System.out.println("Au Au!");
    }

}


