package lab13112026.parcheggio;
import java.util.*;

public class CompositeIterator implements Iterator{
    Stack<Iterator<Posto>> stack = new Stack<Iterator<Posto>>();

    public CompositeIterator(Iterator iterator){
        stack.push(iterator);
    }

    public Posto next() {
        if(hasNext()) {
            Iterator<Posto> iterator = stack.peek();
            Posto component = iterator.next();
            stack.push(component.createIterator());
        }
    }
}
