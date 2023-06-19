import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        
    

   List <Integer> number = new ArrayList <Integer>();

   number.add(11);
   number.add(45);
   number.add(12);
   number.add(32);
   number.add(36);

   System.out.println("Неотсортированный список: "+number);

   for (Iterator<Integer> iterator = number.iterator(); iterator.hasNext();) {
    Integer numbereven = iterator.next();       
        if (numbereven % 2== 0){
            System.out.println("Четное число:"+ number);
            iterator.remove();
        }    
    }

    Collections.sort(number);
    System.out.println("Отсортированный список: "+number);

 }
}
