package Interfaces;

import Visiting.*;


public interface Visitor
{
    public String visit(Nurse nurse);
    public String visit(Doctor doctor);

}
