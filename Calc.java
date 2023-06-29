import java.util.Scanner;

public class Calc {
    public static void main(String [] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Введите первое число: ");
        int number1 = sc.nextInt();
        System.out.println("Введите знаки операции + -  / *:");
        char operation;
        System.out.println("Введите второе число: ");
        int number2 = sc.nextInt();
        operation = sc.next().charAt(0);
        int res;
        switch (operation){
            case '+':
            res = number1 + number2;
            System.out.printf("Сумма чисел: %d", res);
            break;
            case '-':
            res = number1 - number2;
            System.out.printf("Разность чисел: %d", res);
            break;
            case '*':
            res = number1 * number2;
            System.out.printf("Произведение чисел: %d", res);
            break;
            case '/':
            res = number1 / number2;
            System.out.printf("Результат деления: %d", res);
            break;
        }
        sc.close();

        
    }
}
