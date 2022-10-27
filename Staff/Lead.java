package Staff;

import Animals.Animal;
import Shelter.Client;
import Shelter.Shelter;
import Staff.ENUMs.Gender;
import Staff.Exeptions.CantBeAdoptedException;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public abstract class Lead implements Employee, Serializable {

    private String name;
    private int age;
    private Gender gender;

    private static Map<String, Worker> workerMap = new HashMap<String, Worker>();
    private static Map<String, Volunteer> volunteerMap = new HashMap<String, Volunteer>();
    private static Map<String, Execute> executeMap = new HashMap<>();

    public Lead() {

    }

    public Lead(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Map<String, Worker> getWorkerMap() {
        return workerMap;
    }

    public Map<String, Volunteer> getVolunteerMap() {
        return volunteerMap;
    }


    public void addExecute(Execute execute) {
        executeMap.put(String.valueOf(execute.hashCode()), execute);
    }

    public void addWorkerToMap(Worker worker) {
        workerMap.put(String.valueOf(worker.hashCode()), worker);
    }

    public void addVolunteerToMap(Volunteer volunteer) {
        volunteerMap.put(String.valueOf(volunteer.hashCode()), volunteer);
    }

    private static void removeWorkerFromMap(Worker worker) {
        workerMap.remove(String.valueOf(worker.hashCode()), worker);
    }

    private static void removeVolunteerFromMap(Volunteer volunteer) {
        volunteerMap.remove(String.valueOf(volunteer.hashCode()), volunteer);
    }

    protected static void removeExecuteWorker(Worker worker) {
        executeMap.remove(String.valueOf(worker.hashCode()));
        removeWorkerFromMap(worker);
    }

    protected static void removeExecuteVolunteer(Volunteer volunteer) {
        executeMap.remove(String.valueOf(volunteer.hashCode()));
        removeVolunteerFromMap(volunteer);
    }


    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lead lead = (Lead) o;
        return age == lead.age && name.equals(lead.name) && gender == lead.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}' + "\n";
    }

    public void allowAdoption(Manager manager, Animal animal, Client client) {
        //TODO implement a better functionality of this method
        try {
            Shelter.removeAnimal(animal, client);
            System.out.println("Animal removed by: " + manager);
        } catch (CantBeAdoptedException cantBeAdoptedException) {
            System.out.println(cantBeAdoptedException.getMessage());
        }
    }

}
