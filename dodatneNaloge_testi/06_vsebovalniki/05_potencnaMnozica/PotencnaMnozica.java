import java.math.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PotencnaMnozica{

    public static <T> Set<Set<T>> potencna(Set<T> mnozica){
        Set<Set<T>> potenca = new HashSet<>();
        potenca.add(Set.of());




        for(T t : mnozica){
            for(T b : mnozica){
                for (T c : mnozica){
                    for(T k:mnozica){
                        for(T l: mnozica){
                        for(T p: mnozica){
                    Set<T> set1 = new HashSet<>();
                    set1.add(t);
                    set1.add(b);
                    set1.add(c);
                    set1.add(k);
                    set1.add(l);
                    set1.add(p);
                    potenca.add(set1);
                   } 
                        
                        }           
                    }
                }
            }
        }
        return potenca;



    }
}

















/* 

//potencna mnozica mora IMPLEMENTIRAT ITERABLE, preko katerega mora potem narediti metodo __public Iterator<T> iterator()__
//ta metoda pa more vrnit Iterator, ki ga potem v privatnem classu naredimo
public class PotencnaMnozica<T> implements Iterable<T>{
    private ArrayList<T> mnozica;
 
    public PotencnaMnozica(ArrayList<T> novaMnozica){
        this.mnozica = novaMnozica;
    }

    
    //metoda vrne Iterator
    @Override
    public Iterator<T> iterator(){
        return new PotencniIterator();
    }


//tukaj narejen ITerator, ki implementira ITERATOR ne iterable, preko tega pa potem more naslednji dve metodi definirat
    private class PotencniIterator implements Iterator<T>{
        private int index = 0;


        //vrne, ali je ze iteriral čez celo mnozico
        @Override
        public boolean hasNext(){
            return this.index < mnozica.size();
        }
        

        //vrne naslednjo v mnozici
        @Override
        public T next(){
             return mnozica.get(index++);
        }


        
    }
}
 */



