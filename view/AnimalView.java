package view;

import java.util.Scanner;

import controller.AnimalController;
import model.DB.DataBase;

public class AnimalView {
    private AnimalController controller = new AnimalController();

    public void start() {
        DataBase.fillDB();
        Scanner scanner = new Scanner(System.in);
        try (Counter counter = new Counter()) {
            while (true) {
                System.out.println("Menu:");
                System.out.println("1. Register new animal");
                System.out.println("2. Show all animals");
                System.out.println("3. Show animal commands");
                System.out.println("4. Teach animal new command");
                System.out.println("5. Exit");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.println("Enter animal type (Dog, Cat, Hamster, Horse, Camel, Donkey):");
                        String type = scanner.nextLine();
                        System.out.println("Enter name:");
                        String name = scanner.nextLine();
                        System.out.println("Enter birth date:");
                        String birthDate = scanner.nextLine();
                        controller.addAnimal(controller.createAnimal(type, name, birthDate));
                        counter.add();
                        break;
                    case 2:
                        controller.showAllAnimals();
                        break;
                    case 3:
                        System.out.println("Enter animal name:");
                        String animalName = scanner.nextLine();
                        controller.showCommands(animalName);
                        break;
                    case 4:
                        System.out.println("Enter animal name:");
                        String teachName = scanner.nextLine();
                        System.out.println("Enter new command:");
                        String newCommand = scanner.nextLine();
                        controller.teachCommand(teachName, newCommand);
                        break;
                    case 5:
                        System.out.println("Exiting...");
                        return;
                    default:
                        System.out.println("Invalid option.");
                        break;
                }
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
