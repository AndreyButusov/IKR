package IKR.model;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

public class AnimalRegistry {
    private Map<Class<? extends Animal>, SortedSet<Animal>> animals = new HashMap<>();

    public void add(Animal animal) {
        Class<? extends Animal> clazz = animal.getClass();
        if (!animals.containsKey(clazz)) {
            animals.put(clazz, new TreeSet<>());
        }
        animals.get(clazz).add(animal);
    }

    public void printRegistry() {
        for (SortedSet<Animal> animalsOfType : animals.values()) {
            for (int i = 0; i < animalsOfType.size(); i++) {
                Animal animal = animalsOfType.toArray(new Animal[animalsOfType.size()])[i];
                System.out.printf("%d. %s (%s), born on %s, knows: %s\n", i+1, animal.getName(), animal.getClass().getSimpleName(), animal.getBirthDate(), String.join(", ", animal.getCommands()));
            }
        }
    }
}
