package week3;

//Дано: трехзначное число;
//Найти: число единиц, десятков, сумму цифр и их произведение

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите трехзачное число");
        int number = sc.nextInt();

        if (number < 100 || number > 999) {
            System.out.println("Число должно быть трехзначным");
            System.exit(0);
        }

        int units = number % 10;
        int decimals = (number / 10) % 10;
        int hundreds = (number / 100) % 100;

        int sum = (units + decimals + hundreds);
        int inc = (units * decimals * hundreds);

        System.out.printf("В числе %d:\nЕдиниц: %d; Десятков: %d; Cотен: %d;\n", number, units, decimals, hundreds);
        System.out.printf("Сумма цифр: %d; Произведение цифр: %d;\n", sum, inc);
    }
}
