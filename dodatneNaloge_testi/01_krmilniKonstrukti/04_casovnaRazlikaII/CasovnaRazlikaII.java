import java.util.Scanner;

public class CasovnaRazlikaII{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int prvaUra = scanner.nextInt();
        int prvaMinuta = scanner.nextInt();
        int drugaUra = scanner.nextInt();
        int drugaMinuta = scanner.nextInt();
        int razlikaMinut;
        if (prvaUra<drugaUra && drugaMinuta<prvaMinuta) {
             razlikaMinut = drugaMinuta+60 - prvaMinuta;
            drugaUra--;
        } 
        else if (drugaUra<prvaUra && prvaMinuta<drugaMinuta) {
             razlikaMinut = prvaMinuta+60 - drugaMinuta;
            prvaUra--;
        }
        else{
         razlikaMinut = (0> prvaUra-drugaMinuta) ? drugaMinuta-prvaMinuta : prvaMinuta - drugaMinuta;
        }
        
        int razlikaUr = (0>prvaUra-drugaUra) ? drugaUra-prvaUra : prvaUra- drugaUra;
        String minute = (razlikaMinut<10)? "0"+String.valueOf(razlikaMinut): String.valueOf(razlikaMinut);

        System.out.println(String.format("%d:%s", razlikaUr, minute));


    }
}