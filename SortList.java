import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {
    public static void main(String[] args) {
        
    

   List <Integer> number=new ArrayList <Integer>();

   number.add(11);
   number.add(45);
   number.add(12);
   number.add(32);
   number.add(36);

   System.out.println("Unsorted List: "+number);

   for (int i=0;i<number.size();i++){      
       int even=number.get(i)%2;       
        if (even==0){
            System.out.println("This is Even Number:"+ number.get(i));
            number.remove(i);
        }    
    }

    Collections.sort(number);
    System.out.println("Sorted List: "+number);

 }
}
