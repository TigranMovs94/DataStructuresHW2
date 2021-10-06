package homework2;

import java.io.FileReader;
import java.sql.SQLOutput;
import java.util.Iterator;
import java.util.Map;


//This was for testing purposes, as defined in Homework the real one was written in main function of University class.

public class Main {
    public static void main(String[] args) throws Exception {

        DoubleLinkedListDeque<Integer> col = new DoubleLinkedListDeque<>();

         col.pushFront(10);
         col.pushFront(20);
         col.pushBack(45);

        System.out.println("Front: "+col.front()+" :size: "+col.size());
        System.out.println("Back:  "+col.back()+"  :size: "+col.size());


        System.out.println("============================================================================================");

        ArrayDeque<Integer> arr = new ArrayDeque<>();

        arr.pushFront(10);
        arr.pushFront(20);
        arr.pushBack(45);

        int prev=arr.back();
        System.out.println("Previous  "+ prev);
        arr.popBack();

        System.out.println(arr.contains(45));

        System.out.println("Front: "+arr.front()+" :size: "+arr.size());
        System.out.println("Back:  "+arr.back()+"  :size: "+arr.size());





            }


        }

