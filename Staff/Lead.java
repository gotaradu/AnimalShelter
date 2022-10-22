package Staff;

import Staff.ENUMs.Gender;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public abstract class Lead implements Employee, Serializable {

    private String name;
    private int age;
    private Gender gender;

    private ArrayList<Team> teamsOwned = new ArrayList<>();

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

    public void addWorkerToMap(Worker worker) {
        workerMap.put(String.valueOf(worker.hashCode()), worker);
    }

    public void addVolunteerToMap(Volunteer volunteer) {
        volunteerMap.put(String.valueOf(volunteer.hashCode()), volunteer);
    }

    public ArrayList<Team> getTeamsOwned() {
        return teamsOwned;
    }

    public void setTeamsOwned(ArrayList<Team> teamsOwned) {
        this.teamsOwned = teamsOwned;
    }

    public void addTeamToManager(Team team) {
        teamsOwned.add(team);
    }

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

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
