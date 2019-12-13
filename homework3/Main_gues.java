package geekbrains.homework1.homework3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

//1. Написать программу, которая загадывает случайное число от 0 до 9,
// и пользователю дается 3 попытки угадать это число.
// При каждой попытке компьютер должен сообщить больше ли указанное пользователем
// число чем загаданное, или меньше. После победы или проигрыша
// выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
public class Main_gues {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            Random r = new Random();
            int x = r.nextInt(9);
            int f;
            System.out.println("Угадайте число от 0 до 9!");
            for (int i = 1; i <= 3; i++) {
                f = Integer.parseInt(br.readLine());

                if (f == x) {
                    System.out.println(f + " = " + x + " Вы выиграли!");
                    break;
                }
                else if (f > x) System.out.println(f + " Загаданное число меньше");
                else if (f < x) System.out.println(f + " Загаданное число больше");

                if (i == 3) System.out.println("Вы проиграли! Правильный ответ: " + x);
            }

            System.out.println("Повторить игру еще раз? 1 - YES / 0 - NO");

            int repeat = Integer.parseInt(br.readLine());
            while ((repeat < 0) || (repeat > 1)) {
                System.out.println("Введите корректный номер: 1 - YES / 0 - NO");
                repeat = Integer.parseInt(br.readLine());
            }

            if (repeat == 1) {
                System.out.println("Старт новой игры...");
            }
            else {
                System.out.println("Пока!");
                return;
            }
        } while (true);
    }
}





