import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;
import java.util.*;


public class PresekMnozic{
    public static <T> Set<T> presek(Collection<Set<T>> mnozice){
        List<Set<T>> arrej = new ArrayList<>(mnozice);
        Set<T> list = new HashSet<T>();
        Set<T> pregledan = arrej.getFirst();
        arrej.remove(0);

        for(T t : pregledan){
            boolean x = true;
            for ( Set<T> set : arrej){
                if(!set.contains(t)){
                    x=false;
                }
            }
            if(x){
                list.add(t);
            }
        }

        
        
        return list;
    }












/* 
    public static <T> Set<T> presek(Collection<Set<T>> mnozice){
        Set<T> presek = new HashSet<>();
        for(Set<T> set : mnozice){
            for(T item : set){
                for(Set<T> preverjaj : mnozice){

                    if (preverjaj.contains(item) && !preverjaj.equals(set)) {
                        presek.add(item);

                    }
                    
                }
            }
            }

        Set<T> odstraniPresek = new HashSet<>();
            

        for(T stevilo : presek){
            int steviloMnozic = mnozice.size();
            
            for(Set<T> noviSet : mnozice){
                if (noviSet.contains(stevilo)) {
                    steviloMnozic--;
                }
            }
            if (steviloMnozic!=0) {
                odstraniPresek.add(stevilo);
            }
        }
        presek.removeAll(odstraniPresek);

            return presek;

    }
 */}