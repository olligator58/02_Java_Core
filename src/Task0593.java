/*
Статики и исключения
*/

public class Task0593 {
    public static int A = 0;

    static {
        int a = 5 / A;
    }

    public static int B = 5;

    public static void main(String[] args) {
        System.out.println(B);
    }
}
