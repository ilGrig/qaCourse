package week3;

import java.util.Scanner;

//Даны радиус круга и сторона квадрата
//Найти: площадь фигур и сравнить у кого больше
public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double PI = Math.PI;

        System.out.println("Введите радиус круга");
        int radiusCircle = sc.nextInt();
        System.out.println("Введите сторону квадрата");
        int squareSide = sc.nextInt();

        double areaCircle = PI * (radiusCircle * 2);
        double areaSquare = squareSide * squareSide;
        System.out.printf("Площадь круга %.1f, площадь квадрата %.1f\n", areaCircle, areaSquare);

        if (areaCircle > areaSquare) {
            System.out.println("Площадь круга больше");
        } else {
            System.out.println("Площадь квадрата больше");
        }
    }
}
