package week2;

import java.util.Random;
//import java.util.Scanner;

//Дано: вес боксера
//Определить его весовую категорию: Легкий (до 60), Средний (до 75), Тяжелый (до 91), Супертяжелый (от 91)

public class Task2 {
    public static void main(String[] args) {
        Random rand = new Random();
//        Scanner sc = new Scanner(System.in);
        int boxerWeight = rand.nextInt(55, 101);
//        int boxerWeight = sc.nextInt();

        if (boxerWeight <= 60) {
            System.out.printf("Боец в легком весе, его вес %d", boxerWeight);
        }
        else if (boxerWeight <= 75) {
            System.out.printf("Боец в среднем весе, его вес %d", boxerWeight);
        }
        else if (boxerWeight <= 91) {
            System.out.printf("Боец в тяжелом весе, его вес %d", boxerWeight);
        }
        else if (boxerWeight >= 92) {
            System.out.printf("Боец в супертяжелом весе, его вес %d", boxerWeight);
        }
    }
}
