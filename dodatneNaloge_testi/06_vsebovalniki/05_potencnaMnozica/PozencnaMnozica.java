import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

 class PozencnaMnozica{





public static <T> Set<Set<T>> potencna(Set<T> mnozica){
    int dolzina = mnozica.size();
    Set<Set<T>> finalniSet = new HashSet<>();
    Set<T> prazenSet = new HashSet<>();
    set.add(prazenSet);



    for(Set<T> notranjiSet : finalniSet){
        for(T item3 : mnozica){
            if (! notranjiSet.contains(item3)) {
                notranjiSet.add(item3);
                finalniSet.add(notranjiSet);
            }
        }
    }
    return finalniSet;


}

}