import java.util.ArrayList;
import java.util.*;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class ManjkajoceBesede{
        public static class Urejevalniki{
            public static <T extends Comparable<T>> Comparator <T > naravni(){
                return new NaravniComparator<T>();
            }

            private static class NaravniComparator<T extends Comparable<T>> implements Comparator<T>{
                @Override
                public  int compare(T a , T b){
                    return a.compareTo(b);
                }
                
            }
        }

        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> prva = new ArrayList<>();
            ArrayList<String> druga = new ArrayList<>();
            Set<String> tretja = new TreeSet(Urejevalniki.naravni());

            int stPrve = scanner.nextInt();
            for(int i = 0 ; i < stPrve; i++){
                prva.add(scanner.next());
            }
            int stdruge = scanner.nextInt();


            for(int i = 0 ; i< stdruge; i++){
                druga.add(scanner.next());
            }


            for(String s : prva){
                if(!druga.contains(s)){
                    tretja.add(s);
                }

            }


            


            for(String s : tretja){
                System.out.println(s);
            }








        }











 /* 
    public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> druga = new ArrayList<>();
    ArrayList<String> prva = new ArrayList<>();


    int dolzinaPrveMnozice = scanner.nextInt();
    for(int i = 0; i< dolzinaPrveMnozice; i++){
    prva.add(scanner.next());    
}    
    int dolzinaDrugeMnozice = scanner.nextInt();

    for(int x = 0; x< dolzinaDrugeMnozice; x++){
        druga.add(scanner.next());    
    }
    scanner.close();
   // System.out.println(prva);
//    System.out.println(druga);

    ArrayList<String> odstrani = new ArrayList<>();

    for(String beseda : prva){
        
        if (druga.contains(beseda)) {
            odstrani.add(beseda);
        }

    }
    prva.removeAll(odstrani);

    Set<String> set = new HashSet<>();
    set.addAll(prva);


    ArrayList<String> zadniArraj = new ArrayList<>();
    zadniArraj.addAll(set);
    Collections.sort(zadniArraj);



    zadniArraj.forEach(System.out::println);
  // System.out.println(prva);
   // prva.stream().filter( beseda -> !druga.contains(beseda) ).collect(Collectors.toList()); 
     //prva.forEach(String ime -> System.out.println(ime) );

}


 */

}