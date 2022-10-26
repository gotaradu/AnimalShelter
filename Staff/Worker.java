package Staff;

import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Staff.ENUMs.Gender;
import Staff.ENUMs.WORK;

import java.util.ArrayList;
import java.util.HashMap;

public class Worker extends Execute {

    public Worker(String name, int age, Gender gender, WORK typeOfWork) {
        super(name, age, gender, typeOfWork);
    }

    @Override
    public void cleanShelter() {

    }

    @Override
    public void playWithDogs(Dog dog) {

    }

    @Override
    public void playWithCats(Cat cat) {

    }

    @Override
    public void feedAnimals(double quantity, ArrayList<Animal> animals) {

    }

    @Override
    public String toString() {
        return "Worker " + super.toString();
    }
}

