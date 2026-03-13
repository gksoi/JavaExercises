import java.util.Iterator;
import java.util.List;

public class KombinacijaIteratorjev{


public static <T> Iterator<T> kombinacija(List<Iterator<T>> iteratorji){
    return new Iterator<T>() {
       private List<Iterator<T>> iteratorjii = iteratorji;
       private Iterator<Iterator<T>> iteratorPoIteratorjih = iteratorjii.iterator();
       private Iterator<T> trenutniIterator = iteratorPoIteratorjih.next();



        @Override
        public boolean hasNext(){
            if (trenutniIterator.hasNext()) {
                return true;
            }
            else{
                if(iteratorPoIteratorjih.hasNext()){
                trenutniIterator = iteratorPoIteratorjih.next();
                return true;

                }           
            }
            return false;
        }

        @Override
        public T next(){
            return trenutniIterator.next();
        }



    };




}









/* 
    return new Iterator<T>() {
         int trenutniIterator =-1;


        @Override
        public boolean hasNext(){

            trenutniIterator++;
            if (trenutniIterator == iteratorji.size()) {
                trenutniIterator=0;
            }
            if (!iteratorji.get(trenutniIterator).hasNext()) {
                return false;
            }
            
            return trenutniIterator < iteratorji.size();

        }

        @Override
        public T next() {
            return iteratorji.get(trenutniIterator).next();
        }
        
 */




    // };






}