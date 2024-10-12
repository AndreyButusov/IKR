package IKR.model;

import java.time.LocalDate;

public class Horse extends PackAnimal {

    public Horse(String name, LocalDate birthday, StringBuilder commands, double maxLoadWeight) {
        super(name, birthday, commands, maxLoadWeight);
    }
    
}
