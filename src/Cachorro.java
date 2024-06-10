//Encapsulamento

//  Visibilidade                        |     Public    |   Protected   |    Default    |    Private     |
//A partir da mesma classe              |       V       |       V       |       V       |       V        |
//Qualquer Classe no mesmo pacote       |       V       |       V       |       V       |       X        |
//Qualquer Classe filha no mesmo pacote |       V       |       V       |       V       |       X        |
//Qualquer classe filha outro pacote    |       V       |       V       |       X       |       X        |
//Qualquer classe em pecote diferente   |       V       |       X       |       X       |       X        |

public class Cachorro {

    //Características da Classe

    private String _nome;
    private String _cor;
    private double _altura;
    private double _peso;
    private double _tamanhoDoRabo;
    private String _estadoDeEspirito;

    //Contagem de Objetos -- Static (NÃO É ALTERADO PELA CRIAÇÃO DO OBJETO)

    static int QuantidadeDeCachorros;

    //Construtor - Torna necessárias as informações a criar o Objeto

    Cachorro (String nome, String cor, double altura, double peso, double tamanhoDoRabo){
        this._nome = nome;
        this._cor = cor;
        this._altura = altura;
        this._peso = peso;
        this._tamanhoDoRabo = tamanhoDoRabo;
        this._estadoDeEspirito = "Neutro";
        QuantidadeDeCachorros++;
    }

    //Sobrecarga Construtor - Torna possível a criação sem a necessidade de todas as informações acima

    Cachorro(){}

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

    public void Latir(){ //Não retorna valor (Void)
        System.out.println("AU AU!"); //Imprime na tela o latido
    }

    public void Comer(){ //Método existe, porém não faz 'nada'

    }

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
        return "Cachorro: " + _nome;
    }

}


