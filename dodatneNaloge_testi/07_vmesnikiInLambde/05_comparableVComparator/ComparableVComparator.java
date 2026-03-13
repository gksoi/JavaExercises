

import java.util.Comparator;
import java.util.*;


public class ComparableVComparator{
public static <T extends Comparable<T>> Comparator<T> pretvori(){
    return  Comparator.naturalOrder();
}

private static class Naravni<T extends Comparable<T>> implements Comparator<T>{
    @Override
    public int compare(T a , T b){
        return a.compareTo(b);
    }
}


}










/* import java.util.Comparator;






















public class ComparableVComparator{
    public static <T extends Comparable<T>> Comparator<T> pretvori(){
        return Comparator.naturalOrder();

    }
} */