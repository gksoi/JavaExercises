
/*
Samodejno testiranje:

tj.exe Druga.java . .

Javni testni primeri:

01: primer iz besedila
02--06: vse besede v okviru istega dokumenta so med seboj razli"cne
01, 07--10: splo"sni primeri
*/

import java.util.*;

public class Druga {

    public static void main(String[] args) {
        // dopolnite ...
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int b = scanner.nextInt();
        int[] besedeInUporaba = new int[b];
        for(int i = 0; i < n ; i++){
            int st = scanner.nextInt();
            ArrayList<Integer> arej =new ArrayList<>();
            for(int j = 0; j < st ; j ++){
                int o = scanner.nextInt();
                if(!arej.contains(o)){
                    arej.add(o);
                    besedeInUporaba[o]++;
            }}
        } 
        int rekord = 0;
        int indeksRekord = 0;
        for(int i = 0 ; i < b; i++){
            if (besedeInUporaba[i] > rekord) {
                rekord = besedeInUporaba[i];
                indeksRekord = i;
            }
        }
        System.out.println(indeksRekord);
    }

    // pomo"zne metode, notranji razredi (po potrebi) ...
}
