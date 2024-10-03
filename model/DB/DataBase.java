package model.DB;

import java.util.ArrayList;
import java.util.List;

import model.impl.Pets;
import model.Animal;
import model.impl.PackAnimal;

public class DataBase {
    public static final List<Animal> animals = new ArrayList<>();
    
    public static void fillDB() {
        Pets dog = new Pets("John", "22.01.2020");
        Pets cat = new Pets("Kitty", "02.01.2023");
        PackAnimal hamster = new PackAnimal("Bro", "20.10.2020");
        animals.add(dog);
        animals.add(cat);
        animals.add(hamster);
    }
}
