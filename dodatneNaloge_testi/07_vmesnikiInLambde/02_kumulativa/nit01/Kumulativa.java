import java.util.ArrayList;
import java.util.Comparator;
import java.util.*;
import java.util.List;
import java.util.function.BinaryOperator;

public class Kumulativa{



public static <T> List<T> kumulativa(List<T> seznam, BinaryOperator<T> operator) {

    ArrayList<T> arrej = new ArrayList<>();
    Iterator<T> it = seznam.iterator();
    int i = 1;
    
    while (it.hasNext()) {
        Iterator<T> it2 = seznam.iterator();
        T next = it.next();
        T rezultat = seznam.getFirst();


        for(int ix = 1; ix < i; ix++){
            rezultat = operator.apply(rezultat, seznam.get(ix));
        }
        arrej.add(rezultat);

        i++;
    }

    return arrej;
    
    /* 
    ArrayList<T> novSeznam = new ArrayList<>();
    T prviElement = seznam.get(0);
    novSeznam.add(prviElement);

    for(int i = 1; i < seznam.size(); i++){
        novSeznam.add(operator.apply(prviElement, seznam.get(i)));
        prviElement = novSeznam.get(i);
    }

    return novSeznam; */
}


public static <T> List<T> doslejNajvecji(List<T> seznam, Comparator<T> primerjalnik){
    ArrayList<T> arrej = new ArrayList<>();
    arrej.add(seznam.getFirst());
    int i = 0;
    for(T t : seznam){
        if(i==0){}
        else if (primerjalnik.compare(t, arrej.getLast())>0) {
            arrej.add(t);
        }
        else{
            arrej.add(arrej.getLast());
        }
        i++;
    }
    return arrej;

    
    
    /* 
    T najvecji = seznam.get(0);
    ArrayList<T> novSeznam = new ArrayList<>();
   // novSeznam.add(najvecji);

    for(int i = 0; i< seznam.size(); i++){
        for(int x = 0; x <= i; x++){
            if (primerjalnik.compare(najvecji, seznam.get(x)) < 0) {
            najvecji = seznam.get(x);
            }
        }
        novSeznam.add(najvecji);

    }

    return novSeznam;

 */

}

}

























