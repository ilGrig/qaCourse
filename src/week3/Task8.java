package week3;

//Дано: два числа;
//Если первое больше второго, то уменьшить первое вдвое

import java.util.Scanner;

public class Task8 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число");
        int firstNumber = sc.nextInt();
        System.out.println("Введите второе число");
        int secondNumber = sc.nextInt();

        check(firstNumber, secondNumber);
    }

    public static int check(int first, int second) {
        if (first > second) {
            first = first / 2;
            System.out.println("Первое число больше второго и уменьшено вдвое. Теперь: " + first);
        }
        System.out.println("Первое число меньше второго");
        return first;
    }
}
