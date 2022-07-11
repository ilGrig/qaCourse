package week3;

import java.util.Scanner;

//Дано: двузначное число
//Проверить является ли сумма его цифр двузначным числом и больше ли числа сумма цифр
public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите двузначное число");
        int number = sc.nextInt();

        if (number < 10 || number > 99) {
            System.out.println("Число должно быть двузначным");
            System.exit(0);
        }

        int units = number % 10;
        int decimals = number / 10;

        int sum = units + decimals;
        if (sum > 9) {
            System.out.println("Сумма двузначная");
        }
        else {
            System.out.println("Сумма не двузначная");
        }

        if (sum > number) {
            System.out.println("Сумма цифр больше самого числа");
        }
        else {
            System.out.println("Сумма цифр меньше самого числа");
        }

        System.out.printf("Единицы: %d; Десятки: %d; Сумма цифр: %d\n", units, decimals, sum);
    }
}
