import java.util.Scanner;

public class PiramidaStevil{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int stevilo = scanner.nextInt();
        int steviloStevil = -1;
        int steviloNapisano=1;
        int zzz=1;
        int buu=1;
        for(int i=stevilo; 0<i; i-- ){
            zzz=buu;
            for(int x = 1; x<=i-1;x++){
                System.out.print(" ");
            }
            steviloStevil = steviloStevil+2;
            for(int k = 0; k<steviloStevil; k++){
                if (zzz>9) {
                    zzz=0;
                }
                System.out.print(zzz);
                zzz++;
                if (zzz>9) {
                    zzz=0;
                }
            }
            System.out.println("");
            
            buu++;
            if (buu>9) {
                buu=0;
            }
        }



    }

}



