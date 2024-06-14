import Animais.Cachorro;
import Animais.Passaro;
import Animais.Gato;
import Lojas.Petshop;
import Animais.Animal;

//main precisa necessariamente ser public e estático e VOID (não retorna valor)
 // Obrigatóriamente precisa do nome 'main'
 // Parâmetro precisa ser um array de String
 //JVM procura o método main para iniciar o Projeto
 //String[] args pode ser substituido por String...(nome da array)

public class Main{
    public static void main(String[] args){ //'...' representa que é indefinido a quantidade de variáveis que vai receber neste método

        //Tipos Primitivos

        //byte (-128 até 127)
        //short (-32768 até 32767)
        //char 0 a 65535
        //int -2b a 2bilhoes (mais utilizado)
        //long -9t a 9trilhoes

        //Definições
        //Classe - Características
        //Objeto - Características consumidas e alteradas baseadas na Classe

        Cachorro cachorro = new Cachorro("Rex","Branco",25.0,7.0,5.0); //Criando o objeto Cachorro "New"

        //cachorro.SetNome("Rex");       //Atribuindo caracteristicas
        //cachorro.SetAltura(25.0);          
        //cachorro.SetCor("Branco");
        //cachorro.SetPeso(7.0);
        //cachorro.SetTamanhoDoRabo(5.0);

        //System.out.println(cachorro);         //O que está sendo impresso: Qual classe é, na frente do @ é onde está localizado na memória
                                                //Cada objeto possui um endereço de memória diferente
        cachorro.Soar();
        String oQuePegou = cachorro.Pegar();    // Criando uma variável do que o cachorro pegou
        System.out.printf("O %s pegou o(a) %s %n", cachorro.GetNome(), oQuePegou); //Imprimindo na tela

        cachorro.Interagir("Carinho");
        System.out.printf("O %s está %s %n", cachorro.GetNome(), cachorro.GetEstadoDeEspirito());

        //Garbagge Collector -- Limpar a memória Heap assim que o objeto perde a referência
        //Pesquise sobre memória Stack e Heap//
        
        System.out.println(cachorro); //Override To String

        Cachorro segundoCachorro = new Cachorro("Lyla","Preto",25.0,7.0,5.0);

        //o 'segundoCachorro aponta para uma parte de mamória'
        segundoCachorro = cachorro;
        //Agora ele aponta para a mesma parte da memória do cachorro. Então qualquer alteração no 'cachorro', afetará o 'segundocachorro'
        //Caso queira validar a mémória, vá na classe cachorro e comente o 'toString()'
        
        cachorro.SetNome("Lady");
        System.out.println(segundoCachorro);
        System.out.println(cachorro);
        //As antigas informações do 'segundoCachorro' são 'deletadas' pelo GarbageCollector (Isso só acontece na memória Heap)

        //Polimorfismo
        //Métodos são 'Peneirados' a reeber informações específicas, no exeplo Animais, porém o Pássaro não pode ser Tosado
        Petshop petshop = new Petshop();

        petshop.DarBanho(cachorro);
        System.out.println(cachorro.GetEstadoDeEspirito());

        //Instânciando como Animal na classe e o Objeto 'Passaro'
        //Classe de referência pode ser diferente da verdadeira
        Animal passaro = new Passaro("Hélio","Verde",0.25,0.30); 

        petshop.Tosar(passaro);

        petshop.DeixarNoHotel(passaro);
        System.out.println(passaro.GetEstadoDeEspirito());

        petshop.Tosar(cachorro);
        System.out.println(cachorro.GetEstadoDeEspirito());

        Animal gatoFrajola = new Gato("Frajola","Preto e Branco",5.0,1.5);
        gatoFrajola.Soar();
        System.out.println(gatoFrajola);

    }
}