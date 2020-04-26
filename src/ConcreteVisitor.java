public class ConcreteVisitor implements Visitor {

    public void visitCollection(Collection collection) {
        Iterator iterator = collection.iterator() while (iterator.hasNext()) {
            Object o = iterator.next();
                if (o instanceof Element)
            }
        }
    }