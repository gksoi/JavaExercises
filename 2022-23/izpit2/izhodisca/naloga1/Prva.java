
/*
Samodejno testiranje:
tj.exe Prva.java . .

Javni testni primeri:
01: primer iz besedila
02-04: vsa "stevila so enomestna
01, 05-10: splo"sni primeri
*/

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        // dopolnite ...
        Scanner scanner = new Scanner(System.in);
        int st = scanner.nextInt();
        int vrni = st;
        for(int i = 0 ; i < st; i++){
            Integer stevilo1 = scanner.nextInt();
            Integer stevilo2 = scanner.nextInt();
            char[] st1 = Integer.toString(stevilo1).toCharArray();
            char[] st2 = Integer.toString(stevilo2).toCharArray();
            for(int j = 0 ; j < st1.length ; j++){
                if (st1[j] >= st2[j]) {
                    vrni--;
                    // System.out.println(stevilo1 +"-- stevka: " +st1[j] + " je vecja od stevke: "+st2[j] +" v "+stevilo2  );
                    break;
                }
            }

        }
        System.out.println(vrni);
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
