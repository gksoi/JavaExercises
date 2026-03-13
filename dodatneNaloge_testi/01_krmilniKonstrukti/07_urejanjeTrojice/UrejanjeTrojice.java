import java.util.Scanner;

public class UrejanjeTrojice{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int prva = scanner.nextInt();
        int druga = scanner.nextInt();
        int tretja = scanner.nextInt();

        
        
        if (druga<=prva&&prva<=tretja || tretja<=prva&&prva<=druga) {
            if (prva==druga){
                System.out.println((tretja<prva)? String.format("%d %d %d", tretja, druga, prva): String.format("%d %d %d", prva, druga, tretja));

            }
            if (prva==tretja) {
                System.out.println((prva<druga)? String.format("%d %d %d", tretja, tretja, druga): String.format("%d %d %d", druga, tretja, tretja));
                
            }
            else if (tretja == druga) {
                System.out.println((druga<prva)? String.format("%d %d %d", druga, tretja, prva): String.format("%d %d %d", prva, tretja, druga));
            }
            else{
            System.out.println((druga<prva&&prva<tretja)? String.format("%d %d %d", druga, prva, tretja): String.format("%d %d %d", tretja, prva, druga));
        
        }
    }

        if (prva<druga&&druga<tretja || tretja<druga&&druga<prva) {
            System.out.println((prva<druga&&druga<tretja) ? String.format("%d %d %d", prva, druga, tretja): String.format("%d %d %d", tretja, druga, prva));
        }
        if (prva<tretja&&tretja<druga || druga<tretja&&tretja<prva) {
            System.out.println((prva<tretja&&tretja<druga) ? String.format("%d %d %d", prva, tretja, druga): String.format("%d %d %d", druga, tretja, prva));
        }


        




    }



}