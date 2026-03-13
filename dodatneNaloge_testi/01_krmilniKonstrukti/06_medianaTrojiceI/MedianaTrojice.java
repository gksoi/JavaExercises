import java.util.Scanner;

public class MedianaTrojice{ 
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int prva = scanner.nextInt();
        int druga = scanner.nextInt();
        int tretja = scanner.nextInt();
        if (prva==druga || tretja==prva ) {
            System.out.println(prva);
        }
        else if (tretja == druga) {
            System.out.println(tretja);
        }

        if (druga<prva&&prva<tretja || tretja<prva&&prva<druga) {
            System.out.println(prva);
        }

        if (prva<druga&&druga<tretja || tretja<druga&&druga<prva) {
            System.out.println(druga);
        }
        if (prva<tretja&&tretja<druga || druga<tretja&&tretja<prva) {
            System.out.println(tretja);
        }






        

            
        


    }
}