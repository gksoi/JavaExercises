import java.util.Scanner;

public class NajblizjiVeckratnik{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int prva = scanner.nextInt();
        int druga = scanner.nextInt();
        int deljenje = druga/prva;
        int razlikaZmanjšimFaktorjem = druga- (prva*deljenje);
        int razlikaZvečjimFaktorjem = -1*(druga - prva*(deljenje+1));


        if (razlikaZmanjšimFaktorjem==razlikaZvečjimFaktorjem) {
            System.out.println(deljenje*prva);
            
        }
        else{
            System.out.println((razlikaZmanjšimFaktorjem<razlikaZvečjimFaktorjem)? prva*deljenje : prva*(deljenje+1));
        }


            
        }

    }
