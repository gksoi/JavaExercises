import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

public class Resitve{



public static <T> List<T> sesitve(List<T> seznam, BinaryOperator<T> operator){
    ArrayList<T> novSeznam = new ArrayList<>();
    T kumulativnaVrednost = seznam.get(0);
    novSeznam.add(kumulativnaVrednost);

    for(int i=0; i< seznam.size(); i++){
        
        if (i !=0) {
            
            kumulativnaVrednost = operator.apply(kumulativnaVrednost,seznam.get(i));
            novSeznam.add(kumulativnaVrednost);
        }
    }
    return novSeznam;

}


public static <T> List<T> dosslejNajvecji(List<T> seznam, Comparator<T> primerjalnik){
   // Arrays.sort(seznam, primerjalnik);
    T najvecja = seznam.get(0);
    ArrayList<T> noviSeznam = new ArrayList<>();
    noviSeznam.add(najvecja);

    for(int i = 1; i< seznam.size(); i++){

            if (primerjalnik.compare(seznam.get(i),najvecja) > 0) {
                najvecja = seznam.get(i);
            }
            
        
        noviSeznam.add(najvecja);

    }
    return noviSeznam;



}




}