
/*
 * tj.exe
 */

import java.util.*;

public class Cetrta {

    public static <T> List<T> odsek(Iterator<T> it, int začetek, int konec){
        List<T> list = new ArrayList<>();
        for(int i =0 ; i <= konec; i++){
            it.hasNext();
            T a = it.next();
            if (i>=začetek) {
                list.add(a);
            }
        }
        return list;
    }


/*      {
        ArrayList<T> odsek = new ArrayList<>();
        int index = 0;
        while (it.hasNext() && index <= konec) {
            if (index >= začetek ) {
                odsek.add(it.next());
            }
            else{
            it.next();
            }
            index++;
        }


        // popravite / dopolnite ...
        return odsek;
    }
 */
    public static Iterator<Integer> manjkajoci(Iterator<Integer> it2, int zacetek){
        return new Iterator<Integer>() {
            int indexRN = zacetek - 1;
            Iterator<Integer> it = it2;
            Integer vrni;
            boolean s = it.hasNext();
            Integer o = it.next();

            @Override
            public boolean hasNext(){
                indexRN++;
                it.hasNext();
                Integer o = it.next();

                while(o != zacetek){
                    it.hasNext();
                    o = it.next();
                }
                vrni = o;

                return true;
            }
            @Override
            public Integer next(){
                if (o > ++indexRN) {
                    return indexRN;
                    
                }
                else{
                    while(o==indexRN){
                        it.hasNext();
                        o = it.next();
                        indexRN++;
                    }
                    return indexRN;

                }

            }

        };

    }
    
/*     
    {

        return new Iterator<Integer>() {
            int index = zacetek;
            @Override
            public boolean hasNext(){
                return true;
            }

            @Override
            public Integer next(){
                if (it.hasNext()&& it.next() == index) {
                    
                    index++;
                }

                return index++;
            }
        };

        // popravite / dopolnite ...
    }
 */
    public static void main(String[] args){

    }
    
/*     {
        Integer za = Integer.valueOf(12);
        System.out.println(za.MAX_VALUE+" " +Integer.MIN_VALUE);
        // koda za ro"cno testiranje (po potrebi)
    }
 */


}
