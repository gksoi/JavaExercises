import java.util.Scanner;

public class Bloki{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int prva = scanner.nextInt();
        int druga = scanner.nextInt();
        int tretja = scanner.nextInt();
        int sum = prva + druga + tretja + 2;
        int visinaBloka = dajNajvecjega(prva,druga,tretja);
        int prvaaa = prva;
        int drugaa = druga;
        int tretjaa = tretja;

        for(int i=0; i<visinaBloka; i++){
            
            for(int x= 0; x<prvaaa; x++){
                if (prva==0) {
                    System.out.print(" ");
                }
                else{
                System.out.print(prvaaa);
            }}
            if (prva!=0) {
                prva--;
            }
            System.out.print(" ");
            for(int s= 0; s<drugaa; s++){
                if (druga==0) {
                    System.out.print(" ");
                }
                else{
                System.out.print(drugaa);
            }}
            if (druga!=0) {
                
                druga--;
            }
            System.out.print(" ");
            for(int p= 0; p<tretjaa; p++){
                if (tretja==0) {
                }
                else{
                System.out.print(tretjaa);
            }
        }

            if (tretja!=0) {
                
                tretja--;            
            }
        System.out.println("");

    }}


      public static Integer dajNajvecjega(int prva, int druga, int tretja){
        if (prva>=druga&&prva>=tretja) {
            return prva;
        }
        if (druga>=prva && druga>=tretja) {
            return druga;
        }
        else return tretja;
    }
}
