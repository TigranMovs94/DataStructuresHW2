package homework2;/*
Author: Tigran Movsesyan
Email: tigran_movsesyan@edu.aua.am
Last Changed: 08/09/2021
*/

public class ArrayList<T> implements ListADT<T> {

    private T[] arr;
    private int size;

    public ArrayList() {
        arr = (T[]) new Object[10];
        size = 0;

    }


    @Override
    public void addFirst(T elem) {

        doubleCapacity();
        if (isEmpty()) {
            arr[0] = elem;

        } else {
            int t = size;
            while (t != 0) {
                arr[t] = arr[t - 1];
                t--;
            }
            arr[0] = elem;
        }
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
        } else {
            if (index >= 0) {
                doubleCapacity();
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

    public void getAllElements() {


        for (int i = 0; i < size; i++) {

            System.out.println(arr[i]);


        }
    }

    public void removeAt(int index) {

        if (index >= 0 && index < size) {

            for (int i = index; i < size - 1; i++) {

                arr[i] = arr[i + 1];

            }
            size--;
        }

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
        return arr[size];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }


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
}