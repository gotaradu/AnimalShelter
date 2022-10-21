package Staff;

import java.util.Objects;

public abstract class Execute implements Employee {

    private String name;
    private int age;
    private Gender gender;
    private int exhaustionLevel;
    private int happinessLevel;

    private boolean hasTeam = false;

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

    private int powerLevel;

    private WORK typeOfWork;

    public Execute() {
    }

    public Execute(String name, int age, Gender gender, WORK typeOfWork) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.typeOfWork = typeOfWork;
    }

    public int getExhaustionLevel() {
        return exhaustionLevel;
    }

    public void setExhaustionLevel(int exhaustionLevel) {
        this.exhaustionLevel = exhaustionLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(int happinessLevel) {
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
}
