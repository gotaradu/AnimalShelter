import java.util.Date;

import Animals.*;
import Shelter.*;
import Staff.*;

public class Main {
    public static void main(String[] args) {

        Date date = new Date();
        Animal animal = new Animal("Rex", "5", true, date, 15, 65);

        Shelter shelter = new Shelter(100);
        Owner owner = Owner.getInstance();
        double remainQuantity = shelter.getFoodQuantity();

        owner.hireManager(new Manager("Radu", 23, Gender.MAN));

        owner.hireWorker(new Worker("Andreea", 20, Gender.WOMEN));

        owner.getManagers().get(0).hireWorker(new Worker("Cristian", 25, Gender.MAN));

        for (Worker worker : owner.getWorkers()) {
            System.out.println("Workers:    " + worker.toString());
        }
        for (Manager manager : owner.getManagers()) {
            System.out.println("Managers:   " + manager.toString());
        }


    }
}
