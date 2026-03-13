import java.util.Scanner;

public class PostevankaII{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int prva = scanner.nextInt();
        int druga = scanner.nextInt();

        for(int i = 1; i<=druga; i++){
            System.out.println(String.format("%d * %d = %d", prva, i, prva*i ));
        }
    }        
    }



