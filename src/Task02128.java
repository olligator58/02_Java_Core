/*
Родитель класса CTO
*/


public class Task02128 {

    public static void main(String[] args) {
        CTO cto = new CTO();
        System.out.println(cto);
    }

    public static interface Businessman {
        public void workHard();
    }

    public static class Banker implements Businessman {
        @Override
        public void workHard() {
        }
    }

    public static class CTO extends Banker implements Businessman {

    }
}
