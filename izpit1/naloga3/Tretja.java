
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01--05: klici metode <monokultura>
06--10: klici metode <meraSosednosti>
01, 06: ro"cno izdelana
02--05, 07--10: samodejno izdelani

Primera 01 in 06 vsebujeta iste grede, razlikujeta se le po klicih metod.
*/

import java.util.*;

public class Tretja {

    // Dopolnite lahko katerikoli razred, lahko pa dodate tudi lastne notranje
    // razrede.

    private static final int[][] SOSEDNOST = {
        //                 0   1   2   3   4    5
        //                 C,  F,  G,  K,  P,  Zco
        /* 0 Cebula */    {  0, -1, -1,  1,  1,  0 }, // TO JE GREDA IN ENA STVAR NOT JE VRTENINA
        /* 1 Fizol */     { -1,  0, -1,  0,  0,  1 },
        /* 2 Grah */      { -1, -1,  0,  1,  0,  1 },
        /* 3 Korenje */   {  1,  0,  1,  0, -1, -1 },
        /* 4 Petersilj */ {  1,  0,  0, -1,  0, -1 },
        /* 5 Zelena */    {  0,  1,  1, -1, -1,  0 },
    }; 

    private static final String[] RAZREDI = {
        "Cebula", "Fizol", "Grah", "Korenje", "Petersilj", "Zelena"
    };
    private static final int[] RAZREDINT = {0,1,2,3,4,5,};

    //=========================================================================

    public static class Vrt {
        private Vrtnina[][] grede;

        public Vrt(Vrtnina[][] grede) {
            this.grede = grede;
        }

        public boolean monokultura(int ixGrede) {
            if (grede[ixGrede].length>0) {
                
                int x = 1;
                int i =-1;
                for(Vrtnina vrtnina : this.grede[ixGrede]){
                    String a = vrtnina.imeRazreda();

                    if (i>=0) {
                        Vrtnina kultura = grede[ixGrede][i];
                        String b = kultura.imeRazreda();
                        if (! a.equals(b)) {
                            return false;
                        }
                    
                    }
                    i++;
                }
            }
             return true;
        }

        public int meraSosednosti() {
            ArrayList<String> razredi = new ArrayList<String>();
            razredi.add("Cebula");
            razredi.add("Fizol");
            razredi.add("Grah");
            razredi.add("Korenje");
            razredi.add("Petersilj");
            razredi.add("Zelena");


            
            int vsota = 0;
         //   System.out.println("AAAAAAAAAAAAAAAAAAAAAA"+this.grede.length);
            int dolzina = (this.grede.length > 1) ? this.grede.length-1 : this.grede.length;
            for(int i = 0; i < dolzina; i++){
            for(Vrtnina vrtnina : this.grede[i]){
          //      System.out.println(i);
                vsota += SOSEDNOST[i][razredi.indexOf(vrtnina.imeRazreda())];
            }
}
            return vsota;
        }
    }

    //=========================================================================

    public static abstract class Vrtnina {
    
        public  Vrtnina(){
        }

        public String imeRazreda() {
            return this.getClass().getSimpleName();
        }
    }

    //=========================================================================

    public static class Cebula extends Vrtnina {
        int koda;
        public  Cebula(){
            this.koda = 1;
        }
    }

    //=========================================================================

    public static class Fizol extends Vrtnina {
        int koda;
        public  Fizol(){
            this.koda = 2;
        }
    }

    //=========================================================================

    public static class Grah extends Vrtnina {
        int koda;
        public  Grah(){
            this.koda = 3;
        }
    }

    //=========================================================================

    public static class Korenje extends Vrtnina {
        int koda;
        public  Korenje(){
            this.koda = 4;
        }
    }

    //=========================================================================

    public static class Petersilj extends Vrtnina {
        int koda;
        public  Petersilj(){
            this.koda = 5;
        }
    }

    //=========================================================================

    public static class Zelena extends Vrtnina {
        int koda;
        public  Zelena(){
            this.koda = 6;
        }
    }


}
