import java.util.Scanner;

public class Postevanka{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int prva = scanner.nextInt();
        int druga = scanner.nextInt();

        for(int i = 1; i<=druga; i++){
            System.out.println(prva*i);
        }
    }
}