public class Naslednik extends NaravnoStevilo{
    private NaravnoStevilo predhodnik;

    public Naslednik(NaravnoStevilo stevilo){
        this.predhodnik = stevilo;
        this.vrednostVintu = stevilo.vrednostVintu +1;
        
    }

    public NaravnoStevilo naslednik(){
        return new Naslednik(this);
    }

    public NaravnoStevilo predhodnik(){
        return this.predhodnik;

    }



    }
