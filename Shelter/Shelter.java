package Shelter;

import Animals.Animal;
import Animals.Cat;
import Staff.Owner;

import java.util.ArrayList;
import java.util.Set;

public class Shelter {
    // shelter has a map of all the animals in it
    // shelter can not group together dogs and cats
    // shelter has a number of rooms with different capacities
    // in each room there can be only it's capacity no of dogs/cats (can't mix them)

    private static final Shelter shelter = new Shelter();
    private static double foodQuantity; //max 500
    private static double funds;

    private static Owner owner;

    private static double cleanlinessLevel;

    private static ArrayList<Cage> cages = new ArrayList<>();
    private static ArrayList<Animal> animals = new ArrayList<>();

    public static double getFunds() {
        return funds;
    }

    public static void setFunds(double funds) {
        Shelter.funds = Owner.getFunds();
    }

    public Shelter() {
        Shelter.funds = Owner.getFunds();
        Shelter.foodQuantity = 500;
        Shelter.owner = Owner.getInstance();
        Shelter.cleanlinessLevel = 100;
    }

    public void createCage() {
        cages.add(new Cage());
    }

    public void destroyCage(Cage cage) {
        cages.remove(cage);
    }

    public static Owner getOwner() {
        return Owner.getInstance();
    }

    public static Shelter getInstance() {
        return Shelter.getInstance();
    }

    public static double getFoodQuantity() {
        return foodQuantity;
    }

    public static void addFood(double quantity) {
        Shelter.foodQuantity += quantity;
    }

    public static void removeAnimal(Animal animal, Client client) {
        //TODO implement this
        // allow remove Animal only if its adoptable and has a client and only for manager and owner
    }

    public static void addAnimalToShelter(Animal animal) {
        animals.add(animal);
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public String getTypeOfAnimal(Animal animal) {
        return String.valueOf(animal.getClass());
    }

}
