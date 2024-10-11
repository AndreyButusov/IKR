package IKR.service;

import java.util.Scanner;
import java.time.LocalDate;

import IKR.model.Pets;
import IKR.model.PackAnimal;

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
        if (key > 3) {
            System.out.println("Теперь максимальную грузоподъемность");
            double maxLoadWeight = iScanner.nextDouble();
            navigator.registry.add(new PackAnimal(name, null, commands, maxLoadWeight));
        }
        navigator.registry.add(new Pets(name, LocalDate.parse(birthday), commands)); 
        System.out.println();
    }
}
