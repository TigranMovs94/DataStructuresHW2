package homework2;/*
Author: Tigran Movsesyan
Email: tigran_movsesyan@edu.aua.am
Last Changed: 11/10/2021

Fully implemented, all functions are tested;
*/

public class SingleLinkedList <T> implements ListADT<T> {

    private Node first;
    private Node last;
    private int size;

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

        if(size==0){
            first=last= new Node(value);

        } else {

            node.data = value;
            node.next = null;
            node.next = first;
            first = node;
        }
        size++;



    }

    //AddLast

    @Override
    public void addLast(T value) {
       if (first == null) {
           first = last = new Node(value);

       } else{

           Node node = new Node();
           node.data = value;
           node.next = null;
           Node newFirst = first;

           for (int i = 0; i <size-1 ; i++) {
               newFirst = newFirst.next;
           }
           node.next = newFirst.next;
           newFirst.next = node;



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

        }  else  {
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
        if (index < 0 || index > size) {
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
    public void removeFirst() throws Exception {
        if(first==null){
            return;
        }

        else {
      first = first.next;
      size--;

        }
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
            last=secondLast;
        }
        size--;
    }

    @Override
    public T first() {
        return getElementAt(0);
    }

    @Override
    public T last() {
        return getElementAt(size-1);
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int size() {
        return size;
    }

   //Index of object
    private int indexOf (Object o) {
        int index = 0;
        if (o == null) {
            for ( Node x = first; x != null; x = x.next) {
                if (x.data == null)
                    return index;
                index++;
            }
        } else {
            for (Node x = first; x != null; x = x.next) {
                if (o.equals(x.data))
                    return index;
                index++;
            }
        }
        return -1;
    }


    //Adds an element before certain element

    public boolean addBefore(T valueP, T valueB ) {
        if(contains(valueP)){
           int index= indexOf(valueP);
           addElementAt(valueB,index);
            return true;
        }
        else
            return false;
    }

    // Removes node at given index;
    public  boolean removeAt (int index) throws Exception {

        if (index > size){
            return false;
        }
        if(index==0){
          removeFirst();
        } if(index==size){
            removeLast();
        }
        else {
            Node n = first;
            Node n1;
            for (int i = 0; i < index-1 ; i++) {
                n = n.next;
            }
            n1=n.next;
            n.next=n1.next;

            last=n.next;
            size--;
        }
        return true;

    }

    // Checks if value exists
      private boolean contains(T value) {
          Node currentNode = first;
          Node searchVal = new Node(value);
          while (currentNode != null) {
              if (searchVal.data.equals(currentNode.data)) {
                  return true;
              }
              currentNode = currentNode.next;
          }
          return false;
      }





}
