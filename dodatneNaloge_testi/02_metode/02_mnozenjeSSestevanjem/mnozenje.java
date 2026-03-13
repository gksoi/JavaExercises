import java.util.Scanner;

public class mnozenje{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int prva = scanner.nextInt();
        int druga = scanner.nextInt();
        System.out.println(zmnozek(prva, druga));
    }

    public static int zmnozek(int prva, int druga){
        return prva*druga;
    }
}