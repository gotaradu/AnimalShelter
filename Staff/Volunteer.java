package Staff;

import Animals.Cat;
import Animals.Dog;

public class Volunteer extends Execute{
    public Volunteer(String name, int age, Gender gender, WORK typeOfWork) {
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
}
