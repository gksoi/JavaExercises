
/*
Samodejno testiranje:

tj.exe Prva.java . .

Javni testni primeri:

01: primer iz besedila
02--10: splošni primeri
*/

import java.math.BigInteger;
import java.math.BigInteger;
import java.util.*;

public class Prva {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();

        int zacasniP = p;
        int zacasniQ= q;
        
        int stevilo = sc.nextInt();
        boolean[] vrni = new boolean[stevilo];

        for(int i = 0 ; i < stevilo; i++){
            int st = sc.nextInt();
            for(int j = 1 ; j <= st ; j*=p){
                for(int k =1 ; k <= st; k *= q){
                    // System.out.println(k*j +" " + st);
                    if (k*j==st) {
                        vrni[i] = true;
                        // System.out.println("aaa" + st);
                        break;    
                    }
                }
            }

        }

        for(int i = 0 ; i< stevilo ; i++){
            System.out.println((vrni[i])? "DA":"NE");
        }
    }
}
    
    
    
    
    
    
    
    
    
    
    /* {
        
        Scanner scanner = new Scanner(System.in);
        int prvoStevilo = scanner.nextInt();
        int drugoStevilo = scanner.nextInt();
        int n = scanner.nextInt();
        ArrayList<Integer> zmnozki = new ArrayList<>(); 

        for(int i = 0; i<n; i++ ){
            zmnozki.add(scanner.nextInt());
        }

        for(Integer zmnozek : zmnozki){
           System.out.println(aliDrzi(prvoStevilo, drugoStevilo, zmnozek));

        }
        
    }

    public static String aliDrzi(int prvoStevilo, int drugoStevilo, int zmnozek){
        BigInteger prvoSteviloBig = BigInteger.valueOf(prvoStevilo);
        BigInteger drugoSteviloBig = BigInteger.valueOf(drugoStevilo);
        BigInteger zmnozekBigInteger = BigInteger.valueOf(zmnozek); 
        for(int i = 0; i < zmnozek; i++){
            BigInteger prvoSteviloPotenca=prvoSteviloBig.pow(i);
            if (prvoSteviloPotenca.equals(zmnozekBigInteger)) {
                return "DA";
            }
            if (prvoSteviloPotenca.intValue() > zmnozek) {
                return "NE";
            }


                        
            for(int z = 1; z< zmnozek; z++){
                BigInteger drugoSteviloPotenca=drugoSteviloBig.pow(z);
                if (drugoSteviloPotenca.intValue() > zmnozek) {
                    break;
                }
                if (prvoSteviloPotenca.multiply(drugoSteviloPotenca).intValue() > zmnozek) {
                    break;
                }

                if (prvoSteviloPotenca.equals(drugoSteviloPotenca)) {
                    return "DA";
                }
                if (prvoSteviloPotenca.multiply(drugoSteviloPotenca).equals(zmnozekBigInteger)) {
                    return "DA";
                }
                if (drugoSteviloPotenca.intValue() > zmnozek) {
                    return "NE";
                }
            }


        }
        return "NE";
        
    }
} */
