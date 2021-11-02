import java.util.LinkedList;
import java.util.List;

public class Bag<T> {
    private List<T> bag = new LinkedList<T>();

    public void add(T entity ){
        bag.add(entity);
    }

    public void remove(T entity){
        bag.remove(entity);
    }

    public void  clear(){
        bag.clear();
    }

}
