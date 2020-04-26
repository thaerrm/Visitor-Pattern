package Interfaces;

import Visiting.*;

public interface Visitor
{
    public void visit(Nurse nurse);
    public void visit(Doctor doctor);

}
