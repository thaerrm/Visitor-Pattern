package Visiting;//visiting nurse

import Interfaces.Visiting;
import Interfaces.Visitor;

public class Nurse implements Visiting {

    private String name;
    private String checkup;

    public Nurse(String name, String checkup) {
        this.name = name;
        this.checkup = checkup;
    }

    // getter methods
    public String getName()


    {
        return name;
    }

    public String getCheckup()


    {
        return checkup;
    }



    public void accept(Visitor visitor)

    {
        visitor.visit(this);
    }

}