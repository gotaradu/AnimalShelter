import java.io.*;
import java.util.*;

import Animals.Animal;
import Shelter.Shelter;
import Staff.*;
import Staff.ENUMs.Gender;
import Staff.ENUMs.WORK;
import Staff.Exeptions.AlreadyExistsException;
import Staff.Exeptions.NotEnoughWorkersException;
import Staff.Exeptions.TeamIsOutOfBoundsException;

import javax.tools.FileObject;

public class Main {
    public static void main(String[] args) throws AlreadyExistsException {

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


//        Owner owner = Owner.getInstance();
//        Manager manager1 = new Manager("Andreea", 20, Gender.WOMEN);
//        Manager manager2 = new Manager("Elena", 20, Gender.WOMEN);
//        try {
//            owner.hireManager(manager1);
//            owner.hireManager(manager2);
//        } catch (AlreadyExistsException alreadyExistsException) {
////            System.out.println(alreadyExistsException.getMessage());
//        }
////        System.out.println(owner.getManagerMap().size());
////        System.out.println(owner.getName());
//
//        for (Map.Entry<String, Manager> entry : owner.getManagers().entrySet()) {
////            System.out.println(entry.getValue().getName());
////            System.out.println(entry.getKey());
//        }

//        try {
//            FileOutputStream fileOutputStream = new FileOutputStream(new File("data.txt"));
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
//
//            objectOutputStream.writeObject(worker1);
//            objectOutputStream.writeObject(worker2);
//        } catch (Exception e) {
//            e.printStackTrace();
////        }
//        try {
//            FileInputStream fileInputStream = new FileInputStream(new File("data.txt"));
//            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
//
//            Worker worker1 = (Worker) objectInputStream.readObject();
//            Worker worker2 = (Worker) objectInputStream.readObject();
//
//            System.out.println(worker1);
//            System.out.println(worker2);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

        Owner owner = Owner.getInstance();

        Manager manager1 = new Manager("Radu", 23, Gender.MAN);
        Manager manager2 = new Manager("Andreea", 20, Gender.WOMEN);

        Worker worker1 = new Worker("Worker1", 23, Gender.MAN, WORK.CLEAN);
        Worker worker2 = new Worker("Worker2", 22, Gender.MAN, WORK.CLEAN);
        Worker worker3 = new Worker("Worker3", 21, Gender.MAN, WORK.CLEAN);
        Worker worker4 = new Worker("Worker4", 20, Gender.MAN, WORK.REPAIR);
        Worker worker5 = new Worker("Worker5", 19, Gender.MAN, WORK.REPAIR);
        Worker worker6 = new Worker("Worker6", 18, Gender.MAN, WORK.REPAIR);

        Volunteer volunteer1 = new Volunteer("Volunteer1", 15, Gender.MAN, WORK.CLEAN);
        Volunteer volunteer2 = new Volunteer("Volunteer2", 14, Gender.MAN, WORK.CLEAN);
        Volunteer volunteer3 = new Volunteer("Volunteer3", 16, Gender.MAN, WORK.CLEAN);
        Volunteer volunteer4 = new Volunteer("Volunteer4", 15, Gender.MAN, WORK.REPAIR);
        Volunteer volunteer5 = new Volunteer("Volunteer5", 18, Gender.MAN, WORK.REPAIR);
        Volunteer volunteer6 = new Volunteer("Volunteer6", 20, Gender.MAN, WORK.REPAIR);

        owner.hireManager(manager1);
        owner.hireManager(manager2);
        System.out.println(owner.getManagers());

        manager1.addWorkerToMap(worker1);
        manager1.addWorkerToMap(worker2);
        manager1.addWorkerToMap(worker3);

        manager2.addWorkerToMap(worker4);
        manager2.addWorkerToMap(worker5);
        manager2.addWorkerToMap(worker6);

        System.out.println(owner.getWorkerMap());

        manager1.addVolunteerToMap(volunteer1);
        manager1.addVolunteerToMap(volunteer2);
        manager1.addVolunteerToMap(volunteer3);
        owner.addVolunteerToMap(volunteer4);
        owner.addVolunteerToMap(volunteer5);
        manager2.addVolunteerToMap(volunteer6);

        System.out.println(owner.getVolunteerMap());


        try {
            manager1.createTeamForWork(WORK.CLEAN, manager1, 3);
        } catch (TeamIsOutOfBoundsException teamIsOutOfBoundsException) {
            System.out.println(teamIsOutOfBoundsException.getMessage());
        } catch (NotEnoughWorkersException notEnoughWorkersException) {
            System.out.println(notEnoughWorkersException.getMessage());
        }

        System.out.println(manager1.getTeamsOwned().toString());

        Shelter shelter = Shelter.getInstance();

        System.out.println(shelter);

        Animal animal = new Animal("Dog1", 2, true, new Date(), 14, 98);

        System.out.println(animal);

        owner.feedAnimals(50);
    }
}
