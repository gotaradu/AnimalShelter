package Staff;

import Animals.Cat;
import Animals.Dog;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Manager extends Lead {

    private static Map<String, Execute> executeMap = new HashMap<String, Execute>();

    public Manager(String name, int age, Gender gender) {
        super(name, age, gender);
    }

    @Override
    public void addWorkerToMap(String key, Worker worker) {
        getWorkerMap().put(key, worker);
        updateExecuteMap();
    }

    @Override
    public void addVolunteerToMap(String key, Volunteer volunteer) {
        getVolunteerMap().put(key, volunteer);
    }

    @Override
    public void cleanShelter() {

    }

    @Override
    public void playWithDogs(Dog dog) {

    }

    @Override
    public void playWithCats(Cat cat) {

    }

    @Override
    public void feedAnimals() {

    }

    public Set<Execute> createTeamForWork(WORK work) {
        Set<Execute> executeTeamHashSet = new HashSet<Execute>();

        for (Map.Entry<String, Execute> entry : executeMap.entrySet()) {
            if (entry.getValue().getTypeOfWork() == work) {
                executeTeamHashSet.add(entry.getValue());
            }
        }
        System.out.println("Team created by: " + this.getName());
        return executeTeamHashSet;

    } // create a team of workers and volunteers that can work together(teams clean faster)

    public Set<Execute> createTeamForWork(WORK work, int powerLevel) {
        Set<Execute> executeTeamHashSet = new HashSet<Execute>();

        for (Map.Entry<String, Execute> entry : executeMap.entrySet()) {
            if (entry.getValue().getTypeOfWork() == work && entry.getValue().getPowerLevel() >= powerLevel) {
                executeTeamHashSet.add(entry.getValue());
            }
        }
        return executeTeamHashSet;
    }

    public void buyFood() {
    }

    public void findAdoption() {
    }// random change of finding possible adoptions

    public Map<String, Execute> updateExecuteMap() {
        System.out.println("updated by " + this.getName());
        executeMap.putAll(getWorkerMap());
        executeMap.putAll(getVolunteerMap());

        return executeMap;
    }

}
