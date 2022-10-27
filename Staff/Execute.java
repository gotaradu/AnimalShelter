package Staff;

import Staff.ENUMs.Gender;
import Staff.ENUMs.WORK;

import java.io.Serializable;
import java.util.Objects;

public abstract class Execute implements Employee, Serializable {

    private String name;
    private int age;
    private Gender gender;
    private int exhaustionLevel;
    private int happinessLevel;

    private boolean hasTeam = false;

    private int powerLevel;

    private WORK typeOfWork;

    private Team ownTeam;

    public Execute() {
    }

    public Execute(String name, int age, Gender gender, WORK typeOfWork) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.typeOfWork = typeOfWork;
        this.ownTeam = null;
    }

    public int getExhaustionLevel() {
        return exhaustionLevel;
    }

    public void setExhaustionLevel(int exhaustionLevel) {
        //TODO implement a better functionality so the exhaustionLevel can't be over 100 or under 0
        // if exhaustionLevel << 1 ==> quit()
        this.exhaustionLevel = exhaustionLevel;
    }

    public Team getOwnTeam() {
        return ownTeam;
    }

    public void setOwnTeam(Team ownTeam) {
        this.ownTeam = ownTeam;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(int happinessLevel) {
        //TODO happinessLevel rises with the time being on hold ( 1 min-> 1 point)
        // Implement a better functionality so the happiness doesn't exceed bounds 0->100
        // If happinessLevel<0 quit();
        this.happinessLevel = happinessLevel;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public WORK getTypeOfWork() {
        return typeOfWork;
    }

    public boolean isHasTeam() {
        return hasTeam;
    }

    public void setHasTeam(boolean hasTeam) {
        this.hasTeam = hasTeam;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public void getTeam(Execute execute) {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Execute execute = (Execute) o;
        return age == execute.age && name.equals(execute.name) && gender == execute.gender;
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
                ", hasTeam=" + hasTeam +
                ", typeOfWork=" + typeOfWork +
                '}' + "\n";

    }
}
