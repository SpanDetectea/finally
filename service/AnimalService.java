package service;

import model.Animal;
import model.DB.DataBase;
import model.impl.Camel;
import model.impl.Cat;
import model.impl.Dog;
import model.impl.Donkey;
import model.impl.Hamster;
import model.impl.Horse;

public class AnimalService {
    
    public void addAnimal(Animal animal) {
        DataBase.animals.add(animal);
    }

     public void showAllAnimals() {
        if (DataBase.animals.isEmpty()) {
            System.out.println("No animals registered.");
        } else {
            for (Animal animal : DataBase.animals) {
                System.out.println("Name: " + animal.getName() + ", Birth Date: " + animal.getBirthDate());
            }
        }
    }

    public void showCommands(String name) {
        Animal animal = findAnimalByName(name);
        if (animal != null) {
            System.out.println("Commands: " + animal.getCommands());
        } else {
            System.out.println("Animal not found.");
        }
    }

    public void teachCommand(String name, String command) {
        Animal animal = findAnimalByName(name);
        if (animal != null) {
            animal.teachNewCommand(command);
            System.out.println("New command taught.");
        } else {
            System.out.println("Animal not found.");
        }
    }

    public Animal findAnimalByName(String name) {
        for (Animal animal : DataBase.animals) {
            if (animal.getName().equalsIgnoreCase(name)) {
                return animal;
            }
        }
        return null;
    }
    public Animal createAnimal(String type, String name, String birthDate) {
        switch (type.toLowerCase()) {
            case "dog":
                return new Dog(name, birthDate);
            case "cat":
                return new Cat(name, birthDate);
            case "hamster":
                return new Hamster(name, birthDate);
            case "horse":
                return new Horse(name, birthDate);
            case "camel":
                return new Camel(name, birthDate);
            case "donkey":
                return new Donkey(name, birthDate);
            default:
                System.out.println("Unknown animal type. Defaulting to Dog.");
                return new Dog(name, birthDate);
        }
    }
}
