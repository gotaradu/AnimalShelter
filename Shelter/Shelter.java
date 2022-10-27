package Shelter;

import Animals.Animal;
import Animals.Cat;
import Staff.Exeptions.CantBeAdoptedException;
import Staff.Owner;

import java.util.ArrayList;
import java.util.Date;
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
    private static ArrayList<Adoption> adoptions = new ArrayList<>();

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
        return shelter;
    }

    public static double getFoodQuantity() {
        return foodQuantity;
    }

    public static void setFoodQuantity(double foodQuantity) {
        Shelter.foodQuantity = foodQuantity;
    }

    public static void addFood(double quantity) {
        Shelter.foodQuantity += quantity;
    }

    public static void removeAnimal(Animal animal, Client client) throws CantBeAdoptedException {
        //TODO implement this
        // allow remove Animal only if its adoptable and has a client and only for manager and owner
        if (animal.isCanBeAdopted() && client.getWantsToAdopt()) {
            adoptions.add(new Adoption(animal, new Date()));
            animals.remove(animal);
        } else throw new CantBeAdoptedException("This dog can't be adopted");
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

    @Override
    public String toString() {
        return "\n" + "Shelter[{" + "\n" + "Owner: " + "\n" + owner.toString() + "\n" + "Managers: " + "\n" + owner.getManagers().toString() +
                "\n" + "Workers: " + "\n" + owner.getWorkerMap().toString() + "\n" + "Volunteers: " + "\n" + owner.getVolunteerMap().toString() + "\n" + "]";

    }
}
