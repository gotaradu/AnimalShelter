package Animals;

import java.util.Date;
import java.util.Random;

public class Animal {

    private String name;                // name of animal -- set only after shelter
    private String age;                 // age of animal -- might be unknown
    private boolean isAlive = true;     // if it's alive -- true by default
    private Date dateOfComing;          // date of coming
    private double feedingLevel;      // level of feeding
    private int cutenessLevel;          // level of cuteness 0->100

    private boolean canBeAdopted;       // an animal can be adopted if it's adoption rate is over 75%
    private double adoptionRate;        //0->100
    Random random = new Random();

    public Animal(String name, String age, boolean isAlive, Date dateOfComing, double feedingLevel, int cutenessLevel) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
        this.dateOfComing = dateOfComing;
        this.feedingLevel = feedingLevel;
        if (cutenessLevel > 100) this.cutenessLevel = 100;
        else this.cutenessLevel = cutenessLevel;
        this.adoptionRate = random.nextDouble(1, 10) * this.cutenessLevel / 10;
        if (this.getAdoptionRate() >= 45) {
            this.setCanBeAdopted(true);
        }
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

    public boolean isCanBeAdopted() {
        return canBeAdopted;
    }

    public double getAdoptionRate() {
        return adoptionRate;
    }

    public void setAdoptionRate(double adoptionRate) {
        this.adoptionRate = adoptionRate;
    }

    public void setCanBeAdopted(boolean canBeAdopted) {
        this.canBeAdopted = canBeAdopted;
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
