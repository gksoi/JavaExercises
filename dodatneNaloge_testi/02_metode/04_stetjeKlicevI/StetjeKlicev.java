import java.util.Scanner;

public class StetjeKlicev{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.close();
        int stetje = 0;
        int steviloNaKoncu=1;
        if (n!=0) {
            
             steviloNaKoncu += funkcija(a, b, n, stetje);
        }

        System.out.println(steviloNaKoncu);
        

    }


    public static int funkcija(int a, int b, int n, int stetje){
        int stevilo = stetje;
        if (n==0) {
            return 1;
        }
        if (n/b==0) {
            stevilo++;
        }
        else{
            stevilo++;
            stevilo +=funkcija(a,b, n/b, stetje);

        }

        if (n/a==0) {
            stevilo++;
        }
        else{
            stevilo++;
            stevilo +=funkcija(a,b, n/a, stetje);
        }
        return stevilo;


    }
}