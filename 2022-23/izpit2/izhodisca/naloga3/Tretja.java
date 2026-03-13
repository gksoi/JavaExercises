
/*
Samodejno testiranje:
tj.exe

Javni testni primeri:
01-03: razdalja2
04-06: poPredpisih
07-10: najTip
01, 04, 07: ro"cno izdelani
*/

import java.util.*;

public class Tretja {

    //=========================================================================

    public static class Igrisce {
        private Igralo[] igrala;

        public Igrisce(Igralo[] igrala) {
            this.igrala = igrala;
        }

        public boolean poPredpisih() {
            // popravite / dopolnite ...
            for(int i = 0; i < this.igrala.length; i++){
                Igralo prvoIgralo = this.igrala[i];
                for(int j = 0; j < this.igrala.length ; j++){
                    if(i==j){
                        break;
                    }
                Igralo druIgralo = this.igrala[j];
                    
                int razdalja = prvoIgralo.minRazdalja2();
                int razdaljaNaslednega = druIgralo.minRazdalja2();

                int vecja = (razdalja > razdaljaNaslednega) ? razdalja :razdaljaNaslednega;
                int razdaljaMedDvema = prvoIgralo.razdalja2(druIgralo);
                // System.out.println(vecja + " "+ prvoIgralo);
                if(razdaljaMedDvema < vecja){
                    return false;
                }
                // prvoIgralo = igrala[i];
                }
            }


            return true;
        }

        public int najTip() {
            int[] tipi = new int[4];

            for(int i = 0 ; i < this.igrala.length ; i++){
                tipi[this.igrala[i].koda()]++;
            }
            int najvec = tipi[0];
            int indeksN= 0;
            for(int k = 0; k < 4 ; k++){
                if (tipi[k]>najvec) {
                    najvec = tipi[k];
                    indeksN = k;
                }
            }
            // popravite / dopolnite ...
            return indeksN;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static abstract class Igralo {
        private int x;
        private int y;
        private int koda;

        protected Igralo(int x, int y, int koda) {
            this.x = x;
            this.y = y;
            this.koda = koda;
        }
        public int koda(){
            return this.koda;
        }
        @Override
        public String toString(){
            return "igralo na mestu" + this.x+ " " + this.y;
        }
        public abstract int minRazdalja2();

        public int razdalja2(Igralo igr) {
            // popravite / dopolnite ...
            int xIgr = igr.x;
            int yIgr = igr.y;
            return (this.x-xIgr)*(this.x-xIgr)+(this.y-yIgr)*(this.y-yIgr);

        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static class Gugalnica extends Igralo {
        public Gugalnica(int x, int y) {
            super(x, y,0);
        }

        @Override
        public int minRazdalja2() {
            return 200 * 200;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static class Tobogan extends Igralo {
        public Tobogan(int x, int y) {
            super(x, y,1);
        }

        @Override
        public int minRazdalja2() {
            return 150 * 150;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static class Plezalo extends Igralo {
        public Plezalo(int x, int y) {
            super(x, y,2);
        }

        @Override
        public int minRazdalja2() {
            return 130 * 130;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    public static class Vzmetnik extends Igralo {
        public Vzmetnik(int x, int y) {
            super(x, y,3);
        }

        @Override
        public int minRazdalja2() {
            return 100 * 100;
        }

        // po potrebi dopolnite ...
    }

    //=========================================================================

    // pomo"zne metode, notranji razredi (po potrebi) ...

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi) ...
    }
}
