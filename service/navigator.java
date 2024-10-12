package IKR.service;

import java.time.LocalDate;
import java.util.Scanner;

import IKR.model.*;
import IKR.service.*;

public class navigator {

    static AnimalRegistry registry = new AnimalRegistry();
    
    public static void navigator(){
        
        Scanner iScanner = new Scanner(System.in);
        

        while (true) {
            System.out.println("Реестр животных приветствует Вас! \n Введите необходимую операцию: \n 1.Добавить животное. \n 2.Просмотр реестра животных. \n 3. Вывести список комманд животного");
            int key = iScanner.nextInt();
            switch (key) {
                case 1:
                    AddAnimal();
                    break;
                case 2:
                    registry.printRegistry();
                    break;
                case 3:
                    
                default:
                    break;
        }
    }
    }

    private static void AddAnimal() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите нормер класса животного: \n 1.Dog \n 2.Cat \n 3.Hamster \n 4.Camel \n 5.Horse \n 6.Donkey");
        AnimalService animalService = new AnimalService();
        int key1 = iScanner.nextInt();
        animalService.add(key1);
    }

}
        
    
