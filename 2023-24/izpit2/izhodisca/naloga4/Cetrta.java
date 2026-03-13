
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01, 02: ro"cno izdelana
03--10: samodejno izdelani

01, 03--06: klici metode alternirajoceMonotono
02, 07--10: klici metode generator
*/

import java.util.*;
import java.util.function.*;

public class Cetrta {

/*     public static void main(String[] args) {
        List<Integer> intList = List.of(1, 2,3,4,5,6,7);
        List<Integer> polovica = intList.stream().filter(p->intList.indexOf(p)%2 ==0).toList();   
        System.out.println(polovica);

        // dopolnite za potrebe ro"cnega testiranja
    }
 */
public  static boolean  sodo = true;
public static <T> boolean alternirajoceMonotono(List<T> zaporedje, Comparator<T> comparator){
    List<T> zaporedjeL = zaporedje.stream().filter(p-> zaporedje.indexOf(p)%2==1).toList();
    List<T> zaporedjeS = zaporedje.stream().filter(p-> zaporedje.indexOf(p)%2==0).toList();
        Comparator<T> noviComparator = new Comparator<T>() {
            @Override
            public int compare(T a , T b){
                int i = comparator.compare(a, b);
                sodo = i!=0;
                return i;
            }
        };

        ArrayList<T> zaporedjeLneurejeno = new ArrayList<>(zaporedjeL);
        ArrayList<T> zaporedjeRneurejeno = new ArrayList<>(zaporedjeS);
        zaporedjeLneurejeno.sort(noviComparator.reversed());
        zaporedjeRneurejeno.sort(noviComparator);
        for(T t : zaporedjeL ){
            if (zaporedjeLneurejeno.indexOf(t)!=zaporedjeL.indexOf(t)) {
                sodo = false;
            }

        }
        for(T r : zaporedjeS){
            if (zaporedjeRneurejeno.indexOf(r)!=zaporedjeS.indexOf(r)) {
                sodo = false;
            }
        }
        boolean sodo2 = sodo;
        sodo = true;
                return sodo2;


/* 
        Iterator<T> sodiIterator = new Iterator<T>() {
            private int index = -2;
            @Override
            public boolean hasNext(){
                this.index +=2;
                return zaporedje.size() > index;
            }
            @Override
            public T next(){
                return zaporedje.get(index);
            }

        };
        Iterator<T> lihIterator = new Iterator<T>() {
            private int index = -1;
            @Override
            public boolean hasNext(){
                this.index +=2;
                return zaporedje.size() > index;
            }
            @Override
            public T next(){
                return zaporedje.get(index);
            }

        };
        boolean liho = true;
        boolean sodo = true;

        if (zaporedje.size()<3) {
            return true;
        }



        T prejsni = zaporedje.getFirst();
        while (sodiIterator.hasNext()) {

            T novi =sodiIterator.next();

            if (comparator.compare(prejsni, novi) > 0) {
                sodo = false;
            }
            prejsni = novi;
        }

        T prejsniLihe = zaporedje.get(1);
        while (lihIterator.hasNext()) {
            T novil = lihIterator.next();

            if (comparator.compare(prejsniLihe, novil) < 0) {
                liho = false;
            }
            prejsniLihe = novil;
        }
        return sodo && liho; */

/* 
        Iterator<T> it = zaporedje.iterator();
        List<T> soda = zaporedje.stream().filter(p->zaporedje.indexOf(p)%2 ==0).toList();   
        List<T> liha = zaporedje.stream().filter(p->zaporedje.indexOf(p)%2 ==1).toList();   

        Iterator<T> sodeeIterator = soda.iterator();
        Iterator<T> lihIterator = liha.iterator();
        T prejsni = soda.getFirst();
        while (sodeeIterator.hasNext()) {
            T novi = sodeeIterator.next();
            if (comparator.compare(prejsni, novi)>0) {
                sodo = false;
            }
        }
        T prejsniLihe = liha.getFirst();
        while (lihIterator.hasNext()) {
            T novil = lihIterator.next();
            if (comparator.compare(prejsniLihe, novil) < 0) {
                liho = false;
            }
        }


 */

    } 

    public static Supplier<Integer> generator(int a, int b){
        return new Supplier<Integer>() {
            int k = 0;
            boolean sodo = true;

            @Override
            public Integer get(){
                if (sodo) {
                    sodo = false;
                    return a + (k*b);
                }
                else{
                    k++;
                    sodo = true;
                    return a - (k*b);
                }
            }


        };

    }
    /* {
      //  Collections.sort(zaporedje);
        boolean prvaB = true;
        boolean druga = true;
        if (zaporedje.size() <= 2) {
            return true;
        }
        T prva = zaporedje.get(0);
        T prvaPriDrugi = zaporedje.get(1);
        for(int i = 0; i< zaporedje.size(); i=i+2){
            T naslednja = zaporedje.get(i);
        
            if (comparator.compare(prva, naslednja) >= 0) {
                return false;
            }
            prva = naslednja;
        }


        for(int x = 0; x < zaporedje.size(); x=x+2 ){
            T naslednjaa = zaporedje.get(x);
        if (comparator.compare(prvaPriDrugi, naslednjaa) <= 0) {
            return false;
        }
            prvaPriDrugi = naslednjaa;
    }
        return prvaB && druga;
    }
 */
/*     public static Supplier<Integer> generator(int a, int b) {


        




    } */
    /* {
        return new Supplier<Integer>() {
            int index = 1;
            int notranjiIndex=0;
            int aa = a;
            int bb = b;

            @Override
            public Integer get(){
                
                if (index==0) {
                    notranjiIndex++;
                    return aa;
                }
                
                if (index %2 == 0) {
                    notranjiIndex++;
                    return aa - index*bb;
                }
                else{
                    notranjiIndex++;
                    int lokalniIndex = index;
                    if (notranjiIndex%2==0) {
                        index++;
                    }
                    
                    return aa + lokalniIndex*bb;
                }


            }


        };

    }
 */
    // pomo"zne metode, notranji razredi (po potrebi) ...
}
