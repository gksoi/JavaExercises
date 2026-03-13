
/*
 * tj.exe
 */

import java.util.*;

public class Druga {

    public static int stolpecZNajvecPrevladujoceZelenimi(int[][][] slika) {
        // popravite / dopolnite ...
        int rekord = 0;
        int vrni = 0;
        int stVrstic = slika.length;
        int[] stolpecStetje = new int[slika[0].length];
        for(int vrstica = 0; vrstica < stVrstic ; vrstica++){
            int stStolpcev = slika[vrstica].length;
            
            for(int stolpec = 0; stolpec < stStolpcev; stolpec++){
                int rdeca = slika[vrstica][stolpec][0];
                int zelena = slika[vrstica][stolpec][1];
                int modra = slika[vrstica][stolpec][2];        
                if (zelena > rdeca && zelena > modra) {
                    stolpecStetje[stolpec]++;
                }        
                
            }
        }
        for(int i = 0; i < stolpecStetje.length; i++){
            if (rekord < stolpecStetje[i]) {
                rekord = stolpecStetje[i];
                vrni =i;
            }
        }
       
        // System.out.println(Arrays.toString(stolpecStetje));
        return vrni;
    }

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
