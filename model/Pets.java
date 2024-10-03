package IKR.model;

import java.sql.Date;

import IKR.model.Animal;

public class Pets extends Animal{
    
    private boolean isTrained;

    public Pets(String name, Date birthday) {
        super(name, birthday);
        this.isTrained = false;
    }

    public boolean isTrained() {
        return isTrained;
    }
    
    public void setIsTrained(boolean isTrained) {
        this.isTrained = isTrained;
    }

    @Override
    public void addCommand(String command) {
        if (!this.isTrained && !super.commands.contains(command)) {
            System.out.println("Этот питомец не обучен выполнять команды");
            } else {
                super.addCommand(command);
            }
        }
    }
