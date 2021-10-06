package homework2;/*
Author: Tigran Movsesyan
Email: tigran_movsesyan@edu.aua.am
Last Changed: 09/09/2021
*/

public class SingleLinkedList <T> implements ListADT<T> {

    private Node first;
    private Node last;
    int size;

  //Constructor
    public SingleLinkedList() {
        first = last = null;
        size = 0;
    }

    //Node
    private class Node {
        T data;
        Node next;

        public Node(T p) {
            data = p;
            next = null;
        }

        public Node( ) {

        }
    }


//AddFirst
    @Override
    public void addFirst(T value) {
        Node node = new Node();

        node.data = value;
        node.next = null;
        node.next =first;
        first = node;
        size++;

    }

    //AddLast

    @Override
    public void addLast(T value) {
        Node n = new Node(value);
        if (isEmpty()) {
            last = first = n;
        } else {
            last.next = n;
            last = n;
        }
        size++;

    }

    //Add element at certain index
    @Override
    public void addElementAt(T value, int index) {
        Node node = new Node();
        node.data = value;
        node.next = null;
        Node n = first;
        if(index==0) {

            addFirst(value);

        } else {

            for (int i = 0; i < index - 1; i++) {

                n = n.next;

            }
            node.next = n.next;
            n.next = node;

            size++;
        }
    }

   // Get element at certain index
    @Override
    public T getElementAt(int index) {
        if (index < 0 || index >= size) {
            return null;
        }
        Node temp = first;
        while (index  > 0) {
            temp = temp.next;
            index--;
        }
        return temp.data;
    }


    @Override
    public void removeFirst() {
        first = first.next;
        size--;

    }

    @Override
    public void removeLast() {
        if (first == null){
           return;
        }
        if(first.next==null){
            return;
        }
        else {
            Node secondLast = first;
            while (secondLast.next.next!=null){
                secondLast=secondLast.next;
            }
            secondLast.next=null;
        }
        size--;
    }

    @Override
    public T first() {
        return first.data;
    }

    @Override
    public T last() {
        return last.data;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int size() {
        return size;
    }



}
