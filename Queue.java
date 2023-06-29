import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Queue {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Ввведите, несколько символов в первом числе: ");
    int num1 = sc.nextInt();   
    Deque<String>  dq1 = new ArrayDeque<>(DqCreate(num1));    
    System.out.println(dq1/*  + " " + dq1.size()*/);
    int num11 = IntOut(dq1);
    

    System.out.print("Ввведите, несколько символов во втором числе: ");
    int num2 = sc.nextInt();   
    Deque<String>  dq2 = new ArrayDeque<>(DqCreate(num2));    
    System.out.println(dq2/*  + " " + dq2.size()*/);
    int num22 = IntOut(dq2);

    int summ = num11 + num22;    
    System.out.printf("Сумма чисел %d и %d равна: %d ", num11, num22, summ);
    Deque<Character> dqSum = new ArrayDeque<>(IntInDeq(summ));
    System.out.println(dqSum);

    int mult = num11 * num22;
    System.out.printf("Произведение чисел %d и %d равно: %d ", num11, num22, mult);
    Deque<Character> dqMult = new ArrayDeque<>(IntInDeq(mult));    
    System.out.println(dqMult);
    
    sc.close();
  }

  //Переводим интовые значения, сначала в стринг, а потом в Deque
  public static Deque<Character> IntInDeq(int number){    
    String str = Integer.toString(number);
    Deque<Character> dq = new LinkedList<>();
    for (int i = 0; i < str.length(); i++) {
      dq.add(str.charAt(i));
    }
    return dq;
  }

  // Перевод Deque с обратного порядка, в правильное число через StringBuilder
  public static Integer IntOut(Deque<String> dq){
    StringBuilder sb = new StringBuilder();
    for (int i = dq.size(); i > 0; i--) {   
      sb.append(dq.pollLast());
    }
    //System.out.println(sb);
    int num = Integer.parseInt(sb.toString());
    return num;
  }

  // Создание двусвязного списка в обратном направлении
  public static Deque<String> DqCreate(int num) {
    Deque<String> dq = new ArrayDeque<>();
    Scanner sc = new Scanner(System.in);
    while (num>0) {
      dq.addFirst(sc.nextLine());
      num--;
    }
    return dq;
  }
}
