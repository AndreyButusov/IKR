package IKR.service;

import java.util.Scanner;
import java.time.LocalDate;

import IKR.model.*;

public class AnimalService {
    public void add(Integer key) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Вводим имя животного");
        String name = iScanner.next();
        System.out.println("Теперь дату рождения");
        iScanner.nextLine();
        String birthday = iScanner.nextLine();
        System.out.println("Теперь доступные команды");
        String command = iScanner.nextLine();
        StringBuilder commands = new StringBuilder(command);
        switch (key) {
            case 1:
                navigator.registry.add(new Dog(name, LocalDate.parse(birthday), commands));
                break;
            case 2:
                navigator.registry.add(new Cat(name, LocalDate.parse(birthday), commands));
                break;
            case 3:
                navigator.registry.add(new Hamster(name, LocalDate.parse(birthday), commands));
                break;
            default:
                break;
        }
        if (key > 3) {
            System.out.println("Теперь максимальную грузоподъемность");
            double maxLoadWeight = iScanner.nextDouble();
            switch (key) {
                case 4:
                    navigator.registry.add(new Camel(name, LocalDate.parse(birthday), commands, maxLoadWeight));
                    break;
                case 5:
                    navigator.registry.add(new Horse(name, LocalDate.parse(birthday), commands, maxLoadWeight));
                    break;
                case 6:
                    navigator.registry.add(new Donkey(name, LocalDate.parse(birthday), commands, maxLoadWeight));
                    break;
            
                default:
                    break;
            }
        }
        System.out.println();
    }
}
