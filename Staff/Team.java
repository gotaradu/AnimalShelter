package Staff;

import java.util.Set;

public class Team {
    private Manager leader;
    private Set<Execute> teamMembers;

    public Team() {
    }

    public Team(Manager leader, Set<Execute> teamMembers) {
        this.leader = leader;
        this.teamMembers = teamMembers;
    }

    public Manager getLeader() {
        return leader;
    }

    public void setLeader(Manager leader) {
        this.leader = leader;
    }

    public Set<Execute> getTeamMembers() {
        return teamMembers;
    }

    public void setTeamMembers(Set<Execute> teamMembers) {
        this.teamMembers = teamMembers;
    }
}
