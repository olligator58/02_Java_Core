/*
Корова — тоже животное
*/

public class Task0263 {
    public static void main(String[] args) {

    }

    public static abstract class Animal {
        public abstract String getName();
    }

    public static class Cow extends Animal {
        @Override
        public String getName() {
            return "Буренка";
        }
    }

}
