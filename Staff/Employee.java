package Staff;

import Animals.*;
import Shelter.Shelter;

import java.util.ArrayList;

public interface Employee {

    default void feedAnimals(double quantity, ArrayList<Animal> animals) {
        System.out.println(this + "feeding animals!");
        Shelter.setFoodQuantity(Shelter.getFoodQuantity() - quantity);
        System.out.println("Food left in the shelter before feeding: " + Shelter.getFoodQuantity());
        //TODO create a method to feed all the animals by dividing the quantity equal to each animal
        // no map because there can be two animals with the same feedingLevel
        // returns the food quantity left after feeding
        double quantityForEach = quantity / animals.size();
        int counter = 0;
        for (Animal animal : animals) {

            if (animal.getFeedingLevel() <= 50 - quantityForEach) {
                System.out.println(animal.getFeedingLevel());
                animal.setFeedingLevel(animal.getFeedingLevel() + quantityForEach);
                quantity -= quantityForEach;
                counter++;
            }
        }
//         System.out.println(quantity);
//         System.out.println(Shelter.getFoodQuantity());
        Shelter.setFoodQuantity(Shelter.getFoodQuantity() + quantity);
        System.out.println("Food left in the shelter after feeding: " + Shelter.getFoodQuantity());
        System.out.println("You fed " + counter + " animals!");
    }



    public void cleanShelter();

    public void playWithDogs(Dog dog);

    public void playWithCats(Cat cat);

    public void quit();
    //TODO implement a better functionality for the Owner's quit method
    // public void quit() is different for every subclass. Owner can't quit / instead implement a sellShelter method to other owner
    // be careful at the Singleton implementation
    // if manager quits => destroy the team he created
    // if worker quits => 1 empty space in the team
    // if volunteer leaves => same


}


