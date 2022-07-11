package week3;

//Дано: известны площадь круга и квадрата;
//Узнать: поместится ли квадрат в круг и круг в квадрат

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите площадь квадрата");
        int square = sc.nextInt();
        System.out.println("Введите площадь круга");
        int round = sc.nextInt();

        if (square == round) {
            System.out.println("Площади фигур равны");
        }

        if (square > round) {
            System.out.println("Круг поместится в квадрате");
        }
        else if (square < round) {
            System.out.println("Квадрат поместится в круге");
        }
    }
}
