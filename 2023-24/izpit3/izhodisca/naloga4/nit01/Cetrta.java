
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01--05: klici metode skupne
06--10: klici metode poDolziniBrezDuplikatov

01, 02, 06, 07: ro"cno izdelani
*/

import java.util.*;

public class Cetrta {

    public static void main(String[] args) {
        // dopolnite, "ce "zelite metodi testirati ro"cno
    }

    public static <T> Set<T> skupni(List<List<T>> s) {
        Set<T> koncni = new HashSet<>();
        List<T> zacetni = s.getFirst();
        s.remove(0);
        for(T t : zacetni){
            boolean dodaj = true;
            for(List<T> ts : s){
                if (!ts.contains(t)) {
                    dodaj = false;
                }
            }
            if (dodaj) {
                
                koncni.add(t);
            }
        }

        // popravite / dopolnite ...
        return koncni;
    }

    public static <T> void poDolziniBrezDuplikatov(List<List<T>> s) {
        ArrayList<Set<T>> set = new ArrayList<>();
 
        Comparator<List<T>> comp = new Comparator<>() {
            @Override
            public int compare(List<T> a , List<T> b){
            HashSet<T> set1 = new HashSet<>();
            for(T ts : a){
                set1.add(ts);
            }
            HashSet<T> set2 = new HashSet<>();
            for(T tt : b){
                set2.add(tt);
            }
            
            return set1.size() - set2.size();
            }
        };
        s.sort(comp);





        // dopolnite ...
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
