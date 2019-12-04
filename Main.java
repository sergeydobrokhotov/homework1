package geekbrains.homework1;



public class Main {

    public static void main(String[] args) {

        // задание 2

        types();
        // задание 3
        System.out.println(printresault(1, 1, 1, 1));
        // задание 4
        System.out.println(printpredsumm(20, 6));
        //  задание 5
        chislo(7);
        // задание 6
        System.out.println(printboolchislo(5));
        // задание 7
        printHelloForName("Сергей");

    }
    // Создать переменные всех пройденных типов данных, и инициализировать их значения;
    static void types() {
        System.out.println("Задание 2.");
        boolean b = true;
        byte bt = 5;
        char c = 'h';
        short sh = 345;
        long l = 55555L;
        int i = 555;
        double d = 555.888;
        float f = 5555.0f;

        System.out.println("Значение для типа boolean = " + b);
        System.out.println("Значение для типа byte = " + bt);
        System.out.println("Значение для типа char = [" + c + "]");
        System.out.println("Значение для типа short = " + sh);
        System.out.println("Значение для типа long = " + l);
        System.out.println("Значение для типа int = " + i);
        System.out.println("Значение для типа double = " + d);
        System.out.println("Значение для типа float = " + f);
    }



    // Написать метод вычисляющий выражение a * (b + (c / d))
    // и возвращающий результат,где a, b, c, d – входные параметры этого метода;
    static double printresault(double a, double b, double c, double d) {
        System.out.println("Задание.3");
        return a * (b + (c / d));
    }

    // Написать метод, принимающий на вход два числа, и проверяющий что их
    // сумма лежит в пределах от 10 до 20(включительно),
    // если да – вернуть true, в противном случае – false;
    static boolean printpredsumm(int a, int b) {
        System.out.println("Задание.4");
        int summ = a + b;
        if (summ > 10 && summ <= 20)
            return true;
        else return false;
    }

    // Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль
    // положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.
    static void chislo(int x) {
        System.out.println("Задание.5");
        if (x >= 0) System.out.println("Чсло " + x + " положительное ");
        else System.out.println("Число " + x + " отрицательное");

    }

    //Написать метод, которому в качестве параметра передается целое число,
    // метод должен вернуть true, если число отрицательное;
    static boolean printboolchislo(int a) {
        System.out.println("Задание.6");
        if (a < 0) {
            return true;
        }
        else return false;
    }
    //Написать метод, которому в качестве параметра передается строка,
    // обозначающая имя, метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
    static void printHelloForName(String name) {
        System.out.println("Задание.7");
        System.out.println("Привет " + name + "! ");
    }


}


