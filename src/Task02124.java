/*
Посетители
*/

public class Task02124 {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        String result;
        if (o instanceof Tiger ) {
            result = "Тигр";
        } else if (o instanceof Lion) {
            result = "Лев";
        } else if (o instanceof Cat) {
            result = "Кот";
        } else if (o instanceof Bull) {
            result = "Бык";
        } else if (o instanceof Cow) {
            result = "Корова";
        } else if (o instanceof Animal) {
            result = "Животное";
        } else {
            result = "Неизвестный объект";
        }
        return result;
    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger extends Cat {
    }

    public static class Lion extends Cat {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
