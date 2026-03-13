
/*
Samodejno testiranje:
tj.exe Prva.java . .

Testni primeri:

01: primer iz besedila
02..04: na vhodu je 42 "stevil
01, 05..10: splo"sni primeri
*/

import java.util.*;

public class Prva {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int drugaStt = scanner.nextInt();
        int st = scanner.nextInt();
        int vsota = drugaStt + st;
        while(scanner.hasNext()){
        int drugaSt = scanner.nextInt();
            if (drugaSt+st > vsota) {
                vsota = drugaSt + st;
            }
            st = drugaSt;

        }
        System.out.println(vsota);
    }
    
}
    
    
    
    
     /* {
        Scanner scanner = new Scanner(System.in);
        int prviClen = scanner.nextInt();
        int drugiClen = scanner.nextInt();
        int najvecjaVsota = prviClen + drugiClen;
        while (scanner.hasNextInt()) {
            int naslednjiClen = scanner.nextInt();
            if (drugiClen+naslednjiClen > najvecjaVsota) {
                najvecjaVsota = drugiClen + naslednjiClen;
            }
            drugiClen = naslednjiClen;
            
        }
        System.out.println(najvecjaVsota);
    }
}
 */