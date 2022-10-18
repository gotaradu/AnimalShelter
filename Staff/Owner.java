package Staff;

public final class Owner extends Employee implements EmployeeInterface { // Owner is final and singleton because there can be only 1 owner

    private static Owner owner;

    private Owner() {
    }

    public static Owner getInstance() {                                 // check for synchronization of threads!
        if (owner == null) {
            owner = new Owner();
        }
        return owner;
    }

    @Override
    public void acceptVolunteer() {

    }

    @Override
    public void hireWorker() {

    }

    @Override
    public void hireManager() {

    }
}
