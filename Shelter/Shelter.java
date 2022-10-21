package Shelter;

import Animals.Animal;
import Staff.Owner;

import java.util.ArrayList;

public class Shelter {
    public static double foodQuantity;

    private ArrayList<Animal> animals = new ArrayList<>();

    public Shelter(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public double getFoodQuantity() {
        return foodQuantity;
    }

    public void setFoodQuantity(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public void addAnimalToShelter(Animal animal){
        animals.add(animal);
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public String getTypeOfAnimal(Animal animal){
        return String.valueOf(animal.getClass());
    }

}
