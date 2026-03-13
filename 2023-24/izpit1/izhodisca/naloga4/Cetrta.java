
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01: primer iz besedila
02--03: prva skupina
04--05: druga skupina
06--07: tretja skupina
08--11: "cetrta skupina

POZOR: uporabljate lahko samo primitivne tipe, tipni parameter T in tip
Iterator<T>.
*/

import java.util.*;

public class Cetrta {

/*     public static void main(String[] args) {
        // dopolnite za potrebe ro"cnega testiranja
    } */

    public static <T extends Comparable<T>> Iterator<T> zlitje(Iterator<T> a, Iterator<T> b){
        return new Iterator<T>() {
            Iterator<T> prvi = a;
            Iterator<T> drugi = b;
            T vrni;
            boolean prviB = true;
            boolean prvic = true;   
            T prejsni = null;
            boolean shraniB = false;
            boolean shraniA = false;

            @Override
            public boolean hasNext(){
                if (prvic) {
                    T aa = (prvi.hasNext()) ?prvi.next() : null;
                    T bb = (drugi.hasNext()) ?drugi.next() : null;
                    if (aa.compareTo(bb) > 0 && aa!=null &&bb!= null) {
                        vrni = aa;
                        prejsni =bb;
                        shraniA = true;
                    }
                    else
                    vrni = (aa!= null) ? aa:(bb!=null) ? bb:null;
                    prvic = false;
                    return vrni!=null;
                }



                if (prviB) {
                    if (prvi.hasNext()) {
                        vrni = prvi.next();
                        prviB = false;
                        return true;
                    }
                    
                }
                else if( drugi.hasNext()){
                    vrni = drugi.next();
                    prviB = true;
                    return true;
                }
                return false;
            }
            @Override
            public T next(){
                return vrni;
            }
        };
    }
    
    /* {
        // popravite / dopolnite ...
        return new Iterator<T>() {
            private boolean aOstala;
            private boolean bOstala;
            private boolean prvic = true;
            private boolean maliAhasNext;
            private boolean maliBhasNext;
            private boolean samoAzastavica = false;
            private boolean samoBzastavica = false;
            private boolean shraniA;
            private boolean shraniB;
            private boolean prekini = false;

            private T next = null;
            private T vrni = null;

            @Override
            public boolean hasNext(){
                if (prvic) {
                    prvic = false;
                    maliAhasNext = a.hasNext();
                    maliBhasNext = b.hasNext();
                    if (maliAhasNext && maliBhasNext) {
                        T aa = a.next();
                        T bb = b.next();
                        if (aa.compareTo(bb) < 0) {
                            this.shraniB = true;
                            this.shraniA = false;
                            this.next = bb;
                            this.vrni = aa;
                        }
                        else{
                            this.shraniA = true;
                            this.shraniB = false;
                            this.next = aa;
                            this.vrni = bb;
                        }
                        return true;
                        
                    }
                    else if (maliAhasNext) {
                        this.samoAzastavica = true;
                        this.vrni = a.next();
                        return true;
                    }
                    else if (maliBhasNext){
                        this.samoBzastavica = true;
                        this.vrni = b.next();
                        return true;
                    }
                    return false;
                }


                if (samoAzastavica) {
                    boolean ba = a.hasNext();
                    T aaa = (ba)? a.next():null;
                    vrni = aaa;
                    return ba;
                }
                if (samoBzastavica) {
                    boolean bb = b.hasNext();
                    T bbb = (bb)? b.next():null;
                    vrni = bbb;
                    return bb;
                }
                
                if (shraniB &&!prekini) {
                    boolean ab = a.hasNext();
                    T aa =(ab)? a.next():null;
                    if (ab && aa.compareTo(next) < 0) {
                        this.vrni = aa;
                        return true;
                    }
                    this.vrni = next;
                    this.next = aa;
                    if (!ab) {
                        samoBzastavica = true;
                    }
                    shraniA = true;
                    shraniB = false;
                    return true;
                }
                if (shraniA && !prekini) {
                    boolean ba = b.hasNext();
                    T bb = (ba) ? b.next():null;
                    if (ba && bb.compareTo(next)<0) {
                        this.vrni = bb;
                        return true;
                    }
                    this.vrni = next;
                    this.next = bb;
                    if (!ba) {
                        samoAzastavica=true;
                    }
                    shraniA = false;
                    shraniB = true;
                    return true;

                }


                return false;
            }
            @Override
            public T next(){
                return this.vrni;
            }

        };
        }
     */
    }
        
    // pomo"zne metode (po potrebi) ...

