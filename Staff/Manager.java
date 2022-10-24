package Staff;

import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Shelter.Shelter;
import Shelter.Client;
import Staff.ENUMs.Gender;
import Staff.ENUMs.WORK;
import Staff.Exeptions.DepositOfFoodIsFullException;
import Staff.Exeptions.NotEnoughWorkersException;
import Staff.Exeptions.PowerTooHighException;
import Staff.Exeptions.TeamIsOutOfBoundsException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Manager extends Lead {

    private static Map<String, Execute> executeMap = new HashMap<>();

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

    public Team createTeamForWork(WORK work, Manager administrator, int noOfMembers) throws TeamIsOutOfBoundsException, NotEnoughWorkersException {
        if (noOfMembers > 3)
            throw new TeamIsOutOfBoundsException(noOfMembers + " is too big. Max 3 members allowed");
        else if (noOfMembers < 2)
            throw new TeamIsOutOfBoundsException(noOfMembers + " is too small. Min 2 members allowed");
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
//                System.out.println(worker.isHasTeam());
//                System.out.println(index);
                if (!worker.isHasTeam() && worker.getTypeOfWork() == work) {
                    //add worker to new set
                    teamHashSet.add(worker);
                    worker.setHasTeam(true);
                    System.out.println("Added Worker " + worker.getName());
                    index--;
                    break; //break so we have only one worker
                }
            }
            if (index == noOfMembers) {
                throw new NotEnoughWorkersException("Not enough Workers!");

            }
            for (Map.Entry<String, Volunteer> entry : getVolunteerMap().entrySet()) {
                Volunteer volunteer = entry.getValue();
                if (index > 0) {
                    if (!volunteer.isHasTeam() && volunteer.getTypeOfWork() == work) {
                        teamHashSet.add(volunteer);
                        System.out.println("Added Volunteer " + volunteer.getName());
                        volunteer.setHasTeam(true);
                        index--;
                    }
                }
            }
            if (index > 0) {
                System.out.println("Not enough Volunteers! Adding more workers!");
                for (Map.Entry<String, Worker> entryWorkers : getWorkerMap().entrySet()) {
                    Worker worker = entryWorkers.getValue();
                    if (!worker.isHasTeam() && worker.getTypeOfWork() == work) {
                        teamHashSet.add(worker);
                        System.out.println("Added Worker " + worker.getName());
                        worker.setHasTeam(true);
                        index--;
                    }
                }
            }
            if (index > 0) {
                throw new NotEnoughWorkersException("Not enough Workers!");
            }
            team.setTeamMembers(teamHashSet);
            return team;
        }
    }

    // create a team of workers and volunteers that can work together(teams clean faster)

    public Team createTeamForWork(WORK work, Manager administrator, int noOfMembers, int powerLevel) throws TeamIsOutOfBoundsException, NotEnoughWorkersException, PowerTooHighException {
        if (noOfMembers > 3)
            throw new TeamIsOutOfBoundsException(noOfMembers + " is too big. Max 3 members allowed");
        else if (noOfMembers < 2)
            throw new TeamIsOutOfBoundsException(noOfMembers + " is too small. Min 2 members allowed");
        else {
            boolean workerExists = false;
            int fail = 0;
            int index = noOfMembers;
            Team team = new Team();
            Set<Execute> teamHashSet = new HashSet<>();
            // first set admin of team
            team.setLeader(administrator);
            // second try adding one worker
            for (Map.Entry<String, Worker> entry : getWorkerMap().entrySet()) {
                //check if member does not have team and if work is ok
                Worker worker = entry.getValue();
//                System.out.println(worker.isHasTeam());
//                System.out.println(index);
                if (!worker.isHasTeam() && worker.getTypeOfWork() == work) {
                    if (powerLevel >= worker.getPowerLevel()) {
                        //add worker to new set
                        teamHashSet.add(worker);
                        worker.setHasTeam(true);
                        System.out.println("Added Worker " + worker.getName());
                        index--;
                        workerExists = true;
                        break; //break so we have only one worker
                    } else {
                        fail++;
                    }
                }
            }
            if (index == noOfMembers) {
                throw new NotEnoughWorkersException("Not enough Workers!");

            }
            for (Map.Entry<String, Volunteer> entry : getVolunteerMap().entrySet()) {
                Volunteer volunteer = entry.getValue();
                if (index > 0) {
                    if (!volunteer.isHasTeam() && volunteer.getTypeOfWork() == work) {
                        if (powerLevel >= volunteer.getPowerLevel()) {
                            teamHashSet.add(volunteer);
                            System.out.println("Added Volunteer " + volunteer.getName());
                            volunteer.setHasTeam(true);
                            index--;
                        } else {
                            fail++;
                        }
                    }
                }
            }
            if (index > 0) {
                System.out.println("Not enough Volunteers! Adding more workers!");
                for (Map.Entry<String, Worker> entryWorkers : getWorkerMap().entrySet()) {
                    Worker worker = entryWorkers.getValue();
                    if (!worker.isHasTeam() && worker.getTypeOfWork() == work) {
                        if (powerLevel >= worker.getPowerLevel()) {
                            teamHashSet.add(worker);
                            System.out.println("Added Worker " + worker.getName());
                            worker.setHasTeam(true);
                            index--;
                        } else {
                            fail++;
                        }
                    }
                }
            }
            if (index > 0) {
                throw new NotEnoughWorkersException("Not enough Workers or power is to high!");
            } else if (fail >= noOfMembers && workerExists) {
                throw new PowerTooHighException("Try lowering the power");
            }
            team.setTeamMembers(teamHashSet);
            return team;
        }
    }

    public void buyFood(double quantity) throws DepositOfFoodIsFullException {
        if (Shelter.getFoodQuantity() + quantity <= 500)
            Shelter.addFood(quantity);
        else throw new DepositOfFoodIsFullException("Deposit is Full with this quantity! Add a little less...");
    }

    public Map<String, Execute> updateExecuteMap() {
        System.out.println("updated by " + this.getName());
        executeMap.putAll(getWorkerMap());
        executeMap.putAll(getVolunteerMap());

        return executeMap;
    }

    @Override
    public String toString() {
        return "Manager " + super.toString();
    }

}
