package IKR;

import java.time.LocalDate;

import IKR.model.AnimalRegistry;
import IKR.model.Cat;
import IKR.model.Dog;
import IKR.model.Hamster;
import IKR.service.navigator;

public class Main {
    
    public static void main(String[] args) {

        
        navigator.navigator();
        // AnimalRegistry registry = new AnimalRegistry();

        // registry.add(new Dog("Fido", LocalDate.parse("2020-01-01")));
        // registry.add(new Cat("Whiskers", LocalDate.parse("2019-05-15")));
        // registry.add(new Hamster("Hammy", LocalDate.parse("2021-03-10")));

        // registry.printRegistry();

    }


}
