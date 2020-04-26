package Visiting;//visiting nurse

import interfaces.Visiting;
import interfaces.Visitor;

public class Nurse implements Visiting {

    private String name;
    private String experienceYears;

    public Nurse(String name, String healthStatus) {
        this.name = name;
        this.healthStatus = healthStatus;
    }

    // getter methods
    public String getName()
    {
        return name;
    }

    public String getHealthStatus()
    {
        return healthStatus;
    }


    // Method accepts a visitor to visit the teacher
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

}