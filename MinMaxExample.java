import java.util.ArrayList;

public class MinMaxExample {
    public static void main(String[] args) {
       ArrayList<Integer> list = new ArrayList<>();

list.add(10);
list.add(2);
list.add(6);
list.add(25);
list.add(72);
list.add(48);




int min = (int) list.get(0);
int max = (int) list.get(0);

for (Integer i: list) {
    if(i < min) min = i; if(i > max) 
        max = i;
}

System.out.println("Минимальное число: " + min);
System.out.println("Максимальное число: " + max);
    }
}
