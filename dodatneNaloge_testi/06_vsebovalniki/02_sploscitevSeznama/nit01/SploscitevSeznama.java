import java.util.ArrayList;
import java.util.List;

public class SploscitevSeznama{


    public static <T> List<T> splosci(List<List<T>> seznami){
        List<T> sezznam = new ArrayList<>();
        for(List<T> list : seznami){
            for(T t : list){
                sezznam.add(t);
            }
        }
        return sezznam;
    }
}























































/* 
 * 
        ArrayList<T> sploscenSeznam = new ArrayList<>();

        for(List<T> seznam : seznami){
            for(int i = 0; i < seznam.size(); i++){
                sploscenSeznam.add(seznam.get(i));
            }
        }
        return sploscenSeznam;
 */