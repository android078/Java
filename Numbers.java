import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int a = sc.nextInt();
        int sum = 0;
        int b = 1;
        for (int i = 0; i <= a; i++) {
            sum+=i;
            b*=1;
            
        }
        System.out.println(sum);
        System.out.println(b);
        sc.close();
    }

    
}
