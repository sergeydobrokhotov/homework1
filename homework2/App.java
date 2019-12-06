package geekbrains.homework1.homework2;


public class App {
    public static void main(String[] args) {
//       задание 1
        changeArray();
//        задание 2
        createArray();
        createMassiv();
    }


//       Задать целочисленный массив, состоящий из элементов 0 и 1.
//   Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//   С помощью цикла и условия заменить 0 на 1, 1 на 0;


    //     Задать пустой целочисленный массив размером 8.
    //     С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
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


    private static void createArray() {
        System.out.println("\nЗадание 2.");
        int[] array = new int[8];
        for (int i = 0, j = 0; i < array.length; i++, j += 3) {
            array[i] = j;

            System.out.print(array[i] + " ");
        }

    }


    private static void createMassiv() {
        System.out.println("\nЗадание 3.");
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.print("Неизменнный: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }

    }
}




