package IKR.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public abstract class Animal {

    protected String name;
    protected Date birthday;
    protected List<String> commands;

    public Animal(String name, Date birthday){
        this.name = name;
        this.birthday = birthday;
        this.commands = new ArrayList<>();
    }

    public String getInfo() {
        return String.format("Name: %s date: %d type: %s", this.name, this.birthday, this.getClass().getSimpleName());
    }

    public String getName() {
        return name;
    }

    public Date getBirthDate() {
        return birthday;
    }

    public List<String> getCommamds() {
        return commands;
    }

    public void addCommand(String command){
        this.commands.add(command);
    }

}