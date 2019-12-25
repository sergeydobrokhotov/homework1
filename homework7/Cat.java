package geekbrains.homework1.homework7;

public class Cat {
    private String name;
    private int apppetite;
    private boolean isFull;

    Cat(String name, int apppetite) {
        this.name = name;
        this.apppetite = apppetite;
        this.isFull = false;
    }

   @Override
    public String toString() {
        return "CAT: " + name + " | APPETITE: " + apppetite +"| ISFULL: " + isFull;
   }


    void eat(Plate plate) {
        if (plate.getAmountOfFood() >= apppetite) {
            plate.decreaseFood(apppetite);
            isFull = true;
        }
    }



}
