package Staff;

public abstract class Execute implements Employee {

    private String name;
    private int age;
    private Gender gender;
    private int exhaustionLevel;
    private int happinessLevel;

    public Execute() {
    }

    public Execute(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
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

}
