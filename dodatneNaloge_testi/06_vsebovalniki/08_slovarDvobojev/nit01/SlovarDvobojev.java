import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.ArrayList;




public class SlovarDvobojev {
    public static void main(String[] args){
        int p2 = 0;
    int result = (p2 == 2) ? 0 : (p2 == 0) ? 2 : 1;
        System.out.println(result);
    }

    public static NavigableMap<String, NavigableMap<String, Integer>> partije2slovar(List<Partija> partije){

        NavigableMap<String, NavigableMap<String, Integer>> koncna = new TreeMap<>();
        ArrayList<String> partijeBeleString = partije.stream().map(pa -> pa.vrniBelega()).collect(Collectors.toCollection(ArrayList::new));
        ArrayList<String> partijeCrneString = partije.stream().map(pa -> pa.vrniCrnega()).collect(Collectors.toCollection(ArrayList::new));
        ArrayList<Partija> partijeList = new ArrayList<>();

        for(Partija p : partije){
            TreeMap<String , Integer> notranja = new TreeMap<>();
            if (!partijeBeleString.contains(p.vrniCrnega())) {
            int result = (p.vrniIzid() == 2) ? 0 : (p.vrniIzid() == 0) ? 2 : 1;

             partijeList.add(new Partija(p.vrniCrnega(), p.vrniBelega(), result));
                
            }
            for(Partija p2 : partije){
                if (p2.vrniBelega() != p.vrniBelega() && p2.vrniCrnega()!= p.vrniBelega()) {
                    notranja.put(p2.vrniBelega(), (notranja.get(p2.vrniBelega()) != null) ? notranja.get(p2.vrniBelega()) : 0);                    
                    notranja.put(p2.vrniCrnega(), (notranja.get(p2.vrniCrnega()) != null) ? notranja.get(p2.vrniCrnega()) : 0);                    
                }

                else if (p2.vrniBelega().equals(p.vrniBelega())) {
                    if (notranja.containsKey(p2.vrniCrnega())) {
                        notranja.put(p2.vrniCrnega(), notranja.get(p2.vrniCrnega()) + p2.vrniIzid());                        
                    }
                    else{
                    notranja.put(p2.vrniCrnega(), p2.vrniIzid());
                }
            }

                else if( p2.vrniCrnega().equals(p.vrniBelega())){
                    int result = (p2.vrniIzid() == 2) ? 0 : (p2.vrniIzid() == 0) ? 2 : 1;
                    if(notranja.containsKey(p2.vrniBelega())){
                        notranja.put( p2.vrniBelega(), notranja.get(p2.vrniBelega()) + result);
                    }
                    else{
                    notranja.put(p2.vrniBelega(), result );
                }
            }
                

            }
            koncna.put(p.vrniBelega(), notranja );
        }

        for(Partija p: partijeList){
            TreeMap<String , Integer> notranja = new TreeMap<>();
            if (!partijeBeleString.contains(p.vrniCrnega())) {
            int result = (p.vrniIzid() == 2) ? 0 : (p.vrniIzid() == 0) ? 2 : 1;

             partijeList.add(new Partija(p.vrniCrnega(), p.vrniBelega(), result));
                
            }
            for(Partija p2 : partije){
                if (p2.vrniBelega() != p.vrniBelega() && p2.vrniCrnega()!= p.vrniBelega()) {
                    notranja.put(p2.vrniBelega(), (notranja.get(p2.vrniBelega()) != null) ? notranja.get(p2.vrniBelega()) : 0);                    
                    notranja.put(p2.vrniCrnega(), (notranja.get(p2.vrniCrnega()) != null) ? notranja.get(p2.vrniCrnega()) : 0);                    
                }

                else if (p2.vrniBelega().equals(p.vrniBelega())) {
                    if (notranja.containsKey(p2.vrniCrnega())) {
                        notranja.put(p2.vrniCrnega(), notranja.get(p2.vrniCrnega()) + p2.vrniIzid());                        
                    }
                    else{
                    notranja.put(p2.vrniCrnega(), p2.vrniIzid());
                }
            }

                else if( p2.vrniCrnega().equals(p.vrniBelega())){
                    int result = (p2.vrniIzid() == 2) ? 0 : (p2.vrniIzid() == 0) ? 2 : 1;
                    if(notranja.containsKey(p2.vrniBelega())){
                        notranja.put( p2.vrniBelega(), notranja.get(p2.vrniBelega()) + result);
                    }
                    else{
                    notranja.put(p2.vrniBelega(), result );
                }
            }
                

            }
            koncna.put(p.vrniBelega(), notranja );
        }

        
    
        return koncna;
    }
        

}