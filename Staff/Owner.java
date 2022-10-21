package Staff;

import Animals.Cat;
import Animals.Dog;
import Staff.ENUMs.Gender;
import Staff.Exeptions.AlreadyExistsException;
import org.jetbrains.annotations.NotNull;

import java.util.*;

public class Owner extends Lead { // Owner is singleton because there can be only 1 owner

    private static final Owner owner = new Owner("OWNER", 99, Gender.MAN);

    private static Map<String, Owner> ownerMap = new HashMap<String, Owner>();
    private static Map<String, Manager> managerMap = new HashMap<String, Manager>();

    public Owner(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    public static Owner getInstance() {
        return owner;
    }

    public void addManagerToMap(@NotNull Manager manager) throws AlreadyExistsException {
        if (managerMap.containsKey(String.valueOf(manager.hashCode()))) {
            throw new AlreadyExistsException("This manager already exists!");
        } else {
            managerMap.put(String.valueOf(manager.hashCode()), manager);
        }
    }

    public Map<String, Manager> getManagerMap() {
        return managerMap;
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
    public void feedAnimals() {
        System.out.println("Owner feeding animals!");
    }


}
