
/*
Samodejno testiranje:

tj.exe Prva.java . .

Javni testni primeri:

01: primer iz besedila
*/

import java.util.*;

public class Prva {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int prvo = scanner.nextInt();
        int vrni = 0;
        boolean je = true;
        boolean novoZ = false;
        while (scanner.hasNext()) {
            int drugo = scanner.nextInt();
            
            if (drugo==0) {
                vrni = (je) ? vrni+1 : vrni;
                // System.out.println((je)?prvo:"");
                je = true;
                novoZ = true;
                continue;
            }
            else if (drugo >= prvo && !novoZ) {
                je = false;

            }
            novoZ = false;
            prvo = drugo;
        }
        System.out.println(vrni);
    }
    
    
/*     {
        Scanner scanner = new Scanner(System.in);
        int prvi = scanner.nextInt();
        int steviloZaporedij =0;
        boolean sevednoPada = true;
        boolean niScam = false;
        int kolikoStevilOdnicle = 0;
        int dolzinaTegaZaporedja= 0;

        while (scanner.hasNextInt()) {
            kolikoStevilOdnicle++;
            int naslednji = scanner.nextInt();
            if (naslednji < prvi && sevednoPada) {
                dolzinaTegaZaporedja++;
                niScam = true;
            }

            if (naslednji <= prvi) {
                sevednoPada = false;
            }

            if (naslednji==0) {
                 kolikoStevilOdnicle = 0;
                 dolzinaTegaZaporedja= 0;
                 sevednoPada =true;

                if (kolikoStevilOdnicle == dolzinaTegaZaporedja ) {
                    steviloZaporedij++;

                }
                
            }
            else{
            prvi = naslednji;
            }
        }
        System.out.println(steviloZaporedij);

        // dopolnite ...
    }
 */
    // pomo"zne metode, notranji razredi (po potrebi) ...
}
