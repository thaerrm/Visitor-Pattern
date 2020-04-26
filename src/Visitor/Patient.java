package Visitor;// This class sets up the properties and the visit methods of the visitor nurse

import Interfaces.Visitor;

public class Patient implements Visitor {

    private String name;

    public Patient(String name) {
        this.name = name;
    }

    // getter method
    public String getName()
    {
        return name;
    }

    // visit method can be overridden for various visitable subjects
    public String visit(Nurse nurse) {
        String studentReport = "Nurse '" + this.getName() + "' did the checkup of the student '"
                + student.getName()
                + "' and found health is in '"
                + student.getHealthStatus() + "' condition \n";

        System.out.println(studentReport);

        return studentReport;
    }

    public String visit(Teacher teacher) {
        String teacherReport = "Nurse '" + this.getName() + "' did the checkup of the teacher '"
                + teacher.getName()
                + "' and found health is in '"
                + teacher.getHealthStatus() + "' condition \n";

        System.out.println(teacherReport);

        return teacherReport;
    }

}