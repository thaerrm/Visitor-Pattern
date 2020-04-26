import Interfaces.Visitor;
import Interfaces.Visiting;


public class Patient implements Visiting  {
     {
        private String name;
        private int painLevel;

        public Patient(String name, int painLevel)
         {
            this.name = name;
            this.painLevel = painLevel;
        }
            //get methods for their name and pain scale
        public String getName()
        {
            return name;
        }

         public int getPainLevel()
     {
         return painLevel;
     }
         public void accept(Visitor visitor)
         {
         visitor.visit(this);
    }
}
}