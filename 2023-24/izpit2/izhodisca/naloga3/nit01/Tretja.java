
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01--06: ro"cno izdelani
07--12: samodejno izdelani

01--02, 07--08: klici metode steviloStanovanj
03--04, 09--10: klici metode koliko
05--06, 11--12: klici metode poslovnaCetrt

01, 03, 05, 07, 09, 11: brez ru"senja
02, 04, 06, 08, 10, 12: z ru"senjem
*/

import java.util.*;

public class Tretja {

    public static void main(String[] args) {
        // dopolnite za potrebe ro"cnega testiranja
    }


   static class Mesto{
        private int stVrstic;
        private int stStolpcev;
        ArrayList<ArrayList<Stavba>> koordinate = new ArrayList<>();
        private int[][] stavbe;
        private int stPoslovnih;
        private int stStanovanskih;


        public Mesto(int stVrstic, int stStolpcev){
            this.stStolpcev = stStolpcev;
            this.stVrstic = stVrstic;
            this.stavbe = new int[this.stVrstic][this.stStolpcev];
        }

        public void postavi(int vrstica, int stolpec, Stavba stavba){
            int a =this.stavbe[vrstica][stolpec] ;
            if(a==-10){
                this.stPoslovnih--;
            }
            else if (a >0){
                this.stStanovanskih--;
            }
            int b = stavba.vrniKodo();
            this.stavbe[vrstica][stolpec] = b;
            if(b==-10){
                this.stPoslovnih++;
            }
            else{
                this.stStanovanskih++;
            }


        }

        public int steviloStanovanj(){
            int g = 0;
            for(int i = 0; i < stVrstic; i++){
                for(int j = 0 ; j < stStolpcev ; j++){
                    g += (this.stavbe[i][j]>0) ? this.stavbe[i][j] : 0;
                }
            }
            return g;
        }

        public int koliko(Stavba stavba){
            return (stavba.jePoslovna()) ? this.stPoslovnih : this.stStanovanskih;
        }

    public boolean poslovnaCetrt(int vrZac, int stZac,int vrKon, int stKon){

        for(int i = vrZac ; i < vrKon+1 ; i++){
            for(int j = stZac ; j < stKon+1 ; j++){
                if (this.stavbe[i][j] != -10) {
                    return false;
                }
            }
        }

        return true;

}


    }

   static class Stavba{
        private boolean poslovna;
        private int stanovanja;


        public Stavba(boolean a , int s ){
            this.poslovna = a;
            this.stanovanja = s;
        }
        public int vrniKodo(){
            return this.stanovanja;
        }

        public boolean jePoslovna(){
            return this.poslovna;
        }
        public int stStanovan(){
            return this.stanovanja;
        }

    }

    static class Poslovna extends Stavba{
        public Poslovna(){
            super(true,-10);
        }
    }
    static class Stanovanjska extends Stavba{
        public Stanovanjska(int s){
            super(false, s);
        }
    }

}