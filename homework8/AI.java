package geekbrains.homework1.homework8;


    import java.util.*;

    class AI {
        Random random = new Random();
        private final char DOT;

        AI(char ch) { DOT = ch; }

        void turn(Field field) {
            int x, y;
            do {
                x = random.nextInt(field.getSize());
                y = random.nextInt(field.getSize());
            } while (!field.isCellValid(x, y));
            field.setDot(x, y, DOT);
        }
}
