import java.util.Scanner;

public class Trihonometrija{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int prva = scanner.nextInt();
        int druga = scanner.nextInt();
        if (prva==druga) {
            System.out.println(0);
        }
        else{
            System.out.println((prva>druga)?1 : -1);
        }
    }
}










