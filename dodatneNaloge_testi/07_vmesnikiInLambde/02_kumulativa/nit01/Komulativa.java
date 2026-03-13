import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class Komulativa{



public static <T> List<T> kumulativa(List<T> seznam, BinaryOperator<T> operator) {
    ArrayList<T> novSeznam = new ArrayList<>();
    T prviElement = seznam.get(0);
    novSeznam.add(prviElement);

    for(int i = 1; i < seznam.size(); i++){
        novSeznam.add(operator.apply(prviElement,seznam.get(i)));
    }

    return novSeznam;
}


















}


















