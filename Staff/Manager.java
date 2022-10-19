package Staff;

public class Manager extends Employee {
    public Manager(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    public void hireWorker(Worker worker) {
        Owner.workersUnderSurveillance.add(worker);
    }

    public void hireVolunteer(Volunteer volunteer) {
        Owner.volunteersUnderSurveillance.add(volunteer);
    }

    @Override
    public void cleanShelter() {

    }

    @Override
    public void feedAnimals() {

    }
}
