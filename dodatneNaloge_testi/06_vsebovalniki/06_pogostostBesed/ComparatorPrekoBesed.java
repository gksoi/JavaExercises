import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorPrekoBesed implements Comparator<String>{


    @Override
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
                    return besedaBrezStevilke1.compareTo(besedaBrezStevilke2);

                /*     ArrayList<String> besedi = new ArrayList<>();
                    besedi.add(besedaBrezStevilke1);
                    besedi.add(besedaBrezStevilke2);
                    Collections.sort(besedi);
                    if (besedi.get(0)==besedaBrezStevilke1) {
                        return -1;
                    }
                    return 1;*/

                }
                return 0;
                
            }
}