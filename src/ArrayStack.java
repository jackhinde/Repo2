
import java.util.ArrayList;

public class ArrayStack implements Stack{
    private ArrayList list;

    @Override
    public Object peekTop() {
        if(list.isEmpty())
            throw new IllegalStateException
                    ("Stack is empty");
        
    }

    @Override
    public Object pop() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void push(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
