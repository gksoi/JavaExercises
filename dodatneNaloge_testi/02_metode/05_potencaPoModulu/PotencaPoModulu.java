import java.util.ArrayList;
import java.util.Scanner;

public class PotencaPoModulu{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();

        ArrayList<Integer> zaporedje = new ArrayList<>();

        while (scanner.hasNextInt()) {
            zaporedje.add(scanner.nextInt());
        }
        scanner.close();
        int cena = 0;
        int indexZaK = 0;
        int najcenejsi = zaporedje.get(0);
        int noviK = k;
        int faktorZaK = 1;

        for(int o = 0; o<zaporedje.size(); o++){
            cena += zaporedje.get(o);
        }
        System.out.println(cena);

        for(int i = 0; i<zaporedje.size(); i++){
            if (i%k==0) {
                cena -= najcenejsi;
                najcenejsi= zaporedje.get(i);
                noviK=k*faktorZaK;
                faktorZaK++;
            }

            if (zaporedje.get(i)<najcenejsi) {
                najcenejsi=i;
            }

        }
        System.out.println(cena);


        
                                            }
                                                                                    }





    


