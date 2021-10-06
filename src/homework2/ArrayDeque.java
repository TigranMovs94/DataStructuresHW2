package homework2;

public class ArrayDeque<T> implements DequeADT<T>{
    private T[] data = (T[]) new Object[100];
    private T front ;
    private T back ;

    private int size = 0;


    @Override
    public void pushFront(T value) {

      if(size==data.length){
          doubleCapacity();
      }
        if (isEmpty()) {
            data[0] = value;

        } else {
            int t = size;
            while (t != 0) {
                data[t] = data[t - 1];
                t--;
            }
            front = data[0] = value;
            back=data[size];
        }
        size++;



    }

    @Override
      public void pushBack(T value) {

        if(size==data.length){
            doubleCapacity();
        }
        data[size]=value;
        back=data[size];
        size++;

    }

    @Override
    public boolean popFront() {

        int index =0;

        if(index < size ) {

            for (int i = 0; i < size-1; i++) {
               data[i] = data[i + 1];

            }
            size--;

            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean popBack() {
        int index=size-1;
        if(size>0) {
            if (index >= 0 && index < size) {

                for (int i = index; i < size - 1; i++) {

                    data[i] = data[i + 1];

                }
                size--;
            }
        }
        else {
            return false;
        }
        return true;
    }

    @Override
    public T front() {
        if(data!=null) {
            return data[0];
        }
        throw new RuntimeException("DoubleDeque is empty");
    }

    @Override
    public T back() {
        return data[size-1];
    }

    @Override
    public void empty() {

        front = back= null;
        size=0;

    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(T value) {
       boolean tmp = false;

       for(T temp:data){
           if(temp==value){
               tmp=true;
               break;
           }
       }

        return tmp;
    }


    private void doubleCapacity() {
        if(size == data.length){
            T [] temp = (T[]) new Object[data.length*2];

            for (int i = 0; i <data.length ; i++) {
                temp[i]=data[i];

            }
            data = temp;
        }




    }







}
