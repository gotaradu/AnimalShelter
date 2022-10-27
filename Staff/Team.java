package Staff;

import java.util.Map;
import java.util.Set;

public class Team {

    private String name;
    private Manager leader;
    private Map<String, Execute> teamMembers;

    private int noOfWorkers;
    private int noOfVolunteers;

    private int powerOfTeam;

    public Team() {
    }

    public Team(Manager leader, Map<String, Execute> teamMembers) {
        this.leader = leader;
        this.teamMembers = teamMembers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfWorkers() {
        return noOfWorkers;
    }

    public void incrementWorkers() {
        this.noOfWorkers++;
    }

    public int getNoOfVolunteers() {
        return noOfVolunteers;
    }

    public void incrementVolunteers() {
        this.noOfVolunteers++;
    }

    public void setPowerOfTeam(int powerOfTeam) {
        this.powerOfTeam = powerOfTeam;
    }

    public Manager getLeader() {
        return leader;
    }

    public void setLeader(Manager leader) {
        this.leader = leader;
    }

    public Map<String, Execute> getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(Map<String, Execute> teamMembers) {
        this.teamMembers = teamMembers;
    }

    public int getPowerOfTeam() {
        return powerOfTeam;
    }

    public Team deleteTeam(){
        Team team = null;
        return team;
    }
    @Override
    public String toString() {
        return "Team{" +
                "leader=" + leader +
                ", teamMembers=" + "\n" + teamMembers + "\n" +
                ", powerOfTeam=" + powerOfTeam +
                '}' + "\n";
    }


}
