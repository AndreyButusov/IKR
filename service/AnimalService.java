package IKR.service;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.HashMap;
import java.util.Map;
import java.time.LocalDate;

import IKR.model.*;

public class AnimalService {

    private Map<Class<? extends Animal>, SortedSet<Animal>> animals = new HashMap<>();
    Scanner iScanner = new Scanner(System.in);
    private int CounterPets = 0;
    private int CounterPackAnimal = 0;

    public void add(Animal animal) {
        Class<? extends Animal> clazz = animal.getClass();
        if (!animals.containsKey(clazz)) {
            animals.put(clazz, new TreeSet<>());
        }
        animals.get(clazz).add(animal);
    }
    
    public void addAnimal(Integer key) {
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
                add(new Dog(name, LocalDate.parse(birthday), commands));
                CounterPets++;
                break;
            case 2:
                add(new Cat(name, LocalDate.parse(birthday), commands));
                CounterPets++;
                break;
            case 3:
                add(new Hamster(name, LocalDate.parse(birthday), commands));
                CounterPets++;
                break;
            default:
                break;
        }
        if (key > 3) {
            System.out.println("Теперь максимальную грузоподъемность");
            double maxLoadWeight = iScanner.nextDouble();
            switch (key) {
                case 4:
                    add(new Camel(name, LocalDate.parse(birthday), commands, maxLoadWeight));
                    CounterPackAnimal++;
                    break;
                case 5:
                    add(new Horse(name, LocalDate.parse(birthday), commands, maxLoadWeight));
                    CounterPackAnimal++;
                    break;
                case 6:
                    add(new Donkey(name, LocalDate.parse(birthday), commands, maxLoadWeight));
                    CounterPackAnimal++;
                    break;
            
                default:
                    break;
            }
        }
        System.out.println();
    }

    public void printRegistry() {
        for (SortedSet<Animal> animalsOfType : animals.values()) {
            for (int i = 0; i < animalsOfType.size(); i++) {
                Animal animal = animalsOfType.toArray(new Animal[animalsOfType.size()])[i];
                System.out.printf("%d. %s (%s), born on %s, knows: %s\n", i+1, animal.getName(), animal.getClass().getSimpleName(), animal.getBirthDate(), String.join(", ", animal.getCommands()));
            }
        }
    }

    public void getCommands() {
        System.out.print("Введите имя животного: ");
        String animalName = iScanner.nextLine().trim();
        for (SortedSet<Animal> animalsOfType : animals.values()) {
            for (Animal animal : animalsOfType) {
                if (animal.getName().equals(animalName)) {
                    System.out.println(String.join(", ", animal.getCommands()));
                    return;
                }
            }
        }
        System.out.println("Животного с таким именем не найдено. \n");
    }

    public void setCommand() {
        System.out.print("Введите имя животного: ");
        String animalName = iScanner.nextLine().trim();
        for (SortedSet<Animal> animalsOfType : animals.values()) {
          for (Animal animal : animalsOfType) {
            if (animal.getName().equals(animalName)) {
              System.out.print("Введите новую команду: ");
              String newCommand = iScanner.nextLine().trim();
              animal.getCommands().append(", " + newCommand);
              System.out.println("Команда добавлена.");
              return;
            }
          }
        }
        System.out.println("Животного с таким именем не найдено. \n");
    }

    public void CounterAnimals() {
    System.out.println("Домашние животные: " + CounterPets);
    System.out.println("Вьючные: " + CounterPackAnimal);
    } 
}