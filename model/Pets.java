package IKR.model;

import java.time.LocalDate;

public class Pets extends Animal implements Comparable<Pets>{
    
    private boolean isTrained;

    public Pets(String name, LocalDate birthday, StringBuilder commands, boolean isTrained) {
        super(name, birthday, commands);
        this.isTrained = false;
    }

    public Pets(String name, LocalDate birthday, StringBuilder commands) {
        super(name, birthday, commands);
    }

    public boolean isTrained() {
        return isTrained;
    }
    
    public void setIsTrained(boolean isTrained) {
        this.isTrained = isTrained;
    }

    @Override
    public int compareTo(Pets other) {
        return this.getName().compareTo(other.getName());
    }

    // @Override
    // public void addCommand(String command) {
    //     if (!this.isTrained && !super.commands.contains(command)) {
    //         System.out.println("Этот питомец не обучен выполнять команды");
    //         } else {
    //             super.addCommand(command);
    //         }
    //     }
     }
