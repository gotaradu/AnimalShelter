import java.util.Date;

import Animals.Animal;
import Shelter.*;
import Animals.*;

public class Main {
    public static void main(String[] args) {

        Date date = new Date();
        Animal animal = new Animal("Rex", "5", true, date, 15, 65);

        Shelter shelter = new Shelter(100);

        double remainQuantity = shelter.getFoodQuantity();

//        System.out.println(shelter.getFoodQuantity());

        animal.eat(15);


//        System.out.println(animal.getFeedingLevel());
//        System.out.println(animal.getName());
//
//        shelter.addAnimalToShelter(animal);
//
//        System.out.println(shelter.getAnimals().get(0).getName());
//        System.out.println(shelter.getTypeOfAnimal(animal));
    }
}
