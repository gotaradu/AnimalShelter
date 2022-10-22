package Staff.Tests;

import Staff.*;
import Staff.ENUMs.Gender;
import Staff.ENUMs.WORK;
import Staff.Exeptions.NotEnoughVolunteersException;
import Staff.Exeptions.NotEnoughWorkersException;
import Staff.Exeptions.TeamIsOutOfBoundsException;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

public class ManagerTest {
    @Test
    public void testCreateTeam() {

        // create the manager

        Manager manager = new Manager("Radu", 23, Gender.MAN);

        //create workers
        Worker worker1 = new Worker("Worker1", 20, Gender.MAN, WORK.CLEAN);
        Worker worker2 = new Worker("Worker2", 19, Gender.WOMEN, WORK.CLEAN);
        Worker worker3 = new Worker("Worker3", 22, Gender.MAN, WORK.CLEAN);
        Worker worker4 = new Worker("Worker4", 15, Gender.WOMEN, WORK.REPAIR);

        //add worker to map
        manager.addWorkerToMap(worker1);
        manager.addWorkerToMap(worker2);
        manager.addWorkerToMap(worker3);
        manager.addWorkerToMap(worker4);

        //create volunteers

        Volunteer volunteer1 = new Volunteer("Volunteer1", 14, Gender.MAN, WORK.CLEAN);
        Volunteer volunteer2 = new Volunteer("Volunteer2", 44, Gender.MAN, WORK.CLEAN);
        Volunteer volunteer3 = new Volunteer("Volunteer3", 18, Gender.MAN, WORK.CLEAN);
        Volunteer volunteer4 = new Volunteer("Volunteer4", 25, Gender.MAN, WORK.REPAIR);

        //add volunteers to map

        manager.addVolunteerToMap(volunteer1);
        manager.addVolunteerToMap(volunteer2);
        manager.addVolunteerToMap(volunteer3);
        manager.addVolunteerToMap(volunteer4);

        //create the teamHashSet


        Set<Execute> expectedTeamHashSet = new HashSet<>();

        expectedTeamHashSet.add(worker1);
        worker1.setHasTeam(true);
        expectedTeamHashSet.add(volunteer1);
        volunteer1.setHasTeam(true);
        expectedTeamHashSet.add(volunteer2);
        volunteer2.setHasTeam(true);

        Team team = new Team();

//        System.out.println(manager.getWorkerMap().toString());
//        System.out.println(manager.getVolunteerMap().toString());

        try {
            team = manager.createTeamForWork(WORK.CLEAN, manager, 3);
        } catch (TeamIsOutOfBoundsException teamIsOutOfBoundsException) {
            System.out.println(teamIsOutOfBoundsException.getMessage());
        } catch (NotEnoughWorkersException notEnoughWorkersException) {
            System.out.println(notEnoughWorkersException.getMessage());
        }

//        ArrayList<Class> classArrayListExpected = new ArrayList<>();
//        ArrayList<Class> classArrayList = new ArrayList<>();
//        System.out.println(team);
//        System.out.println(team.getTeamMembers().size());
//
//
//        for (Object o : expectedTeamHashSet.toArray()) {
//            Execute e = (Execute) o;
//            classArrayListExpected.add(e.getClass());
//        }
//        System.out.println("-----------------");
//        for (Execute o : team.getTeamMembers()) {
//
//            classArrayList.add(o.getClass());
//
//        }
//
//
//
//        System.out.println(classArrayListExpected);
//        System.out.println(classArrayList);


    }
}
