package IKR.model;

import java.time.LocalDate;

public class PackAnimal extends Animal implements Comparable<PackAnimal>{

    private boolean canCarryLoad;
    private double maxLoadWeight;

    public PackAnimal(String name, LocalDate birthday, StringBuilder commands, double maxLoadWeight) {
        super(name, birthday, commands);
        this.canCarryLoad = true;
        this.maxLoadWeight = maxLoadWeight;
    }

    public PackAnimal(String name, LocalDate birthday, StringBuilder commands) {
        super(name, birthday, commands);
    }

    public void setCanCarryLoad(boolean canCarryLoad) {
        this.canCarryLoad = canCarryLoad;
    }
    
    public boolean canCarryLoad() {
        return canCarryLoad;
    }

    public double getMaxLoadWeight() {
        return maxLoadWeight;
    }

    @Override
    public int compareTo(PackAnimal other) {
        return this.getName().compareTo(other.getName());
    }

    // @Override
    // public void addCommand(String command) {
    //     if (!this.canCarryLoad && !super.commands.contains(command)) {
    //         System.out.println("Это животное не может нести такой груз");
    //     } else {
    //         super.addCommand(command);
    //     }
    // }
    
}
