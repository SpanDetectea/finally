package model;

public class Animal {
    private String name;
    private String birthDate;
    private String commands;

    public Animal(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.commands = "";
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getCommands() {
        return commands;
    }

    public void teachNewCommand(String command) {
        commands += command + ", ";
    }
}