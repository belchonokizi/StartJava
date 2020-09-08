package HomeworkLesson1;

import java.sql.SQLOutput;

public class Game {

    public static void toGuessNumber (int a) {
        int i = 44;
        while (a != i) {
            if (a > i) {
                System.out.println("Введенное вами число больше числа, которое загадал компьютер");
                a -= 12;
            }
            else {
                System.out.println("Введенное вами число меньше числа, которое загадал компьютер");
                a += 38;
            }
        }
        System.out.println("Вы угадали!");

    }


    public static void main(String[] args) {
        toGuessNumber(10);
    }
}
