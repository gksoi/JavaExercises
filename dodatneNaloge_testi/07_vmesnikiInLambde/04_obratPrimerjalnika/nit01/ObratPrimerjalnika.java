import java.lang.reflect.Array;
import java.util.*;
import java.util.Comparator;
import java.util.List;

public class ObratPrimerjalnika{


public static <T> Comparator<T> obrni(Comparator<T> primerjalnik){
    return primerjalnik.reversed();
}



public static <T> void urediPadajoce(List<T> seznam, Comparator<T> primerjalnik){
    seznam.sort(obrni(primerjalnik));
}



}
/* 
public static <T> Comparator<T> obrni(Comparator<T> primerjalnik){
    return (a , b) -> primerjalnik.compare(b, a);

}



public static <T> void urediPadajoce(List<T> seznam, Comparator<T> primerjalnik){
    seznam.sort(obrni(primerjalnik));
}
    
} */