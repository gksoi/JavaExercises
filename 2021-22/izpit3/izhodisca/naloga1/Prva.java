
import java.util.*;

public class Prva {

    public static void main(String[] args) {
        // dopolnite ...
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int vrni = 0;
        // String s = scanner.nextInt() +" "+ scanner.nextInt();

        int[] tabela = new int[2];
        tabela[0] = scanner.nextInt();
        tabela[1] = scanner.nextInt();
        // System.out.println(s + " ......");
        for(int i = 0 ; i < t; i++){
            int prva = scanner.nextInt();
            int druga = scanner.nextInt();
            if(prva==tabela[0]&&druga == tabela[1]){
                vrni++;
                i++;              
                if( i!=t-1 ) {
                tabela[0] = scanner.nextInt();
                tabela[1] = scanner.nextInt();  
            }
        }

        }
        System.out.println(vrni);
    }
}
