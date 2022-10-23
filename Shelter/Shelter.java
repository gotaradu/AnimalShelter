package Shelter;

import Animals.Animal;
import Staff.Owner;

import java.util.ArrayList;

public class Shelter {
    private static double foodQuantity; //max 500
    private static double funds;

    private static double cleanlinessLevel;

    private ArrayList<Animal> animals = new ArrayList<>();

    public static double getFunds() {
        return funds;
    }

    public static void setFunds(double funds) {
        Shelter.funds = funds;
    }

    public Shelter(int foodQuantity) {
        Shelter.foodQuantity = foodQuantity;
    }

    public static double getFoodQuantity() {
        return foodQuantity;
    }

    public static void setFoodQuantity(double quantity) {
        Shelter.foodQuantity = quantity;
    }

    public static void addFood(double quantity){
        Shelter.foodQuantity+=quantity;
    }
    public void addAnimalToShelter(Animal animal) {
        animals.add(animal);
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public String getTypeOfAnimal(Animal animal) {
        return String.valueOf(animal.getClass());
    }

}
