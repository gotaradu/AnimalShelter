package Staff;

import java.util.ArrayList;

public class Owner extends Employee { // Owner is singleton because there can be only 1 owner

    private static Owner owner;
    private static String name;
    private static int age;
    private static Gender gender;

    private static ArrayList<Manager> managersUnderSurveillance = new ArrayList<Manager>();

    public static ArrayList<Volunteer> volunteersUnderSurveillance = new ArrayList<Volunteer>();
    public static ArrayList<Worker> workersUnderSurveillance = new ArrayList<Worker>();

    public ArrayList<Worker> getWorkers(){
        return workersUnderSurveillance;
    }

    public ArrayList<Manager> getManagers(){
        return managersUnderSurveillance;
    }
    private Owner() {
        super();
    }

    public static Owner getInstance() {                                 // check for synchronization of threads!
        if (owner == null) {
            owner = new Owner();
        }
        return owner;
    }

    public void acceptVolunteer() {

    }

    public void hireWorker(Worker worker){
        Owner.workersUnderSurveillance.add(worker);
    }

    public void hireManager(Manager manager) {
        Owner.managersUnderSurveillance.add(manager);
    }

    public void addEmployee() {

    }



    public ArrayList<Manager> getManagersUnderSurveillance() {
        return managersUnderSurveillance;
    }

    @Override
    public String toString() {
        return "Owner{}";
    }

    @Override
    public void cleanShelter() {

    }

    @Override
    public void feedAnimals() {

    }
}
