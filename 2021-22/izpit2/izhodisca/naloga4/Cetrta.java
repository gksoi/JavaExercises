
/*
 * tj.exe
 */

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.*;

public class Cetrta {

    public static class Tocka {
        private int x;
        private int y;

        public Tocka(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return String.format("(%d, %d)", this.x, this.y);
        }
        public int vrniX (){return this.x;}
        public int vrniY (){return this.y;}
        
        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tocka)) {
                return false;
            }
            Tocka druga = (Tocka) obj;
            return this.x == druga.x && this.y == druga.y;
        }

        @Override
        public int hashCode() {
            return 17 * this.x + 31 * this.y;
        }

        public Map<Boolean, List<Tocka>> razdeli(Collection<Tocka> tocke){
            HashMap<Boolean , List<Tocka>> vrni = new HashMap<>();
            ArrayList<Tocka> vrniTru = new ArrayList<>();
            ArrayList<Tocka> vrnifals = new ArrayList<>();


            tocke.stream().forEach(t ->{if(t.x > this.x) {vrniTru.add(t);} else {vrnifals.add(t);}});
            vrni.put(true, vrniTru);
            vrni.put(false, vrnifals);
            return vrni;


        }
        public static Comparator<Tocka> polarno() {
            return new Comparator<Cetrta.Tocka>() {
                @Override
                public int compare(Tocka a , Tocka b){

                    double oddaljenostA = Math.sqrt(a.x*a.x + a.y*a.y);
                    double oddaljenostB = Math.sqrt(b.x*b.x + b.y*b.y);
                    // System.out.println("tocka "+a+" oddaljena od 0,0 :"+ oddaljenostA);

                     if (Double.compare(oddaljenostA, oddaljenostB)==0){
                        
                        double kotA =(a.y>a.x)? Math.tan(oddaljenostA):90-Math.tan(oddaljenostA);
                        double kotB =(b.y>b.x)? Math.tan(oddaljenostB):90-Math.tan(oddaljenostB);


                        if (a.x < 0 &&a.y >0) {
                            kotA += 90;
                        }
                        else if (a.x < 0 &&a.y <0) {
                            kotA += 180;
                        }
                        else if(a.y < 0 && a.x > 0){
                            kotA += 270;
                        }

                        if (b.x < 0 && b.y > 0) {
                            kotB += 90;
                        }
                        else if (b.x < 0 && b.y <0) {
                            kotB += 180;
                            
                        }
                        else if(b.y < 0 && b.x > 0){
                            kotB += 270;
                        }

                        return Double.compare(kotA, kotB);

                    }
                    return Double.compare(oddaljenostA, oddaljenostB);



                }
            };
        }
        
        
    }
    
    
    public static void main(String[] args) {
        // int o =  String.hashCode("AAAAAAAAAAA");
        // koda za ro"cno testiranje (po potrebi)sout   
    }


    /* 
    {
        // popravite / dopolnite ...
        return new Comparator<Tocka>() {
            @Override
            public int compare(Tocka tockaA, Tocka tockaB){
                BigDecimal aNakvadratX = BigDecimal.valueOf(tockaA.vrniX()).pow(2);
                BigDecimal aNakvadratY = BigDecimal.valueOf(tockaA.vrniY()).pow(2);

                BigDecimal aOddaljenost = aNakvadratX.add(aNakvadratY);
                aOddaljenost = aOddaljenost.sqrt(new java.math.MathContext(10, RoundingMode.HALF_DOWN));
               // aOddaljenost.round(RoundingMode.HALF_DOWN);
                
                BigDecimal bNakvadratX = BigDecimal.valueOf(tockaB.vrniX()).pow(2);
                BigDecimal bNakvadratY = BigDecimal.valueOf(tockaB.vrniY()).pow(2);

                BigDecimal bOddaljenost = bNakvadratX.add(bNakvadratY);
               // aOddaljenost.round(null);
               bOddaljenost=bOddaljenost.sqrt(new java.math.MathContext(10, RoundingMode.HALF_DOWN));

                if (bOddaljenost.intValue() < aOddaljenost.intValue()) {
                    return 1;
                }
                
                if (bOddaljenost.intValue() > aOddaljenost.intValue()) {
                    return -1;
                }

                
                double kotA = Math.asin(tockaA.vrniX()/aOddaljenost.intValue());
                double kotB = Math.asin(tockaB.vrniX()/bOddaljenost.intValue());

                if (kotB > kotA) {
                    return 1;
                }

                if (kotB < kotA) {
                    return -1;
                }



                return 0;
            }
            
            
            
        };
    }

 */

/* 
 *  {
            Map<Boolean, List<Tocka>> mapa = new HashMap<>();
            ArrayList<Tocka> trueVecje = new ArrayList<>();
            ArrayList<Tocka> falseManjse = new ArrayList<>();
            for(Tocka tocka : tocke){
                if (tocka.vrniX() > this.x) {
                    trueVecje.add(tocka);
                    
                }
                else{
                    falseManjse.add(tocka);
                }

            }

            mapa.put(true, trueVecje);
            mapa.put(false, falseManjse);



            // popravite / dopolnite ...
            return mapa;
        }

 */




}
