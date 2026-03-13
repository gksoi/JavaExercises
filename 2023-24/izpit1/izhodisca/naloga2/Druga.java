
/*
Samodejno testiranje:

tj.exe Druga.java . .

Javni testni primeri:

01, 02: primera iz besedila
01, 03--06: u = 1
02, 07--10: u = 2
*/

import java.util.*;

public class Druga {

    public static void main(String[] args) {
        // dopolnite ...
        Scanner scanner = new Scanner(System.in);
        int ukaz = scanner.nextInt();
        int stDraziteljev = scanner.nextInt();
        int stIzdelkov = scanner.nextInt();
        int stPonudb = scanner.nextInt();

        int[] izdelki = new int[stIzdelkov];
        int[] izdelkiIndexDrazitelja = new int[stIzdelkov];
        for(int j = 0 ; j < stIzdelkov ; j++){
            izdelkiIndexDrazitelja[j] = -1;
        }
        int[] drazitelji = new int[stDraziteljev];

        for(int i = 0 ; i < stPonudb; i ++){
            int drazitelj = scanner.nextInt();
            int izdelek = scanner.nextInt();
            int znesek = scanner.nextInt();

            if (izdelki[ izdelek ] < znesek ) {
                // System.out.println("ring");
                if(izdelkiIndexDrazitelja[izdelek] != -1 && izdelkiIndexDrazitelja[izdelek]!=drazitelj){
                    drazitelji[drazitelj]--;
                }
                izdelkiIndexDrazitelja[izdelek] = drazitelj;
                izdelki[izdelek] = znesek;
                drazitelji[drazitelj]++;
            }
        }

        System.out.println((ukaz==1)?Arrays.toString(izdelki):Arrays.toString(drazitelji));



    }

    // pomo"zne metode, notranji razredi (po potrebi) ...


    
}
