package Visiting;

import Interfaces.Visiting;
import Interfaces.Visitor;

public class Doctor implements Visiting {

        private String name;
        private String checkup;

        public Doctor(String name, String checkup) {
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
