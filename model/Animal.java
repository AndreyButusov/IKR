package IKR.model;

import java.time.LocalDate;

public abstract class Animal {

    protected String name;
    protected LocalDate birthday;
    protected StringBuilder commands;

    public Animal(String name, LocalDate birthday, StringBuilder commands){
        this.name = name;
        this.birthday = birthday;
        this.commands = commands;
    }

    public String getInfo() {
        return String.format("Name: %s date: %d type: %s", this.name, this.birthday, this.getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthday;
    }

    public StringBuilder getCommands() {
        return commands;
    }

    public void addCommand(String command){
        this.commands.append(command);
    }

    public void setCommands(StringBuilder commands) {
        this.commands = commands;
    }

}