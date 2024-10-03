package IKR.model;

import java.sql.Date;

public class PackAnimal extends Animal{

    private boolean canCarryLoad;
    private double maxLoadWeight;

    public PackAnimal(String name, Date birthday, double maxLoadWeight) {
        super(name, birthday);
        this.canCarryLoad = true;
        this.maxLoadWeight = maxLoadWeight;
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
    public void addCommand(String command) {
        if (!this.canCarryLoad && !super.commands.contains(command)) {
            System.out.println("Это животное не может нести такой груз");
        } else {
            super.addCommand(command);
        }
    }
    
}
