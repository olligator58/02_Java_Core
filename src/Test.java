import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws Exception {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName = console.readLine();

        FileReader reader = new FileReader(fileName);
        while (reader.ready()) {
            int aChar = reader.read();
            System.out.print((char) aChar + "|");
        }
    }
}
