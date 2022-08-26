import java.io.*;

/*
Десериализация
*/

public class Task101001 {
    public A getOriginalObject(ObjectInputStream objectStream) {
        try {
            A a = (A) objectStream.readObject();
            return a;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public class A implements Serializable {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }

    public static void main(String[] args) {

    }
}
