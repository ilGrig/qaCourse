package week3;


import java.util.Scanner;

//Расписать результат игры футбольной команды по кол-ву очков: 3 -- победа, 1 -- ничья, 0 -- поражение
public class Homework1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите кол-во очков");

        int points = sc.nextInt();

        switch (points) {
            case (3) -> { System.out.println("Ура! Победа!"); }
            case (1) -> { System.out.println("Ну, бывает. Ничья."); }
            case (0) -> { System.out.println("Подвели вы нас. Поражение."); }
            default  -> { System.out.println("Это не результат"); }

        }
    }
}
