/*
Статики и котики
*/

public class Task0594 {
    public static Cat cat;

    static {
        cat = new Cat();
        cat.name = "Васька";
        System.out.println(cat.name);
    }

    public static void main(String[] args) {

    }

    public static class Cat {
        public String name;
    }
}
