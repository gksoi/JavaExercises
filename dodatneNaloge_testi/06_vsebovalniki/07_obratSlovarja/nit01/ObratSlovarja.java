import java.util.*;



public class ObratSlovarja {

public static<K, V> Map<V, Set<K>> obrni(Map<K, V> slovar){


    HashMap<V, Set<K>> cilj = new HashMap<>();
    
    slovar.entrySet().stream().forEach(set->{
        HashSet <K> set1 = new HashSet<>();
        for(K key :slovar.keySet() ){
        if (set.getValue().equals(slovar.get(key))) {
            set1.add(set.getKey());
        }
    }

        if(cilj.containsKey(set.getValue())){
            cilj.get(set.getValue()).addAll(set1);
        }else{
        cilj.put(set.getValue(),set1);
}

    });

    return cilj;

}
}






























