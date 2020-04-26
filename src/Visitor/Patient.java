package Visitor;// This class sets up the properties and the visit methods of the visitor nurse

import Interfaces.Visitor;
import Visiting.*;

public class Patient implements Visitor {

    private String name;

    public Patient(String name) {
        this.name = name;
    }

    // getter
    public String getName()

    {
        return name;
    }
    //overridden redefining of method
    public void visit(Nurse nurse) {
        String nurseReport = "Patient '" + this.getName() + "' is getting a checkup by Nurse '"
                + nurse.getName()
                + "' and their health was found to be in  '"
                + nurse.getCheckup() + " condition. Awaiting Doctor.";

        System.out.println(nurseReport);

    }

    public void visit(Doctor doctor) {
        String doctorReport = " Patient " + this.getName() + " is getting a checkup by doctor "
                + doctor.getName()
                + " and found health is in "
                + doctor.getCheckup() + " condition ";

        System.out.println(doctorReport);

    }

}