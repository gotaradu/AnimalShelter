package Staff;

import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Shelter.Client;
import Shelter.Shelter;
import Staff.ENUMs.Gender;
import Staff.Exeptions.AlreadyExistsException;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Owner extends Lead { // Owner is singleton because there can be only 1 owner

    private static final Owner owner = new Owner("OWNER", 99, Gender.MAN, 500);
    private static double funds;

    private static Map<String, Owner> ownerMap = new HashMap<>();
    private static Map<String, Manager> managerMap = new HashMap<>();

    public Owner(String name, int age, Gender gender, double funds) {
        super(name, age, gender);
        Owner.funds = funds;
    }

    public static Owner getInstance() {
        return owner;
    }

    public void hireManager(@NotNull Manager manager) throws AlreadyExistsException {
        if (managerMap.containsKey(String.valueOf(manager.hashCode()))) {
            throw new AlreadyExistsException("This manager already exists!");
        } else {
            managerMap.put(String.valueOf(manager.hashCode()), manager);
        }
    }

    public Map<String, Manager> getManagers() {
        return managerMap;
    }

    public static double getFunds() {
        return funds;
    }

    public static void setFunds(double funds) {
        Owner.funds = funds;
    }

    @Override
    public void cleanShelter() {
        System.out.println("Owner cleaning!??");
    }

    @Override
    public void playWithDogs(Dog dog) {
        System.out.println("Owner playing with dogs...");
    }

    @Override
    public void playWithCats(Cat cat) {
        System.out.println("Owner playing with cats...");
    }

    @Override
    public void quit() {

    }


}


