
/*
 * tj.exe Prva.java . .
 */

import java.util.*;

public class Prva {

    public static void main(String[] args) {
        // dopolnite ...
        Scanner scanner = new Scanner(System.in);
        int od = scanner.nextInt();
        int dos = scanner.nextInt()+1;
        int vrni = 0;
        for(int i = od ; i < dos ; i++){
            vrni += jeChenovo(i);
            System.out.println("-------"+vrni + "  " +i);
        }
        System.out.println(vrni);
    }
    public static int jeChenovo(int s){
        int stevilo = s+2;
        int stej = 2;
        boolean sodo = s%2==0;
        

        for(int i = 1 ; i < (stevilo/2)+1 ; i++){
            if (stevilo%i == 0) {
                stej++;
            }
            if (stej >4) {
                System.out.println(stevilo);
                return 0;
            }
        }
        return 1;

    }


}
