import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/*
DownloadException
*/

public class Task0854 {
    public static void main(String[] args) throws DownloadException {
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            try {
                FileInputStream reader = new FileInputStream(console.readLine());
                if (reader.available() < 1000) {
                    reader.close();
                    throw new DownloadException();
                }
                reader.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    public static class DownloadException extends Exception {

    }
}
