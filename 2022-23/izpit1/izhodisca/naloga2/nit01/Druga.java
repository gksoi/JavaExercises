
/*
Samodejno testiranje:
tj.exe

Testni primeri:

01: primer iz besedila
02..04: vsaka beseda je sestavljena iz ene same "crke
01, 05..10: splo"sni primeri

01, 02, 05, 06: ro"cno izdelani
*/

import java.util.*;

public class Druga {

    public static boolean krizankaOK(char[][] besede, char[][] polozaji) {
        // popravite / dopolnite ...
        int najdalsa = besede[0].length;
        for(int i = 0; i < besede.length ; i++){
            if(besede[i].length > najdalsa){
                najdalsa =besede[i].length;
            }
        }

        char[][] krizanka = new char[polozaji.length * najdalsa*10][polozaji.length * najdalsa*10];
        // System.out.println(Arrays.toString(krizanka[0]));
        
        for(int i = 0; i < polozaji.length; i ++){

            int vrstica = polozaji[i][0]-48;
            // System.out.println(vrstica +"aa");

            int stolpec = polozaji[i][1]-48 ;

            char znak = polozaji[i][2];

            char[] beseda = besede[i];
            for(int j = 0 ; j < beseda.length; j++){
                if(znak=='v'){
                    if(krizanka[vrstica][stolpec+j]==0){
                    krizanka[vrstica][stolpec+j] = beseda[j];
                }
                else if( krizanka[vrstica][stolpec+j] != beseda[j]){

                    return false;
                }
                
            }
                else{
                    if(krizanka[vrstica+j][stolpec] == 0){
                        krizanka[vrstica+j][stolpec] = beseda[j];
                    }
                    else if(krizanka[vrstica+j][stolpec]!=beseda[j]){

                        return false;
                    }
                }
            }

        }
        



        return true;
    }
}
