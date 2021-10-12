/*
Author: Tigran Movsesyan
Email: tigran_movsesyan@edu.aua.am
Last Changed: 12/10/2021

Fully implemented, all functions are working fine


*/

package homework2;

public class ArrayList<T> implements ListADT<T> {

    private T[] arr;
    private int size;

    public ArrayList() {
        arr = (T[]) new Object[10];
        size = 0;

    }


    @Override
    public void addFirst(T elem) {


        if (!isEmpty()) {
            int t = size;
            while (t != 0) {
                arr[t] = arr[t - 1];
                t--;
            }
        }
        arr[0] = elem;
        size++;
    }

    @Override
    public void addLast(T value) {

        doubleCapacity();
        arr[size] = value;
        size++;

    }

    @Override
    public void addElementAt(T value, int index) {

        if (index == size || index > size) {
            addLast(value);
            doubleCapacity();

        } else {
            if (index >= 0) {

                T[] temp = (T[]) new Object[arr.length * 2];
                for (int i = 0; i < size; i++) {

                    temp[i] = arr[i];

                }
                arr[index] = value;
                for (int i = index; i < size; i++) {
                    arr[i + 1] = temp[i];

                }
                size++;
            }
        }

    }

    @Override
    public T getElementAt(int index) {
        return arr[index];
    }

    @Override
    public void removeFirst() {
        removeAt(0);
    }

    @Override
    public void removeLast() {
        removeAt(size - 1);
    }

    @Override
    public T first() {
        return arr[0];
    }

    @Override
    public T last() {
        return arr[size - 1];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }


    //Custom functions

    //Double the size of Underlying array
    private void doubleCapacity() {
        if (size == arr.length) {
            T[] temp = (T[]) new Object[arr.length * 2];

            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];

            }
            arr = temp;
        }

    }


    public boolean addBefore(T before, T value) {
        int index = findIndex(arr, before);
        if (contains(before)) {
            if (index == -1) {
                return false;
            }
            if (index > size) {
                return false;
            } else {
                addElementAt(value, index);
            }
            return true;
        } else
            return false;

    }

    //Inner class to find index of
    private int findIndex(T arr[], T t) {

        if (arr == null) {
            return -1;
        }
        int len = arr.length;
        int i = 0;

        while (i < len) {

            if (arr[i] == t) {
                return i;
            } else {
                i = i + 1;
            }
        }
        return -1;
    }


    //Check if array contains given value
    private boolean contains(T value) {

        boolean found = false;
        for (T x : arr) {
            if (x == value) {
                found = true;
                break;
            }
        }
        return found;
    }

    //Print all elements
    public void getAllElements() {

        if(size>0){
            for (int i = 0; i < size; i++) {

            System.out.println(arr[i]);

              }

        }
          else return;
    }

    //Remove element at certain index
    public void removeAt(int index) {

        if (index >= 0 && index < size) {

            for (int i = index; i < size - 1; i++) {

                arr[i] = arr[i + 1];

            }
            size--;
        }

    }

    //Get index of element
    public int getIndexOf(T element) {
        if (contains(element)) {

            return findIndex(arr, element);

        } else
            return -1;

    }

    //Update value
    // checks if array contains the oldValue
    //then gets the index of oldValue
    //and assigns new value to array element under that index;
    public void updateValue(T oldValue, T newValue){
        if(contains(oldValue)) {
            int index = getIndexOf(oldValue);
            arr[index]=newValue;
        }
        else return;
    }


    //Emptying the array
    public void empty(){
        arr= (T[]) new Object[0];
        size=0;
    }










}