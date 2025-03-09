import java.util.Iterator;
import java.util.NoSuchElementException;

public class ArrayIterator<T> implements Iterator<T> {
    private T[] data;
    private int index = 0;
    private int size; 

    ArrayIterator(T[] d, int s){
        data = d;
        size = s; 
    }

    @Override
    public boolean hasNext() {
        return index < size;
    }

    @Override
    public T next() {
        if(index==size){
            throw new NoSuchElementException();
        }    
        T item = (T) data[index];
        index++;
        return item;
    }
}
