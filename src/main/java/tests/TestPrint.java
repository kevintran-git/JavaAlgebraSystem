package tests;

/**
* Test printing methods.
 */
public class TestPrint {
    public static boolean DISABLED = false;

    public static void l(Object... objects) {
        for (Object o : objects) {
            l(o);
        }
    }

    public static void l(Object o) {
        if (DISABLED) return;
        System.out.println(o);
    }

    public static void p(Object o) {
        if (DISABLED) return;
        System.out.print(o);
    }
}