
/*
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int stGlav = scanner.nextInt();
        int stKupcev = scanner.nextInt();
        int stGlavRN = stGlav;
        int stBranjevk = 1;
        for(int i = 0; i < stKupcev; i++){
            int zahteva = scanner.nextInt();
            if (stGlavRN - zahteva < 0) {
                stBranjevk++;
                stGlavRN = stGlav;
            }          
                stGlavRN -= zahteva;
        }

        System.out.println(stBranjevk);
    }
    
    
/*     {
        Scanner scanner = new Scanner(System.in);
        int zaloga = scanner.nextInt();
        int steviloKupcoev = scanner.nextInt();
        int trenutnaZaloga= zaloga;
        int stevilo= 0;
        for(int i =0; i<steviloKupcoev; i++){
            int zahteva = scanner.nextInt();
            if (trenutnaZaloga-zahteva <0) {
                stevilo++;
                trenutnaZaloga = zaloga;
                
            }
            trenutnaZaloga =trenutnaZaloga - zahteva;



        }
        System.out.println(stevilo+1);


    } */
}
