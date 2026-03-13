import java.util.ArrayList;
import java.util.Iterator;

public class OvojnikTabele implements Iterable<Object> {

     private Object[] tabela;
     
     public OvojnikTabele(Object[] tabela) {
        this.tabela = tabela;
    }
    @Override
    public Iterator<Object> iterator(){

        return new OvojnikIterator( this.tabela);
    }



    private class OvojnikIterator<Object> implements Iterator<Object>{
        private int indexTrenutni;
        private Object[] tabela;


        public OvojnikIterator(Object[] tabela){
            this.indexTrenutni = 0;
            this.tabela = tabela;

        }


        @Override
        public boolean hasNext(){
            return (this.tabela.length > indexTrenutni);
        }
        @Override
        public Object next(){
            return this.tabela[indexTrenutni++];
        }



    }
    

     
        /* 
        }
    
        @Override
        public Iterator<Object> iterator(){
            return new Iterator<Object>() {
                private int index = -1;
                

                 @Override
                 public boolean hasNext(){
                     index++;
                    return this.index < tabela.length;
                 }

                @Override
                public Object next(){
                    return tabela[index];
 */

                




            };
        