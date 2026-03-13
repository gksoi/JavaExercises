
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01--05: klici metode zamenjaj
06--10: preverjanje implementacije vmesnika Iterable<T>
01--03, 06--08: ro"cno izdelani
*/

import java.util.*;

public class Cetrta {

    public static class Miks<T> implements Iterable<T> {
        private List<T> seznam;
        private Set<T> mnozica;

        public Miks(List<T> seznam, Set<T> mnozica) {
            this.seznam = seznam;
            this.mnozica = mnozica;
        }

        @Override
        public String toString() {
            return String.format("%s | %s", this.seznam, this.mnozica);
        }

        public List<T> vrniSeznam() {
            return this.seznam;
        }

        public Set<T> vrniMnozico() {
            return this.mnozica;
        }

        public void zamenjaj() {
            List<T> s = new ArrayList<>();
            for(T t : this.mnozica){
                s.add(t);
            }
            Set<T> set = new HashSet<>();
            for(T t : this.seznam){
                set.add(t);
            }

            this.seznam = s;
            this.mnozica = set;

            // dopolnite ...
        }
        public Iterator<T> iterator(){
            return new Iterator<T>() {
                Iterator<T> itSez = seznam.iterator();
                Iterator<T> itMno = mnozica.iterator();
                boolean sez = false;

                @Override
                public boolean hasNext(){
                    if (itSez.hasNext()) {
                        sez = true;
                        return true;
                    }
                    if(itMno.hasNext()){
                        sez=false;
                        return true;
                    }
                    return false;
                }

                @Override
                public T next(){
                    return (sez) ? itSez.next() : itMno.next();
                }
            };
        }
    }

    //=========================================================================

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi) ...
    }
}
