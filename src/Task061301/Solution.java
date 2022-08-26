package Task061301;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread1());
        threads.add(new Thread2());
        threads.add(new Thread3());
        threads.add(new Thread4());
        threads.add(new Thread5());
    }

    public static void main(String[] args) throws InterruptedException {
        Thread2 t = new Thread2();
        t.start();
        Thread.sleep(3000);
        t.interrupt();
    }

    public static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true) {
            }
        }
    }

    public static class Thread2 extends Thread {
        @Override
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static class Thread3 extends Thread {
        @Override
        public void run() {
            try {
                while (true) {
                    System.out.println("Ура");
                    Thread.sleep(500);
                }
            } catch (InterruptedException e) {
            }
        }
    }

    public static class Thread4 extends Thread implements Message {
        private volatile boolean isStopped = false;

        @Override
        public void run() {
            while (!isStopped) {
            }
        }

        @Override
        public void showWarning() {
            isStopped = true;
        }
    }

    public static class Thread5 extends Thread {
        @Override
        public void run() {
            String line;
            int result = 0;
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                while (!(line = reader.readLine()).equals("N")) {
                    result += Integer.parseInt(line);
                }
                System.out.println(result);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}