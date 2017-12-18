
import java.util.ArrayList;

public class LinkedQueue implements Queue{

    private ArrayList list;
    
    public LinkedQueue(){
        list = new ArrayList();
    }
    
    @Override
    public Object peekFront() {
        if(list.isEmpty())
            throw new IllegalStateException
                    ("Queue is Empty");
        return list.get(0);
    }

    @Override
    public Object dequeue() {
        if(list.isEmpty())
            throw new IllegalStateException
                    ("Queue is Empty");
        return list.remove(0);
    }

    @Override
    public void enqueue(Object obj) {
        list.add(obj);
    }

    @Override
    public int size() {
        return list.size();
    }
    
}
