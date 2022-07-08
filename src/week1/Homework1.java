package week1;

//С некоторого момента прошло 234 дня. Посчитать:
//Кол-во полных недель
//Кол-во месяцев

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество дней");

        int days = sc.nextInt();

        int fullWeeks = days/7;
        int fullMonths = days/30;

        System.out.printf("С дня %d прошло %d недель(-и) и %d месяцев", days, fullWeeks, fullMonths);

    }
}
