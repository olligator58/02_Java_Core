/*
ООП - Расставить интерфейсы
*/

public class Task0520 {
    public static void main(String[] args) {

    }

    public interface Movable {
        boolean isMovable();
    }

    public interface Sellable {
        Object getAllowedAction(String name);
    }

    public interface Discountable {
        Object getAllowedAction();
    }

    public static class Clothes implements Movable, Sellable, Discountable {
        @Override
        public boolean isMovable() {
            return true;
        }

        @Override
        public Object getAllowedAction(String name) {
            return new Object();
        }

        @Override
        public Object getAllowedAction() {
            return new Object();
        }
    }
}
