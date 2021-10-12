package homework2;/*
Author: Tigran Movsesyan
Email: tigran_movsesyan@edu.aua.am
Last Changed: 08/09/2021
*/

public interface ListADT <T>{
   public void addFirst(T elem);
   public void addLast(T elem);
   public void  addElementAt(T elem, int index);
   public T  getElementAt(int index);
   public void  removeFirst() throws Exception;
   public void  removeLast();
   public  T first();
   public T last();
   public boolean isEmpty();
   public int size();


}
