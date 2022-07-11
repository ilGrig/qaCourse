package week3;

//Дано: натуральное число
//Узнать: является ли оно четным
//Оканчивается ли оно на 7

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число больше 0");
        int number = sc.nextInt();
        if (number <= 0 ) {
            System.out.println("Число должно быть больше нуля");
            System.exit(0);
        }

        if (number % 2 == 0) {
            System.out.println("Число четное");
        }
        else {
            System.out.println("Число нечетное");
        }

        if (number % 10 == 7) {
            System.out.println("Число оканчивается на 7");
        }
    }
}
