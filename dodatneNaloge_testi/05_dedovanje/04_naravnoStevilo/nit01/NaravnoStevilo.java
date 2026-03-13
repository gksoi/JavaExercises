import java.util.NoSuchElementException;

public abstract class NaravnoStevilo{
   // protected NaravnoStevilo vrednostKotNaravnoStevilo ;
     int vrednostVintu;
  


    public boolean jeEna(){
        if (this.vrednostVintu == 1) {
            return true;
        }
        return false;
    }

    public abstract  NaravnoStevilo naslednik();

    public abstract NaravnoStevilo predhodnik();
    public  NaravnoStevilo vsota(NaravnoStevilo stevilo){
        NaravnoStevilo toStevilo = this;
        NaravnoStevilo plus = new Naslednik(toStevilo);
         for(int i=0; i<stevilo.toInt()-1; i++){

            plus = new Naslednik(plus);
        }
        return plus;
    }
    public  NaravnoStevilo razlika(NaravnoStevilo stevilo){
        NaravnoStevilo toStevilo = this;
        NaravnoStevilo plus = toStevilo.predhodnik();
         for(int i=0; i<stevilo.toInt()-1; i++){

            plus = plus.predhodnik();
        }
        return plus;
    }
   public  NaravnoStevilo zmnozek(NaravnoStevilo stevilo){
        NaravnoStevilo toStevilo = this;
        NaravnoStevilo plus = new Ena();
         for(int i=0; i<stevilo.toInt(); i++){
            for(int x = 0; x<this.toInt() ; x++){
            plus = new Naslednik(plus);
        }}
        return plus.predhodnik();
   }
  //  public abstract String toString();
    public  int toInt(){
        return this.vrednostVintu;
    }

    public String toString(){
        if (this.toInt()==1) {
            return "1";
        }
        String niz = "";
        NaravnoStevilo minus = this;
        int steviloOklepajev =0;
        while (minus.toInt() != 1) {
            niz+="s(";
            minus = minus.predhodnik();
            steviloOklepajev++;
        }
        niz+="1";
        for(int i=0; i<steviloOklepajev; i++){
            niz+=")";
        }
        return niz;

    }



    public static NaravnoStevilo ustvariIzInt(int n){
        NaravnoStevilo zacetek = new Ena();
        for(int i =0; i< n ; i++){
            zacetek = zacetek.naslednik();

        }
        return zacetek;
    }





}