package IKR.service;

import java.util.Scanner;
import java.time.LocalDate;

import IKR.model.Dog;

public class DogService {

    public void add() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Вводим имя собаки");
        String name = iScanner.next();
        System.out.println("Теперь дату рождения");
        iScanner.nextLine();
        String birthday = iScanner.nextLine();
        System.out.println("Теперь доступные команды");
        //iScanner.nextLine();
        String command = iScanner.nextLine();
        StringBuilder commands = new StringBuilder(command);
        navigator.registry.add(new Dog(name, LocalDate.parse(birthday), commands)); 
        System.out.println();
    }
    
}
