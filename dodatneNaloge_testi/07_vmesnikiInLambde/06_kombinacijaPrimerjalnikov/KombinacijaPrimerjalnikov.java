import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
public class KombinacijaPrimerjalnikov{



public static <T> Comparator<T> kombinacija(List<Comparator<T>> primerjalniki){
    return (a, b) -> {
        Iterator<Comparator<T>> it = primerjalniki.iterator();
        while (it.hasNext()) {
            Comparator<T> comp2 = it.next();
            if (comp2.compare(a, b) != 0) {
                return comp2.compare(a, b);
            }
        

        }
        return 0;
    };
}



/* 
    public static <T> Comparator<T> kombinacija(List<Comparator<T>> primerjalniki){
            return(a,b) ->{
        	for(Comparator<T> primerjalnik : primerjalniki){
                int x = primerjalnik.compare(a,b);
                if( x != 0){
                    return x;
                }
            }
            return 0;
         };



    }



 */

}