/*
CanFly, CanRun, CanSwim для классов Duck, Penguin, Toad
*/

public class Task02126 {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }

    public class Duck implements CanFly, CanRun, CanSwim {
        @Override
        public void fly() {
        }

        @Override
        public void run() {
        }

        @Override
        public void swim() {
        }
    }

    public class Penguin implements CanRun, CanSwim {
        @Override
        public void run() {
        }

        @Override
        public void swim() {
        }
    }

    public class Toad implements CanSwim {
        @Override
        public void swim() {
        }
    }
}
