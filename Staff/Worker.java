package Staff;

import Animals.Animal;
import Animals.Cat;
import Animals.Dog;
import Staff.ENUMs.Gender;
import Staff.ENUMs.WORK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Worker extends Execute {

    public Worker(String name, int age, Gender gender, WORK typeOfWork) {
        super(name, age, gender, typeOfWork);
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
    public void quit() {
        //TODO worker needs to know from which team he is part on so he can leave it
        // I need a method for getting the team
        // Remove worker from the map of workers and employees
        // a map in which the key is the team object and the value is an array with team members
        // Map<Team,Map<String, Execute> teams = Manager.getTeams();

        getOwnTeam().getTeamMembers().remove(String.valueOf(this.hashCode()));
        this.setHasTeam(false);
        //TODO need to remove the execute from the executeMap in the manager class
        // if the worker is the only one in the team the team should be dissolved !!!!!!!!!!!

    }

    @Override
    public String toString() {
        return "Worker " + super.toString();
    }
}

