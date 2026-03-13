
/*
Samodejno testiranje:
tj.exe

Javni testni primeri:
01-05: najMnozica
06-10: pogostost
01, 06: ro"cno izdelana
*/

import java.util.*;
import java.util.stream.Collector;

public class Cetrta {

    public static Set<String> najMnozica(Map<String, Set<String>> sopomenke){
        String key = "";
        int rekord = 0;
        for(String s : sopomenke.keySet()){
            if (sopomenke.get(s).size() > rekord) {
                rekord = sopomenke.get(s).size();
                key = s;
            }
        }
        return sopomenke.get(key);
        
    }
    
    
    public static Map<Set<String>, Integer> pogostost(String besedilo, Map<String, Set<String>> sopomenke){
        HashMap<Set<String> , Integer > vrni = new HashMap<>();
        String[] besedStrings = besedilo.split(" ");
        for(Set<String> s : sopomenke.values()){
            vrni.put(s, 0);
        }

        for(int i = 0 ; i < besedStrings.length ; i++){
            for(Set<String> s : vrni.keySet()){
                if (s.contains(besedStrings[i])) {
                    vrni.put(s, vrni.get(s)+1);
                }
            }
        }
        ArrayList<Set<String>> zbrisi = new ArrayList<>();
    for(Set<String> s : vrni.keySet()){
        if (vrni.get(s).equals(0)) {
            zbrisi.add(s);
        }
    }        
        for(Set<String> s : zbrisi){
            vrni.remove(s);
        }
        return vrni;




                    
                    
                    }   
                    





                    
                    /* {
                        Set<Set<String>> set = new HashSet<>();
                        sopomenke.values().stream().forEach(p-> set.add(p));
                        HashMap<Set<String>, Integer> hasmap= new HashMap<>();
                        String[] s = besedilo.split(" ");
                        set.stream().forEach(p-> hasmap.put(p, 0));
                        
                        for(int i = 0 ; i < s.length; i++){
                            for(Set<String> set2 : set){
                                if (set2.contains(s[i])) {
                                    hasmap.put(set2, hasmap.get(set2)+1);
                                    }
                                    }
                                    
                                    }
                                    Set<Set<String>> brisi = new HashSet<>();
                                    for(Set<String> se: hasmap.keySet()){
                                        if (hasmap.get(se)==0) {
                                            brisi.add(se);
                                            }
                                            }
                                            for(Set<String> b : brisi){
                                                hasmap.remove(b);
                                                }
                                                return hasmap;
                                                // popravite / dopolnite ...
                                                
                                                }
                                                */
                                                // pomo"zne metode, notranji razredi (po potrebi) ...
                                                
                                                public static void main(String[] args) {
                                                    // koda za ro"cno testiranje (po potrebi) ...
                                                    }
                                                    }
                                                    
                                                    
                                                    
                                                    /* 
                                                    ArrayList<Set<String>> arej =new ArrayList<>();
                                                        sopomenke.values().forEach(p->arej.add(p));
                                                        Set<String> prva = arej.getFirst();
                                                        for(Set<String> s : arej){
                                                            if (s.size() > prva.size()) {
                                                                prva = s;
                                                            }
                                                        }
                                                    
                                                        return prva;
                                                    }

                                                     */