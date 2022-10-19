package Staff;

public abstract class Employee {
    private String name;
    private int age;
    private Gender gender;

    public Employee() {

    }

    public Employee(String name, int age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public abstract void feedAnimals();

    public abstract void cleanShelter();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
