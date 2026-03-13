import java.util.Scanner;

public class CasovnaRazlikaI{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int prvaUra = scanner.nextInt();
        int prvaMinuta = scanner.nextInt();
        int drugaUra = scanner.nextInt();
        int drugaMinuta = scanner.nextInt();

        int prviCas = prvaUra*60 + prvaMinuta;
        int drugiCas = drugaUra*60 + drugaMinuta;
        System.out.println((0>prviCas-drugiCas)? (prviCas-drugiCas)*-1 : prviCas-drugiCas);


    }
}