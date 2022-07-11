package week3;

//Дано вещественных 3 числа
//Проверить выполнение неравенства a < b < c и b > a > c
//

import java.util.Scanner;

public class Homework4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите число A");
        double a = sc.nextInt();
        System.out.println("Введите число B");
        double b = sc.nextInt();
        System.out.println("Введите число C");
        double c = sc.nextInt();

        int equation = 0;

        if (a < b && b < c) {
            equation = 1;
        }

        if (b > a && a > c) {
            equation = 2;
        }

        switch (equation) {
            case (1) -> { System.out.println("Выполняется неравенство A < B < C"); }
            case (2) -> { System.out.println("Выполняется неравенство B > A > C"); }
            default -> { System.out.println("Ни одно неравнество не выполняется"); }
        }
    }
}
