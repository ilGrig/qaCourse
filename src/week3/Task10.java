package week3;

//Вывести согласно порядковому дню недели его название используя switch/case

import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите порядковый номер дня недели от 1 до 7");

        int day = sc.nextInt();

        switch (day) {
            case (1) -> System.out.println("Понедельник");
            case (2) -> System.out.println("Вторник");
            case (3) -> System.out.println("Среда");
            case (4) -> System.out.println("Четверг");
            case (5) -> System.out.println("Пятница");
            case (6) -> System.out.println("Шаббат!");
            case (7) -> System.out.println("Воскресенье");
            default -> System.out.println("Это не день недели");
        }
    }
}
