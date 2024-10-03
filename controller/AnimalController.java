package controller;

import model.Animal;
import model.DB.DataBase;
import model.impl.Camel;
import model.impl.Cat;
import model.impl.Dog;
import model.impl.Donkey;
import model.impl.Hamster;
import model.impl.Horse;
import service.AnimalService;

public class AnimalController {
    private AnimalService as = new AnimalService();

    public void addAnimal(Animal animal) {
        as.addAnimal(animal);
    }

    public void showAllAnimals() {
        as.showAllAnimals();
    }

    public void showCommands(String name) {
        as.showCommands(name);
    }

    public void teachCommand(String name, String command) {
        as.teachCommand(name, command);
    }

    private Animal findAnimalByName(String name) {
        return as.findAnimalByName(name);
    }

    public Animal createAnimal(String type, String name, String birthDate) {
        return as.createAnimal(type, name, birthDate);
    }
}
