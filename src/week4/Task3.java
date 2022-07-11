package week4;
//Сделать таблицу сложения 1 + 1 = 2 и т.д.

public class Task3 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++){
                System.out.printf("%d+%d=%d ", i, j, (i + j));
            }
            System.out.println();
        }
    }
}
