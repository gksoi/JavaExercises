import java.util.ArrayList;
import java.util.Scanner;

public class Golaz{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int denar = scanner.nextInt();
        ArrayList<ArrayList<Integer>> računInDenar = new ArrayList<>();
        boolean isTrue = true;
        while (denar>0 && scanner.hasNextInt()) {

            int pravaCenaKosila = scanner.nextInt();
            int steviloKosil = scanner.nextInt();
            int vinoDaNe = scanner.nextInt();
            int strosek = strosek(pravaCenaKosila, steviloKosil, vinoDaNe);
            denar -= strosek;
            if (denar>=0) {
                System.out.println(strosek + " " + denar);
            }
            else{
                System.out.println(strosek + " -");
            }
            
        }
        }

    
        

    

    public static Integer strosek(int cenaKosila, int steviloKosil, int vinoDaNe){
        int strosek = 0;
        int racunZaVino = 0;
        if (vinoDaNe==1) {

            racunZaVino = ((cenaKosila*steviloKosil)%2==0)? (cenaKosila*steviloKosil)/2: ((cenaKosila*steviloKosil)/2)+1;
        }
        strosek = (cenaKosila*steviloKosil) + racunZaVino;
        return strosek;
    }

}