package week4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String row = "";

        System.out.println("Введи любой символ");
        String symbol = sc.next();

        for (int i = 0; i < 5; i++) {
            System.out.println(row = row + symbol + " ");
        }
    }
}
