package geekbrains.homework1.homework2;


import java.util.Arrays;

public class App {
    public static void main(String[] args) {
//       задание 1
        changeArray();
//       задание 2
        createArray();
//        задание 3
        createMassiv();
//        задание 4
        twoMassiv();
//        задание 5
        min_maxMassiv();
    }


//       Задать целочисленный массив, состоящий из элементов 0 и 1.
//   Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//   С помощью цикла и условия заменить 0 на 1, 1 на 0;

    private static void changeArray() {
        System.out.println("Задание 1.");
        int[] arr = new int[]{1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.print("Неизменнный: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.print("\nИзмененный:  ");
        for (int i : arr) {
            System.out.print(i + " ");

        }
    }

//         Задать пустой целочисленный массив размером 8.
//         С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
    private static void createArray() {
        System.out.println("\nЗадание 2.");
        int[] array = new int[8];
        for (int i = 0, j = 0; i < array.length; i++, j += 3) {
            array[i] = j;

            System.out.print(array[i] + " ");
        }
    }

//       Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
//      пройти по нему циклом, и числа меньшие 6 умножить на 2;
    private static void createMassiv() {
        System.out.println("\nЗадание 3.");
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        System.out.print("BEFORE: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\nAFTER:  ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6)
                arr[i] *= 2;
            System.out.print(arr[i] + " ");
        }
    }

    //Создать квадратный двумерный целочисленный массив
// (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    private static void twoMassiv(){
        System.out.println("\nЗадание 4.");

            int length = 7; // length of array

            int[][] arr = new int[length][length];
            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    if ((i == j) || (i == length - 1 - j)) {
                        arr[i][j] = 1;
                    }
                }
            }

            for (int i = 0; i < length; i++) {
                for (int j = 0; j < length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }
        //Задать одномерный массив и найти в нем
        // минимальный и максимальный элементы (без помощи интернета);
        private static void min_maxMassiv(){
            System.out.println("\nЗадание 4.");
            int[] arr = {1, 5, 3, 2, 19, 4, -5, 2, 4, -8, 9, 1};
            int min = arr[0];
            int max = arr[0];
            System.out.print("массив: ");
            for (int i : arr) {
                System.out.print(i + " ");

            }
            for (int i =0; i < arr.length; i++) {
                min = (min < arr[i]) ? min : arr[i];
                max = (max > arr[i]) ? max : arr[i];
            }
            System.out.println("\nМинимальный элемент: " + min + "\nМаксимальный элемент: " + max);




        }
    }








