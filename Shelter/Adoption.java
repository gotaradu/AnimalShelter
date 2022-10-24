package Shelter;

import Animals.Animal;

import java.util.Date;

public class Adoption {
    //TODO implement a generator for pdfs files with the data entered

    private static int id = 0;

    private Animal animal;

    private Date dateOfAdoption;

    public Adoption(Animal animal, Date dateOfAdoption) {
        id++;
        this.animal = animal;
        this.dateOfAdoption = dateOfAdoption;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Date getDateOfAdoption() {
        return dateOfAdoption;
    }

    public void setDateOfAdoption(Date dateOfAdoption) {
        this.dateOfAdoption = dateOfAdoption;
    }

    @Override
    public String toString() {
        return "Adoption{" +
                "id=" + id +
                ", animal=" + animal +
                ", dateOfAdoption=" + dateOfAdoption +
                '}';
    }
}
