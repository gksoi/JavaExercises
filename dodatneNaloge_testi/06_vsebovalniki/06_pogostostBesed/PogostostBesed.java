import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.*;

public class PogostostBesed{
    public static class Urejevalniki{
        public static <T extends Comparable> Comparator<T> uredi(){
            return new SlovarUrejevalnik<T>();
        }

        private static class SlovarUrejevalnik<T extends Comparable> implements Comparator<T>{
            @Override
            public int compare(T aa ,  T bb ){
                String a =(String) aa;
                String b =(String) bb;


                int sa =Integer.parseInt(b.split(" \\(")[1])- Integer.parseInt(a.split(" \\(")[1])  ;
                
                return (sa!=0) ? sa: a.compareTo(b);
            }

        }
    }


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stringlist = new ArrayList<>();

        HashMap<String, Integer> slvoar = new HashMap<>();
        while (scanner.hasNext()) {
            String x = scanner.next();
            if (stringlist.contains(x)) {
                slvoar.put(x,slvoar.get(x)+1);
            }
            else{
                stringlist.add(x);
                slvoar.put(x, 1);
            }
        }
        ArrayList<String> urejenList = new ArrayList<>(slvoar.entrySet().stream().map(e -> e.getKey() + " (" + e.getValue()).toList());
        urejenList.sort(Urejevalniki.uredi());
        for(String s : urejenList){
            System.out.println(s+")");
        }
        
    }

/*     public static void main(String[ ] args){

        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> slovar = new HashMap<>();

        String zaporedje = scanner.nextLine();

        String[] besede = zaporedje.split(" ");
        ArrayList<String> beseArrayList = new ArrayList<>();
        Set<String> besedeSet = new HashSet<>();
       
        Comparator<String> comparator = new Comparator<String>() {
            public int compare(String prva, String druga){
                String [] slajsano = prva.split(" ");
                int stevilka =(int) Integer.valueOf(slajsano[1].replace("(", "").replace(")", ""));
                String [] slajsano2 = druga.split(" ");
                int stevilka2 =(int) Integer.valueOf(slajsano2[1].replace("(", "").replace(")", ""));

                String besedaBrezStevilke1 = slajsano[0];
                String besedaBrezStevilke2 = slajsano2[0];
                
                if (stevilka < stevilka2) { 
                    return 1;
                }
                else if(stevilka > stevilka2){return -1;};
                if (stevilka==stevilka2) {
                    ArrayList<String> besedi = new ArrayList<>();
                    besedi.add(besedaBrezStevilke1);
                    besedi.add(besedaBrezStevilke2);
                    Collections.sort(besedi);
                    if (besedi.get(0)==besedaBrezStevilke1) {
                        return -1;
                    }
                    return 1;

                }
                return 0;
                
            }            
        };

        Comparator<String> comparator2 = new ComparatorPrekoBesed();

        

        
        for(int i=0 ; i<besede.length; i++){
            beseArrayList.add(besede[i]);
        }
        
        besedeSet.addAll(beseArrayList);
        for(String beseda : besedeSet){
            slovar.put(beseda, 0);
        }

        ArrayList<String> besedeZstevilomString = new ArrayList<>();


        for(String beseda : besedeSet){
            for(String drugaBeseda : beseArrayList){
                if (beseda.equals(drugaBeseda)) {
                    int steviloBesede =slovar.get(beseda)+1;
                    slovar.remove(beseda);
                    slovar.put(beseda,steviloBesede );
                  
                }
            }
        }
        

        for(String beseda : slovar.keySet()){
            besedeZstevilomString.add(beseda+" "+"("+slovar.get(beseda)+")");
        }
        Collections.sort(besedeZstevilomString, comparator2);
         besedeZstevilomString.forEach(System.out::println);

        



    }
 */

}