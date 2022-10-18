package Animals;

import java.util.Date;

public class Animal {

    private String name;                // name of animal -- set only after shelter
    private String age;                 // age of animal -- might be unknown
    private boolean isAlive = true;     // if it's alive -- true by default
    private Date dateOfComing;          // date of coming
    private double feedingLevel = (Math.random() + 0.1) * 9;        // level of feeding
    private int cutenessLevel;          // level of cuteness


    public Animal(String name, String age, boolean isAlive, Date dateOfComing, double feedingLevel, int cutenessLevel) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
        this.dateOfComing = dateOfComing;
        this.feedingLevel = feedingLevel;
        this.cutenessLevel = cutenessLevel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public Date getDateOfComing() {
        return dateOfComing;
    }

    public double getFeedingLevel() {
        return feedingLevel;
    }

    public int getCutenessLevel() {
        return cutenessLevel;
    }

    public void eat(double quantity) {
        if (quantity >= 0) {
            if (this.feedingLevel > 0 && this.feedingLevel < 100) {
                this.feedingLevel += quantity;
                System.out.println("Such a great food!");
            } else if (this.feedingLevel >= 100) {
                System.out.println("Animal doesn't want to eat");
            } else {
                System.out.println("Animal is dead!");
            }
        } else {
            System.out.println("Error in feeding system.");
        }
    }

}
