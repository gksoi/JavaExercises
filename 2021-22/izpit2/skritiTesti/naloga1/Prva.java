
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
        int s =0;
        boolean a = false;
        for(int i = 0; i < stKupcev; i++){
            int zahteva = scanner.nextInt();
            s += zahteva;
            if (zahteva > stGlavRN) {
                stBranjevk++;
                stGlavRN = stGlav;
                a =true;
            }
            if (zahteva == stGlavRN && a) {
                // stBranjevk++;
                stGlavRN = stGlav;
            }
            else{
                stGlavRN -= zahteva;

            }
            a = false;
        }
/*         System.out.println("....." +s);
        if (s == stKupcev) {
            stBranjevk = s;
        } */
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
