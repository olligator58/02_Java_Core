/*
Кошки не должны быть абстрактными!
*/

public class Task0264 {
    public static void main(String[] args) {

    }

    public static abstract class Pet {
        public abstract String getName();

        public abstract Pet getChild();
    }

    public static class Cat extends Pet {
        @Override
        public String getName() {
            return "Васька";
        }

        @Override
        public Pet getChild() {
            return new Cat();
        }
    }

    public static class Dog extends Pet {
        @Override
        public String getName() {
            return "Шарик";
        }

        @Override
        public Pet getChild() {
            return new Dog();
        }
    }
}
