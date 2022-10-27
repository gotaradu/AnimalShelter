package Staff;

import java.util.Map;
import java.util.Set;

public class Team {

    private String name;
    private Manager leader;
    private Map<String, Execute> teamMembers;

    private int powerOfTeam;

    public Team() {
    }

    public Team(Manager leader, Map<String, Execute> teamMembers) {
        this.leader = leader;
        this.teamMembers = teamMembers;
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

    @Override
    public String toString() {
        return "Team{" +
                "leader=" + leader +
                ", teamMembers=" + "\n" + teamMembers + "\n" +
                ", powerOfTeam=" + powerOfTeam +
                '}' + "\n";
    }
}
