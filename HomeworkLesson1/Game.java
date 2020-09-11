package HomeworkLesson1;

import java.sql.SQLOutput;

public class Game {

    public static void toGuessNumber (int myNumber) {
        int computerNumber = 44;

        while (myNumber != computerNumber) {
            if (myNumber > computerNumber) {
                System.out.println("Введенное вами число больше числа, которое загадал компьютер");
                myNumber -= 12;
            }
            else {
                System.out.println("Введенное вами число меньше числа, которое загадал компьютер");
                myNumber += 38;
            }
        }
        System.out.println("Вы угадали!");

    }


    public static void main(String[] args) {
        toGuessNumber(44);
    }
}
