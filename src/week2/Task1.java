package week2;

import java.util.Random;
import java.util.Scanner;

//Компьютер загадывает число от 1 до 20
//Игрок вводит число, если больше -- сообщение об этом, если меньше -- об этом;
//Если равно, то сообщение о победе

public class Task1 {
    public static void main(String[] args) {
        Random randy = new Random();
        Scanner sc = new Scanner(System.in);
        int A = randy.nextInt(1, 20);

        System.out.println("Введите число");
        int B = sc.nextInt();

        for (int i = 0; i < 30; i++) {
            if (B < A) {
                System.out.println("Твое число меньше. Вводи снова");
                B = sc.nextInt();
            }
            else if (B > A) {
                System.out.println("Твое число больше. Вводи снова");
                B = sc.nextInt();
            }
            else {
                System.out.println("Ты победил!");
                System.out.printf("Попыток %d", i);
                break;
            }
        }
    }
}
