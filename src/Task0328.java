/* 
Всё, что движется
*/

public class Task0328 {
    public static void main(String[] args) throws Exception {
    }

    public interface CanMove {
        Double speed();
    }

    public interface CanFly extends CanMove {
        Double speed(CanFly canfly);
    }
}