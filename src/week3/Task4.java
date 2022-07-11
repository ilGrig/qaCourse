package week3;


import java.util.Scanner;

//Дано 36.6 градусов Цельсия.
//Перевести их в Кельвины и Фаренгейты
public class Task4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите градусы по Цельсию");
        double celsius = sc.nextDouble();

        double celsiusToFahrenheits = (celsius * 1.8) + 32;
        double kelvins = 273.15;
        double celsiusToKelvins = kelvins + celsius;

        System.out.printf("%.1f градусов по Цельсию равны %.1f по Фаренгейту\n и %.1f по Кельвину\n", celsius, celsiusToFahrenheits, celsiusToKelvins);
    }
}
