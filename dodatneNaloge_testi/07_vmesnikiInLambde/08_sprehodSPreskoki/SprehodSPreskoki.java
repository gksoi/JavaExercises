import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* 
 * kaj sm naredu:
 * najprej razred sprehodSpreskoki implmentira iterable kar pomeni da mora imeti metodo iterator() ki vrne iterator() čez tega
 * v konstruktorju je ze seznam in korak zato naredim nov iterator ki ima kot dva kriterija namesto enega ki je samo list po navadi, tu je se korak
 * zacetni index prilagodim tako, da se bo prvic dal na konec ali zacetek
 * in potem s vsakinm hasnext dodal +=k
 */
public class SprehodSPreskoki<T> implements Iterable<T>{
    private List<T> seznam;
    private int korak;

    public SprehodSPreskoki(List<T> seznam, int korak){
        this.seznam = seznam;
        this.korak = korak;
    }
    
    @Override
    public Iterator<T> iterator(){
        return new PoskocniIterator(this.seznam, this.korak);
    }


    private class PoskocniIterator<T > implements Iterator<T>{
        private List<T> tabela;
        private int indexRN;
        private int korak;
        private boolean nazaj;


        public PoskocniIterator(List<T> tabela, int korak){
            this.tabela = tabela;
            this.korak = korak;
            this.indexRN = (korak > 0) ? -1*this.korak : (tabela.size()-1) - this.korak;
            this.nazaj = korak <= 0;
            
            
        }

        @Override
        public boolean hasNext(){
            if (nazaj) {
                this.indexRN += this.korak;
                return this.indexRN >= 0;
            }

            else{
                this.indexRN += this.korak;
                return this.indexRN < this.tabela.size();
            }
            
        }
        
        @Override
        public T next(){
            return this.tabela.get(this.indexRN);
        }


    }





        
    }

    







    /* 
    private ArrayList<T> seznam;
    private int korak;


    public SprehodSPreskoki(List<T> seznam, int korak){
        this.seznam = new ArrayList<>();
        this.seznam.addAll(seznam);
        this.korak = korak;
    }


    @Override
    public Iterator<T> iterator(){
        return new Iterator<T>() {
            private int index = (korak > 0) ? 0 : seznam.size()-1; 
            private int notranjiIndex = -1;
            

            @Override
            public boolean hasNext(){
                notranjiIndex++;
                index =(korak > 0)? notranjiIndex * korak : (seznam.size()-1) + notranjiIndex*korak ;
                return index < seznam.size() && index > -1;
            }
            
            
            @Override
            public T next(){
                return seznam.get(index);
            } */





/*@Override
    public Iterator<T> iterator(){
        return new Iterator<T>() {
            int samoZaPreverjanjeIndex =0;
            int index =0;
            int faktorZaKorak = 0;

            @Override
            public boolean hasNext(){
                return samoZaPreverjanjeIndex < seznam.size();
            }

            @Override
            public T next(){
                BigInteger absolut = BigInteger.valueOf(korak);
                if (korak < 0 && index==0) {
                    samoZaPreverjanjeIndex++;
                    T oddaj = seznam.getLast();
                    index = seznam.size() -1;
                    faktorZaKorak++;
                    if (index + faktorZaKorak*korak < seznam.size()&&index + faktorZaKorak*korak >=0) {
                        index += faktorZaKorak*korak;
                    }                    
                    return oddaj;
                }
                
                  T oddaj = seznam.get(index);
                  samoZaPreverjanjeIndex += absolut.abs().intValue();
                  faktorZaKorak++;
                  if (index - faktorZaKorak*absolut.abs().intValue() < seznam.size()&& index - faktorZaKorak*absolut.abs().intValue() >=0 && korak<0) {
                    index -= faktorZaKorak*absolut.abs().intValue();
                }  
                  if (faktorZaKorak*korak < seznam.size() && faktorZaKorak*korak >=0) {
                      index = faktorZaKorak*korak;
                  }

                  return oddaj;
            }
            



        };
    } */
