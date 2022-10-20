package Staff;

import Animals.Cat;
import Animals.Dog;

public class Manager extends Lead {
    public Manager(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    @Override
    protected void addWorkerToMap(String key, Worker worker) {
        getWorkerMap().put(key, worker);
    }

    @Override
    protected void addVolunteerToMap(String key, Volunteer volunteer) {
        getVolunteerMap().put(key, volunteer);
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
