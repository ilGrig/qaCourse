package week4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введи любой символ");
        String symbol = sc.next();
        System.out.println("Введи число столбцов и строк");
        int rowsAndColumns = sc.nextInt();

        for (int i = 0; i < rowsAndColumns; i++) {
            for (int j = 0; j < rowsAndColumns; j++) {
                System.out.print("" + symbol + " ");
            }
            System.out.println();
        }
    }
}
