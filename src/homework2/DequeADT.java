package homework2;

public interface DequeADT <T> extends CollectionADT<T> {

    public void pushFront(T value);
    public void pushBack(T value);
    boolean  popFront();
    boolean  popBack();
    T front();
    T back();
}
