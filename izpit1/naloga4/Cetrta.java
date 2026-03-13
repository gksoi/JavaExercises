
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01: primer iz besedila
02--06: visina = 1
01, 07--10: splo"sni primeri
*/

import java.util.*;

public class Cetrta {

    public static Iterator<String> piramidator(int visina, int odmik) {
        // popravite / dopolnite ...
        return new Piramidator(visina, odmik);
    }

    private static class Piramidator implements Iterator<String>{
        private int visina;
        private int odmik;
        private int vrstica, stolpec;
        private int dolzina;
        private int steviloMinusov;
        private int steviloZvezd;

        public Piramidator(int visina, int odmik){
            this.visina = visina;
            this.odmik = odmik;
            this.vrstica = 0;
            this.stolpec = 0;
            this.dolzina = visina + odmik;
            this.steviloMinusov = dolzina-1;
            this.steviloZvezd =1;
        }


        @Override
        public boolean hasNext(){
            return this.vrstica < this.visina;
        }

        @Override
        public String next(){
            if (stolpec==dolzina) {
                this.vrstica++;
                this.dolzina+=1;
                this.stolpec = 0;
                this.steviloMinusov--;
                return String.format("%n");
            }
            if (stolpec<odmik) {
                this.stolpec++;
                return "-";
            }
            if (this.stolpec < steviloMinusov) {
                this.stolpec++;
                return "-";
            }
            this.stolpec++;
             return "*";


            
            
        }




    }


    // pomo"zne metode, notranji razredi (po potrebi) ...
}
