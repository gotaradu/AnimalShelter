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

    public Team createTeamForWork(WORK work, Manager administrator, int noOfMembers) throws TeamIsOutOfBoundsException {
        if (noOfMembers > 3)
            throw new TeamIsOutOfBoundsException(String.valueOf(noOfMembers) + "is too big.Max 3 members allowed");
        else if (noOfMembers <= 2)
            throw new TeamIsOutOfBoundsException(String.valueOf(noOfMembers) + "is too small.Min 2 members allowed");
        else {
            int index = noOfMembers;
            Team team = new Team();
            Set<Execute> teamHashSet = new HashSet<>();
            // first set admin of team
            team.setLeader(administrator);
            // second try adding one worker
            for (Map.Entry<String, Worker> entry : getWorkerMap().entrySet()) {
                //check if member does not have team and if work is ok
                Worker worker = entry.getValue();
                if (!worker.isHasTeam() && worker.getTypeOfWork() == work) {
                    //add worker to new set
                    teamHashSet.add(worker);
                    index--;
                    break;      //break so we have only one worker
                }
            }
            if (index == noOfMembers) {
                System.out.println("Not enough Workers!");
            }
            for (Map.Entry<String, Volunteer> entry : getVolunteerMap().entrySet()) {
                Volunteer volunteer = entry.getValue();
                if (index > 0) {
                    if (!volunteer.isHasTeam() && volunteer.getTypeOfWork() == work) {
                        teamHashSet.add(volunteer);
                        index--;
                    } else {
                        System.out.println("Not enough volunteers!Adding more workers");
                        for (Map.Entry<String, Worker> entryWorkers : getWorkerMap().entrySet()) {
                            Worker worker = entryWorkers.getValue();
                            if (!worker.isHasTeam() && worker.getTypeOfWork() == work) {
                                teamHashSet.add(worker);
                                index--;
                            }
                        }
                    }
                }
            }
            if (index > 0) {
                System.out.println("Couldn't create team!Not enough Employees");
                return null;
            }
            team.setTeamMembers(teamHashSet);
            return team;
        }
    }

    // create a team of workers and volunteers that can work together(teams clean faster)

    public Set<Execute> createTeamForWork(WORK work, int powerLevel, int numberOfMembers) {
        updateExecuteMap();
        Set<Execute> executeTeamHashSet = new HashSet<>();

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
    }// random chance of finding possible adoptions

    public Map<String, Execute> updateExecuteMap() {
        System.out.println("updated by " + this.getName());
        executeMap.putAll(getWorkerMap());
        executeMap.putAll(getVolunteerMap());

        return executeMap;
    }

}
