package homework2;

public class ArrayQueue<T>  {

    T [] arr;
    int j;
    int size;

    ArrayQueue(){
        arr = (T[])new Object[10];
        size=0;
    }


    //Add elemnt
    public boolean add(T x){
        if(size+1>arr.length)
            resize();
        arr[(j+size)%arr.length]=x;
        size++;

        return true;
    }

    //Remove element

    T remove () throws NoSuchFieldException {

        if (size == 0)
            throw new NoSuchFieldException();
        T x = arr[j];
        j = (j + 1) % arr.length;
        size--;
        if (arr.length >= 3 * size)

            resize();

        return x;

    }


    //Add elementAt

    public  void addElementAt(T o, int index){

        for(int i = j+size; i>j+index; i--){
            arr[i%arr.length]= arr[(i-1)%arr.length];
        }
        arr[(j+index)%arr.length]=o;
    }


    //Double the size of Underlying array
    private void resize() {
        T [] b = (T[]) new Object[Math.max(1, size*2)] ;
        for (int k = 0; k <size ; k++) {
            b[k]=arr[(j+k)%arr.length];
            arr=b;
            j=0;

        }
    }


    public  void getAll(){

        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);

        }

    }


    }





