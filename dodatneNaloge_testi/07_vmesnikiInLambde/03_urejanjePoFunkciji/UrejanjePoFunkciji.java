import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class UrejanjePoFunkciji{
    private static class Urejevalniki{

        public static <T,R extends Comparable<R>> Comparator<T> funkcijski(Function<T,R> funkcija){
            return  new FunkcijskiComparator<T,R>(funkcija);
        } 


        private static class FunkcijskiComparator< T , R extends Comparable< R >> implements Comparator<T>{
            private Function<T , R> funkcija;

            public FunkcijskiComparator(Function<T,R> funkcija){
                this.funkcija = funkcija;
            }

            
            @Override
            public int compare(T a , T b){
                return this.funkcija.apply(a).compareTo(this.funkcija.apply(b));
            }
        }
    }


    public static <T, R extends Comparable<R>> void urediPoFunkciji( List<T> seznam, Function<T, R> funkcija){
        seznam.sort(Urejevalniki.funkcijski(funkcija));
        
    }

    public static void urediPoAbsolutniVrednosti(List<Integer> stevila){

         class AbsolutnaVrednost implements Function< Integer, Integer >{
            @Override
            public Integer apply(Integer a ){
                return Math.abs(a);
            }
        }

        AbsolutnaVrednost abs = new AbsolutnaVrednost();
        urediPoFunkciji(stevila, abs);
    }

    public static void urediPoDolzini(List<String> nizi){
        class PoDolzini implements Function<String, Integer>{
            @Override
            public Integer apply(String a ){
                return a.length();
            }
        }

        PoDolzini pod = new PoDolzini();
        urediPoFunkciji(nizi,pod);



    }


    public static <T extends Comparable<T>> List<Integer> vrstniRed(List<T> seznam){
        class  NaravniComparator<T extends Comparable<T>> implements Comparator<T>{

            @Override
            public int compare( T a , T b){
                return a.compareTo(b);
            }
        }

        List<T> neSortiran = seznam.stream().collect(Collectors.toList());
        NaravniComparator<T> naravni = new NaravniComparator();
        seznam.sort(naravni);
        List<Integer> list = seznam.stream().map(p -> neSortiran.indexOf(p)).collect(Collectors.toList());



        /* 
         * 
         * kaj sm naredu:
         * najperj sm naredu comparator ki primerja z naravni compareTo vse elemente
         * pol sm naredu še en List, ki je identicen podanemu seznamu
         * seznam sm potem sortiral s .sort(prejNarejenComparator)
         * potem pa sem naredu se en List<Integer> tako da sm naredu:
         * seznam.stream().map(p -> nesortiran.indexOf(p)).collect(Collectors.toList())
         * in tko mapiral za vsak objekt v podanem seznamu za njega index v nesortiranem
         */
        return list;



    }



























/* 

//f(p) < f(q) kar pomeni, da je v urejene, seznamu p pred q
public static <T, R extends Comparable<R>> void urediPoFunkciji( List<T> seznam, Function<T, R> funkcija){
    seznam.sort(Comparator.comparing(funkcija));


}

public static void urediPoAbsolutniVrednosti(List<Integer> stevila){
    urediPoFunkciji(stevila, Math::abs);

}

public static void urediPoDolzini(List<String> nizi){
    urediPoFunkciji(nizi, x->x.length());
}



public static <T extends Comparable<T>> List<Integer> vrstniRed(List<T> seznam){
    ArrayList<T> urejen = new ArrayList<>();
    urejen.addAll(seznam);
    urejen.sort(Comparator.naturalOrder());
    ArrayList<Integer> indexi = new ArrayList<>();
    for(T niz : seznam){
        indexi.add(urejen.indexOf(niz));

    }

    return indexi;


}








 */
















}