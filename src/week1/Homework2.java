package week1;

import java.util.Scanner;
//Дано двузначное число
//Найти: кол-во единиц, десятков, сумму чисел в нем, произведение чисел
public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите двузначное число");

        int userNumber = sc.nextInt();
        if (userNumber < 10 || userNumber > 99) {
            System.out.println("Число должно быть двузначным");
            System.exit(0);
        }

        int units = userNumber % 10;
        int decimals = userNumber / 10;

        int sum = units + decimals;
        int increase = units * decimals;

        System.out.printf("Число: %d, Единиц: %d, Десятков: %d\n", userNumber, units, decimals);
        System.out.printf("Сумма чисел: %d, Произведение чисел: %d", sum, increase);
    }
}
