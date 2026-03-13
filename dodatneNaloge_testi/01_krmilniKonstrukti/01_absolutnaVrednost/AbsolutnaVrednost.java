import java.util.Scanner;

public class AbsolutnaVrednost{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int stevilo = scanner.nextInt();
        System.out.println((stevilo<0)? stevilo*-1: stevilo);
    }
}