import Interfaces.Visitor;
import Interfaces.Visiting;


public class Patient implements Visiting  {
     {
        private String name;
        private int gradeLevel;

        public Patient(String name, int gradeLevel) {
            this.name = name;
            this.gradeLevel = gradeLevel;
        }

        public String getName() {
            return name;
        }

         public int getGradeLevel() {
         return gradeLevel;
     }
         public void accept(Visitor visitor) {
         visitor.visit(this);
    }
}
}