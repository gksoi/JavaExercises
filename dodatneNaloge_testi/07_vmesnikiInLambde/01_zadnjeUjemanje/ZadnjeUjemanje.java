import java.util.*;
import java.util.Collections;
import java.util.function.Predicate;

public class ZadnjeUjemanje{


public static <T> T zadnji(Collection<T> zbirka, Predicate<T> pogoj){
    T zadnji = null;
/*     for(T t : zbirka){
        T trenutni = t;
        if (pogoj.test(trenutni)) {
            zadnji=trenutni;
        }
    } */
    Iterator<T> iterator = zbirka.iterator();
    while (iterator.hasNext()) {
        T trenutni = iterator.next();
        if (pogoj.test(trenutni)) {
            zadnji=trenutni;
        }
    }
    return zadnji;
    
    
    /* 
    T zadnjiUjemajoc = null;
    for(T element: zbirka){
        if (pogoj.test(element)) {
            zadnjiUjemajoc = element;
        }
    }
    return zadnjiUjemajoc;

}
 */


}
}