package Lojas;

import Animais.Animal;
import Animais.Passaro;

public class Petshop {

    public void DarBanho(Animal animal){
        animal.SetEstadoDeEspirito("Limpo");
    }

    public void Tosar(Animal animal){
        if(animal instanceof Passaro)
            System.out.println("Impossível Tosar");
        else
            animal.SetEstadoDeEspirito("Tosado");
    }

    public void DeixarNoHotel(Animal animal){
        animal.SetEstadoDeEspirito("Saudade");
    }

}
