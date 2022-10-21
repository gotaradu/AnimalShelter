package Staff;

import Animals.*;

public interface Employee {

    public void feedAnimals();

    public void cleanShelter();

    public void playWithDogs(Dog dog);

    public void playWithCats(Cat cat);

    //TODO implement a better functionality for the Owner's quit method
    // public void quit() is different for every subclass. Owner can't quit / instead implement a sellShelter method to other owner
    // be careful at the Singleton implementation
    // if manager quits => destroy the team he created
    // if worker quits => 1 empty space in the team
    // if volunteer leaves => same


}


