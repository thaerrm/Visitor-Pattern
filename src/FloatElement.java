import Interfaces.Visitor;

public class FloatElement implements Element {
    public class FloatElement implements Element {
        private Float value;

        public FloatElement(Float value) {
            this.value = value;
        }

        public Float getValue() {
            return value;
        }

        public void accept(Visitor visitor) {
            visitor.visitFloat(this);
        }
    }
}