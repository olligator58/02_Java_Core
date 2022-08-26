/*
Int и Integer
*/

public class Task0241 {
    public static void main(String[] args) {
        int a = 5;
        Integer b = Integer.valueOf(a);
        print(a);
        print(b);
    }

    public static void print(int a) {
        System.out.println(a);
    }

    public static void print(Integer a) {
        System.out.println(a);
    }
}
