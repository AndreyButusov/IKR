package IKR.model;

import java.time.LocalDate;

public class Donkey extends PackAnimal {

    public Donkey(String name, LocalDate birthday, StringBuilder commands, double maxLoadWeight) {
        super(name, birthday, commands, maxLoadWeight);
    }
}