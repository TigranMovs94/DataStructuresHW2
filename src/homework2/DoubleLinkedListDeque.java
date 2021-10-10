package homework2;

public class DoubleLinkedListDeque<T> implements DequeADT<T> {

    private Node front;
    private Node back;
    private int length;


    public DoubleLinkedListDeque(){

    }

     // Private class Node, which stores generic data, reference to next node
     // and reference to previous node
    private class Node {

        public T data;
        public Node next;
        public Node prev;

        Node (T data){
            this.data=data;
        }

        Node(){
            data=null;
            next=null;
            prev=null;
        }

    }

    @Override
    public void pushFront(T value) {
        if(length==0){
            front = new Node(value);
            back=front;
        }
        else {
            Node temp = new Node(value);
            temp.next= front;
            front = temp;

        }
        length++;
    }

    @Override
    public void pushBack(T value) {
        if(length==0){
            back = new Node(value);
            front=back;
        }
        else {
            Node temp = new Node(value);
            temp.prev= back;
            back = temp;

        }
        length++;
    }

    @Override
    public boolean popFront() {
        if(length > 0) {
            T temp = front.data;
            front = front.next;
            if(front != null){
                front.prev=null;

            }

            length--;
            return true;


        }
        return false;
    }

    @Override
    public boolean popBack() {
        if(length > 0) {
            T temp = back.data;
            back = back.prev;

            if(back!=null){
                back.next=null;
                return true;
            }

            length--;
        }
        return false;
    }





    @Override
    public T front() {

        return front.data;
    }

    @Override
    public T back() {


        return back.data;


    }

    @Override
    public void empty() {
        front = back =null;
        length=0;

    }

    @Override
    public boolean isEmpty() {

        return length==0;
    }

    @Override
    public int size() {
        return length;
    }

    @Override
    public boolean contains(T value) {

        Node temp = front;
        int pos=0;
        while (temp.data!=value && temp.next!=null){

            pos++;

            temp=temp.next;
        }

        return temp.data == value;

    }





    public T[] getAll(){
        if(length==0){
            return null;
        }
        T[] temp = (T[]) new Object[length];
        Node current = front;

        temp[0]=front.data;

        for (int i = 1; i <length ; i++) {

            current= current.next;
            temp[i]=current.data;

        }
        return temp;
    }
}
