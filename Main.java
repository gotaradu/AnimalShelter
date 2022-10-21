import java.util.*;

import Staff.*;
import Staff.ENUMs.Gender;
import Staff.ENUMs.WORK;
import Staff.Exeptions.AlreadyExistsException;

public class Main {
    public static void main(String[] args) {

//        Owner owner = Owner.getInstance();
//        Worker worker1 = new Worker("Radu", 1998, Gender.MAN);
//        owner.hireManager(new Manager("Radu", 23, Gender.MAN));
//
//        owner.hireWorker(new Worker("Andreea", 20, Gender.WOMEN));
//
//        owner.getManagers().get(0).hireWorker(new Worker("Cristian", 25, Gender.MAN));
//
//        for (Worker worker : owner.getWorkers()) {
//            System.out.println("Workers:    " + worker.toString());
//        }
//        for (Manager manager : owner.getManagers()) {
//            System.out.println("Managers:   " + manager.toString());
//        }
//
//        owner.addWorkerToMap(0, worker1);
//
//        for (Map.Entry<Integer, Worker> entry : owner.getWorkerMap().entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
//
//
//


        Owner owner = Owner.getInstance();
        Manager manager1 = new Manager("Andreea", 20, Gender.WOMEN);
        Manager manager2 = new Manager("Elena", 20, Gender.WOMEN);
        try {
            owner.addManagerToMap(manager1);
            owner.addManagerToMap(manager2);
        } catch (AlreadyExistsException alreadyExistsException) {
            System.out.println(alreadyExistsException.getMessage());
        }
        System.out.println(owner.getManagerMap().size());
        System.out.println(owner.getName());

        for (Map.Entry<String, Manager> entry : owner.getManagerMap().entrySet()) {
            System.out.println(entry.getValue().getName());
            System.out.println(entry.getKey());
        }

        Worker worker1 = new Worker("John", 34, Gender.WOMEN, WORK.CLEAN);
        Worker worker2 = new Worker("Doe", 14, Gender.MAN, WORK.CLEAN);


    }
}
