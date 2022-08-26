package Task0743;

public class OurPresident {
    private static OurPresident president;
    private static final String MUTEX = "1";

    static {
        synchronized (MUTEX) {
            president = new OurPresident();
        }
    }

    private OurPresident() {
    }

    public static OurPresident getOurPresident() {
        return president;
    }
}
