import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/*
Ридер обертка
*/

public class Task0980 {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        PrintStream output = new PrintStream(byteArrayOutputStream);
        System.setOut(output);
        testString.printSomething();
        System.setOut(consoleStream);
        System.out.println(byteArrayOutputStream.toString().toUpperCase());
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
