package geekbrains.homework1.homework7;

public class Main {
    public static void main(String[] args) {
        System.out.println("List of cats:");
        Cat[] x = {new Cat("Matroskin", 56), new Cat("Tom", 78), new Cat("Ben", 30)};
        Plate plate = new Plate(100);
        for (Cat c : x) {
            System.out.println(c);
        }
        System.out.println("\n" + plate);
        System.out.println("***********************************************");
        System.out.println("increase food by 100");
        plate.increaseFood(50);
        System.out.println(plate);
        System.out.println("***********************************************");
        System.out.println("Cats take food:");
        for (Cat c : x) {
            c.eat(plate);
            System.out.println(c);
            System.out.println(plate);
        }
    }
}


