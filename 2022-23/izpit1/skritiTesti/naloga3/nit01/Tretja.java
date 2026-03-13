
/*
Samodejno testiranje:
tj.exe

Testni primeri:

01..03: toString
04..06: equals
07..10: hashCode

01, 04, 07: ročno izdelani; isti podatki v vseh treh razredih
*/

import java.util.*;

public class Tretja {

    public static class Tablica {
        private char[] kraj;
        private int stevilo;
        private boolean zacasna;
        private int zacasnaInt;
        private int hashCode;



        public Tablica(char[] kraj, int ste , boolean z){
            this.kraj = kraj;
            this.stevilo = ste;
            this.zacasna = z;
            this.zacasnaInt = (z) ? 1123432:123123;
            this.hashCode = kraj[0]*123 + kraj[1]*1111 + ste + zacasnaInt;
        }


        @Override
        public String toString(){
            String s = String.valueOf(this.kraj[0]) + String.valueOf(this.kraj[1]) + " " + this.stevilo/100 +"-"+ this.stevilo%100;
            return s;
        }

        public boolean equals(Tablica t){
            if(t.stevilo != this.stevilo){
                return false;
            }


            return t.hashCode==this.hashCode;
        }
        @Override
        public int hashCode(){
            return this.hashCode;
        }


    }
        /* 
        private char[] kraj;
        private int stevilo;
        private boolean zacasna;
        private String krajString;
        private int[] razpolovljenoStevilo;

        public Tablica(char[] kraj, int stevilo, boolean zacasna) {
            this.krajString = String.format("%s%s", kraj[0] , kraj[1]);
            this.kraj = new char[]{kraj[0], kraj[1]};
            this.stevilo = stevilo;
            this.zacasna = zacasna;

            this.razpolovljenoStevilo = vrniRazpolovljenoStevilo(stevilo);
        }
        private int[] vrniRazpolovljenoStevilo(int stevilo){
            int prvaPol = stevilo %100;
            int drugaPol = (stevilo - prvaPol) /100;
            int[] vrni = new int[2];
            vrni[0] = drugaPol;
            vrni[1] = prvaPol;
            return vrni;
        }
        // dopolnite ...

        @Override
        public String toString(){
            return String.format("%s %d-%d",krajString, razpolovljenoStevilo[0], razpolovljenoStevilo[1] );
        }

        public boolean equals(Tablica tablica) {
            return tablica.hashCode()==this.hashCode();
        }

        public int hashCode(){
          //  kraj.hashCode();
                int zacasnaa = (this.zacasna) ?  100 : 200;
            int koda = this.krajString.hashCode() +  this.stevilo + zacasnaa;
            return koda;



        } */




}
