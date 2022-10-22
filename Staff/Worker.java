package Staff;

import Animals.Cat;
import Animals.Dog;
import Staff.ENUMs.Gender;
import Staff.ENUMs.WORK;

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
    public void feedAnimals() {

    }

    @Override
    public String toString() {
        return "Worker " + super.toString();
    }
}

