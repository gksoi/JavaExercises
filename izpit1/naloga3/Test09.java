
import java.util.*;

public class Test09 {

    public static void main(String[] args) {

        Tretja.Vrtnina[][] grede = {
            { new Tretja.Cebula(), new Tretja.Fizol(), new Tretja.Cebula(), new Tretja.Grah(), new Tretja.Petersilj(), new Tretja.Cebula(), new Tretja.Grah(), new Tretja.Grah() },
            { new Tretja.Petersilj() },
            { new Tretja.Korenje(), new Tretja.Korenje(), new Tretja.Cebula(), new Tretja.Fizol(), new Tretja.Cebula(), new Tretja.Fizol(), new Tretja.Grah(), new Tretja.Cebula(), new Tretja.Cebula(), new Tretja.Petersilj() },
            { new Tretja.Grah(), new Tretja.Petersilj(), new Tretja.Fizol(), new Tretja.Grah() },
            { new Tretja.Petersilj(), new Tretja.Korenje(), new Tretja.Cebula(), new Tretja.Fizol(), new Tretja.Grah(), new Tretja.Petersilj(), new Tretja.Petersilj(), new Tretja.Petersilj(), new Tretja.Fizol(), new Tretja.Grah() },
            { new Tretja.Korenje(), new Tretja.Fizol(), new Tretja.Zelena(), new Tretja.Zelena(), new Tretja.Fizol(), new Tretja.Zelena(), new Tretja.Korenje(), new Tretja.Zelena() },
            { new Tretja.Zelena(), new Tretja.Petersilj(), new Tretja.Cebula(), new Tretja.Cebula(), new Tretja.Korenje(), new Tretja.Petersilj() },
            { new Tretja.Petersilj(), new Tretja.Korenje(), new Tretja.Fizol() },
            { new Tretja.Fizol(), new Tretja.Grah(), new Tretja.Zelena(), new Tretja.Zelena(), new Tretja.Petersilj(), new Tretja.Cebula(), new Tretja.Zelena(), new Tretja.Zelena(), new Tretja.Grah() },
            { new Tretja.Grah(), new Tretja.Petersilj(), new Tretja.Cebula() },
            { new Tretja.Grah(), new Tretja.Korenje() },
            { new Tretja.Petersilj(), new Tretja.Cebula(), new Tretja.Cebula(), new Tretja.Cebula(), new Tretja.Grah(), new Tretja.Grah(), new Tretja.Zelena(), new Tretja.Cebula(), new Tretja.Fizol(), new Tretja.Grah() },
            { new Tretja.Zelena(), new Tretja.Korenje(), new Tretja.Korenje(), new Tretja.Fizol(), new Tretja.Korenje() },
            { new Tretja.Grah(), new Tretja.Fizol(), new Tretja.Cebula(), new Tretja.Grah(), new Tretja.Grah() },
            { new Tretja.Cebula(), new Tretja.Cebula(), new Tretja.Cebula() },
            { new Tretja.Korenje(), new Tretja.Petersilj(), new Tretja.Cebula(), new Tretja.Fizol() },
            { },
            { new Tretja.Zelena(), new Tretja.Zelena(), new Tretja.Korenje(), new Tretja.Grah(), new Tretja.Cebula(), new Tretja.Zelena(), new Tretja.Petersilj(), new Tretja.Petersilj(), new Tretja.Fizol() },
            { },
            { new Tretja.Petersilj(), new Tretja.Fizol() },
            { new Tretja.Petersilj(), new Tretja.Grah(), new Tretja.Grah(), new Tretja.Cebula(), new Tretja.Zelena(), new Tretja.Grah(), new Tretja.Korenje(), new Tretja.Korenje(), new Tretja.Korenje() },
            { new Tretja.Grah(), new Tretja.Grah(), new Tretja.Zelena(), new Tretja.Fizol() },
            { new Tretja.Zelena(), new Tretja.Korenje(), new Tretja.Petersilj(), new Tretja.Cebula(), new Tretja.Grah(), new Tretja.Korenje(), new Tretja.Cebula(), new Tretja.Petersilj() },
            { new Tretja.Cebula(), new Tretja.Grah(), new Tretja.Korenje(), new Tretja.Grah(), new Tretja.Zelena(), new Tretja.Grah(), new Tretja.Korenje(), new Tretja.Cebula() },
            { new Tretja.Grah(), new Tretja.Cebula(), new Tretja.Fizol() },
            { new Tretja.Fizol(), new Tretja.Fizol() },
            { new Tretja.Zelena(), new Tretja.Korenje(), new Tretja.Korenje(), new Tretja.Zelena() },
            { new Tretja.Cebula(), new Tretja.Zelena(), new Tretja.Fizol(), new Tretja.Fizol(), new Tretja.Grah(), new Tretja.Grah(), new Tretja.Korenje() },
            { new Tretja.Zelena(), new Tretja.Fizol(), new Tretja.Cebula(), new Tretja.Cebula(), new Tretja.Grah(), new Tretja.Grah(), new Tretja.Fizol(), new Tretja.Cebula(), new Tretja.Fizol() },
            { new Tretja.Cebula(), new Tretja.Grah(), new Tretja.Korenje() },
            { new Tretja.Grah(), new Tretja.Fizol() },
            { new Tretja.Korenje(), new Tretja.Grah(), new Tretja.Grah(), new Tretja.Grah() },
            { new Tretja.Zelena(), new Tretja.Cebula(), new Tretja.Grah() },
            { new Tretja.Petersilj(), new Tretja.Petersilj(), new Tretja.Zelena(), new Tretja.Korenje(), new Tretja.Korenje() },
            { new Tretja.Petersilj(), new Tretja.Petersilj() },
            { new Tretja.Grah(), new Tretja.Cebula(), new Tretja.Zelena(), new Tretja.Korenje(), new Tretja.Petersilj(), new Tretja.Grah(), new Tretja.Zelena() },
            { new Tretja.Korenje() },
            { new Tretja.Zelena(), new Tretja.Korenje(), new Tretja.Zelena(), new Tretja.Korenje(), new Tretja.Petersilj(), new Tretja.Cebula(), new Tretja.Petersilj(), new Tretja.Cebula(), new Tretja.Cebula(), new Tretja.Cebula() },
            { new Tretja.Fizol(), new Tretja.Cebula(), new Tretja.Grah() },
            { new Tretja.Fizol(), new Tretja.Korenje(), new Tretja.Cebula(), new Tretja.Fizol(), new Tretja.Petersilj(), new Tretja.Zelena(), new Tretja.Zelena(), new Tretja.Petersilj(), new Tretja.Zelena() },
            { new Tretja.Grah(), new Tretja.Grah(), new Tretja.Zelena(), new Tretja.Cebula(), new Tretja.Cebula() },
            { new Tretja.Petersilj(), new Tretja.Zelena(), new Tretja.Grah(), new Tretja.Cebula(), new Tretja.Zelena(), new Tretja.Grah(), new Tretja.Grah(), new Tretja.Fizol(), new Tretja.Petersilj(), new Tretja.Petersilj() },
            { new Tretja.Zelena(), new Tretja.Petersilj(), new Tretja.Zelena() },
            { new Tretja.Zelena() },
            { new Tretja.Grah(), new Tretja.Grah(), new Tretja.Cebula(), new Tretja.Korenje(), new Tretja.Fizol(), new Tretja.Petersilj(), new Tretja.Petersilj(), new Tretja.Zelena(), new Tretja.Grah() },
            { new Tretja.Fizol(), new Tretja.Cebula() },
            { new Tretja.Zelena(), new Tretja.Cebula(), new Tretja.Cebula(), new Tretja.Petersilj(), new Tretja.Petersilj(), new Tretja.Fizol(), new Tretja.Zelena(), new Tretja.Fizol() },
            { new Tretja.Petersilj() },
            { new Tretja.Petersilj(), new Tretja.Fizol(), new Tretja.Cebula(), new Tretja.Cebula(), new Tretja.Petersilj(), new Tretja.Korenje(), new Tretja.Zelena() },
            { new Tretja.Grah(), new Tretja.Korenje(), new Tretja.Petersilj(), new Tretja.Zelena() },
        };
        Tretja.Vrt vrt = new Tretja.Vrt(grede);

        for (int i = 0; i < grede.length; i++) {
            Tretja.Vrt v = new Tretja.Vrt(Arrays.copyOfRange(grede, i, i + 1));
            System.out.printf("greda %d -> %d%n", i, v.meraSosednosti());
        }
        System.out.printf("skupaj -> %d%n", vrt.meraSosednosti());

    }
}
