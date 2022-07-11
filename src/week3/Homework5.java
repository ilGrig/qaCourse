package week3;

//Дано два числа
//Если квадратный корень второго числа меньше первого числа, то второе число увеличить в пять раз

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите первое число");
        double a = sc.nextInt();
        System.out.println("Введите второе число");
        double b = sc.nextInt();

        double sqrtB = Math.sqrt(b);
        System.out.printf("Корень второго числа: %.1f\n", sqrtB);

        if (sqrtB < a) {
            b *= 5;
            System.out.printf("Второе число увеличено в пять раз и теперь %.1f", b);
        }
        else {
            System.out.println("Корень второго числа больше первого, поэтому увеличивать не нужно");
        }
    }
}
