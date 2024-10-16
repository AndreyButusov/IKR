package IKR.service;

import java.util.Scanner;

public class navigator {

    static AnimalService animalService = new AnimalService();
    static Scanner iScanner = new Scanner(System.in);
    
    public static void navigator(){

        while (true) {
            System.out.println("Реестр животных приветствует Вас! \n Введите необходимую операцию: \n 1.Добавить животное. \n 2.Просмотр реестра животных. \n 3.Вывести список комманд животного. \n 4.Добавление новой команды существующему животному. \n 5.Вывод количества животных в реестре по типам");
            int key = iScanner.nextInt();
            switch (key) {
                case 1:
                    AddAnimal();
                    break;
                case 2:
                    animalService.printRegistry();
                    break;
                case 3:
                    animalService.getCommands();
                    break;
                case 4:
                    animalService.setCommand();
                    break;
                case 5:
                    animalService.CounterAnimals();
                    break;
                default:
                    break;
        }
    }
    }

    private static void AddAnimal() {
        System.out.println("Введите нормер класса животного: \n 1.Dog \n 2.Cat \n 3.Hamster \n 4.Camel \n 5.Horse \n 6.Donkey");
        int key1 = iScanner.nextInt();
        animalService.addAnimal(key1);
    }

}