
/*
Samodejno testiranje:
tj.exe

Javni testni primeri:
01: primer iz besedila
02-04: ni premikov levo in navzgor
01, 05-10: splo"sni primeri
*/

import java.util.*;

public class Druga {

    public static int[] poLomljenki(boolean[][] matrika) {
        // popravite / dopolnite ...
        int[] rezult = new int[4];
        int i = 1;
        int k = 1;
        int[] prejsneKoordinate = {i,k};
        while(true){
            // System.out.println("aa");
            if (matrika[i+1][k]) {
                // System.out.println("dol");
                // prejsneKoordinate[0] = i;
                // prejsneKoordinate[1] = k;
                matrika[i][k]=false;
                i++;
                rezult[3] ++;
            }
            else if (matrika[i][k+1]){
                // System.out.println("desno");
                // prejsneKoordinate[0] = i;
                // prejsneKoordinate[1] = k;
                matrika[i][k]=false;
                k++;
                rezult[2] ++;
            }
            else if(matrika[i-1][k]){
                // System.out.println("gor");
                // prejsneKoordinate[0] = i;
                // prejsneKoordinate[1] = k;
                matrika[i][k]=false;
                i--;
                rezult[1] ++;
            }
            
            else if(matrika[i][k-1]) {
                // System.out.println("levo");
                // prejsneKoordinate[0] = i;
                // prejsneKoordinate[1] = k;
                matrika[i][k]=false;
                k--;
                rezult[0] ++;
            }
            else{
                // System.out.println("konc!");
                break;
            }


        }
        return rezult;
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...

    public static void main(String[] args) {
        // koda za ro"cno testiranje (po potrebi)
    }
}
