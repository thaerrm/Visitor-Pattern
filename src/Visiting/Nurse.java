package Visiting;//visiting nurse

import Interfaces.Visiting;
import Interfaces.Visitor;

public class Nurse implements Visiting {

    private String name;
    private String experience;

    public Nurse(String name, String experience) {
        this.name = name;
        this.experience = experience;
    }

    // getter methods
    public String getName()

    {
        return name;
    }

    public String getExperience()

    {
        return experience;
    }



    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }

}