import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
Минимальный байт
*/

public class Task0831 {
    public static void main(String[] args) throws Exception {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        String fileName = console.readLine();
        console.close();

        try (FileInputStream reader = new FileInputStream(fileName)) {
            int min = 256;
            while (reader.available() > 0) {
                int aByte = reader.read();
                if (aByte < min) {
                    min = aByte;
                }
            }
            System.out.println(min);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
