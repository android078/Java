import java.io.FileWriter;
import java.util.Arrays;
import java.util.Random;

public class BubleSort {
    public static Random random = new Random();

  public static void main(String[] args){

    int[] unsorted = randomArray(4, 0, 10);

    printArray(unsorted);
    printArray(bubbleSort(unsorted));
  }

  public static int[] bubbleSort(int[] unsorted){
    try{
      FileWriter writer = new FileWriter("filebubl.txt", true);
      writer.write("---------------------------" + "\n");
      String out1 = Arrays.toString(unsorted);
      writer.write(out1 + "\n");
      for (int i = 0; i < unsorted.length-1; i++) {      
        for (int j = 0; j < unsorted.length-1-i; j++) {        
          if (unsorted[j] > unsorted[j+1]){            
            int temp = unsorted[j];
            unsorted[j] = unsorted[j+1];
            unsorted[j+1] = temp;
            String out2 = Arrays.toString(unsorted);
            writer.write(out2 + "\n");            
          }           
        }
      }      
      writer.close();
    }     
    catch (Exception e){
      System.out.println("Что то пошло не так");
    } 

    return unsorted;
  }

  public static int[] randomArray(int size, int smallest, int largest){
    int[] result = new int[size];
    for (int i = 0; i < result.length; i++) {
      result[i] = random.nextInt(largest-smallest+1);
    }
    return result;
  }

  public static void printArray(int[] toPrint){
    for (int element: toPrint)
      System.out.printf("%d ", element);        
    System.out.println();
  }
}
