package Staff;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public abstract class Lead implements Employee {

    private String name;
    private int age;
    private Gender gender;

    private static Map<String, Worker> workerMap = new HashMap<String, Worker>();
    private static Map<String, Volunteer> volunteerMap = new HashMap<String, Volunteer>();

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

    protected abstract void addWorkerToMap(String key, Worker worker);

    protected abstract void addVolunteerToMap(String key, Volunteer volunteer);


    public String getName() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lead lead = (Lead) o;
        return age == lead.age && name.equals(lead.name) && gender == lead.gender && Objects.equals(workerMap, lead.workerMap) && Objects.equals(volunteerMap, lead.volunteerMap);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender);
    }
}
