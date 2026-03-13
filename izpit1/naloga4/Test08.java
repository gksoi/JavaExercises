
import java.util.*;

public class Test08 {

    public static void main(String[] args) {
        Iterator<String> p = Cetrta.piramidator(47, 0);

        while (p.hasNext()) {
            String s = p.next();
            if (!ok(s)) {
                throw new RuntimeException("Neustrezen izhodni niz!");
            }
            System.out.print(s);
        }
    }

    private static boolean ok(String s) {
        return s.equals("-") || s.equals("*") || s.equals(String.format("%n"));
    }
}
