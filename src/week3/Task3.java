package week3;


import java.util.Scanner;

//Дано: найти длину окружности с радиусом 4
//Формула длины окружности C = 2 * Pi * R
public class Task3 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double PI = Math.PI;

        System.out.println("Напишите радиус");
        int Radius = sc.nextInt();

        if (Radius <= 0) {
            System.out.println("Радиус должен быть натуральным числом!");
            System.exit(0);
        }

        double C = (2 * PI) * Radius;
        System.out.printf("Длина окружности с радиусом %d равна %.2f", Radius, C);
    }
}
