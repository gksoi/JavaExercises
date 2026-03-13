
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class Test01 {

    public static void main(String[] args) {
        Set<String>  array = new Set<>();
        array.add("asd");
        array.add("aasdd");
        array.add("null"); 

        
        PotencnaMnozica potencnaMnozica = new PotencnaMnozica(array);

        Iterator<String> iterator = potencnaMnozica.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }



    }
}
