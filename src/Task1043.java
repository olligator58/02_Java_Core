import java.io.Serializable;

/*
Как сериализовать static?
*/

public class Task1043 {
    public static class ClassWithStatic implements Serializable {
        public static String staticString = "This is a static test string";
        public int i;
        public int j;
    }

    public static void main(String[] args) {

    }
}
