
/*
Samodejno testiranje:

tj.exe Prva.java . .

Javni testni primeri:

01: primer iz besedila
02--10: splošni primeri
*/

import java.util.*;

public class Prva {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int stevilo = scanner.nextInt();
        boolean[] daNe = new boolean[stevilo];
        for(int i = 0 ; i < stevilo ; i++){
            int lik = scanner.nextInt();
            daNe[i] = aliJeSkorajKvadrat(lik);

        }
    for(int j = 0 ; j < stevilo; j++){
        System.out.println((daNe[j])? "DA":"NE");
    }
    
}
    public static boolean aliJeSkorajKvadrat(int stevilo){
        int s =(int) Math.sqrt(stevilo);
        if (s * s == stevilo) {
            // System.out.println("Ring" + stevilo);
            return true;
        }

        for(int i = 1; i < stevilo ; i++){
            for(int j = i/2 ; j < stevilo/2 ; j++){
                int o = j * i;
                if(o == stevilo){
                    if (najdeno(j,i)){
                        return true;
                    }
                    break;
                }
            }
        }

        // System.out.println("aaaa");
        return false;

    }
    public static boolean najdeno(int j, int i  ){
        // System.out.println(i +"<-i " + j +"<-j " );
        if( i > j ){
            return j > i/2;
        }
        return i > j/2;
    }
    
    /* 
    
    
    
    
    
    
    {
        // dopolnite ...
        Scanner scanner = new Scanner(System.in);
        int kolikoKvadratov = scanner.nextInt();
        String[] daAliNe = new String[kolikoKvadratov];
        for(int i = 0; i< kolikoKvadratov; i++){
            daAliNe[i] = aliJeSkorajKvadrat(scanner.nextInt());
        }
        for(int o = 0; o < kolikoKvadratov; o++){
            System.out.println(daAliNe[o]);
        }
    }   


    public static String aliJeSkorajKvadrat(int stranica){
        if (stranica==1) {
            return "DA";
        }
        for(int i = 2; i<stranica; i++){
            if (stranica%i==0) {
                for(int x = i; x * i <= stranica; x++){
                    if (x*i == stranica) {
                        if ((i > x/2)) {
                            return "DA";
                        };
                    }
                }
            }
        }
        return "NE";

    }

 */
    // pomo"zne metode, notranji razredi (po potrebi) ...
}
