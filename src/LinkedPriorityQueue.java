import java.util.ArrayList;

public class LinkedPriorityQueue implements PriorityQueue{

    public ArrayList list[];

    public LinkedPriorityQueue(int levels){
        list = new ArrayList[levels];
        for (int i = 0; i < levels; i++) {
            list[i] = new ArrayList();
        }
    }
    
    @Override
    public void enqueue(Object o, int priority) {
        list[priority].add(o);
    }

    @Override
    public Object peekFront() {
        if(hasData()==false)
            throw new IllegalStateException
                    ("Queue is empty");
        for (int i = 0; i < list.length; i++) {
            if(list[i].size() > 0)
                return list[i].get(0);
        }
        throw new IllegalStateException("Queue is empty");
    }

    @Override
    public Object dequeue() {
        if(hasData()==false)
            throw new IllegalStateException
                    ("Queue is empty");
        for (int i = 0; i < list.length; i++) {
            if(list[i].size() > 0)
                return list[i].remove(0);
        }
        throw new IllegalStateException("Queue is empty");
    }

    @Override
    public void enqueue(Object obj) {
        throw new IllegalStateException("Must give a priority");
    }

    @Override
    public int size() {
        return list.length; // number of priorities;
    }
    
    public boolean hasData(){
        for (int i = 0; i < list.length; i++) {
            if(list[i].size() > 0) return true;
        }
        return false;
    }
    
}
