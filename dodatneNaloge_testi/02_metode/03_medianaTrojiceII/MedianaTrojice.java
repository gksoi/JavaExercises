import java.util.Scanner;

public class MedianaTrojice{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int prva = scanner.nextInt();
        int druga = scanner.nextInt();
        int tretja = scanner.nextInt();

        if (min(prva, druga)==prva && max(druga, tretja)==tretja) {
            System.out.println(druga);
        }
        else if (max(prva, druga)==prva && min(druga, tretja)==tretja) {
            System.out.println(druga);
        }

        else if (min(prva, druga)==druga && max(tretja, tretja)==tretja) {
            System.out.println(prva);
        }
        else if (max(prva, druga)==druga && min(tretja, tretja)==tretja) {
            System.out.println(prva);
        }


        else if (min(prva, tretja)==prva && max(druga, tretja)==druga) {
            System.out.println(tretja);
        }
        else if (max(prva, tretja)==prva && min(druga, tretja)==druga) {
            System.out.println(tretja);
        }

    }

    public static int min(int prva, int druga){
        if (prva>druga) {
            return druga;
        }
        return prva;
    }

    public static int max(int prva, int druga){
        if (prva>druga) {
            return prva;
        }
        return druga;
    }


}