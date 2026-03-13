import java.util.NoSuchElementException;

public class Ena extends NaravnoStevilo{
    private final int ena =1;
    public Ena(){
        this.vrednostVintu = ena;
    }

    public  int vrniVrednostVintu(){
        return this.ena;
    }
    public NaravnoStevilo naslednik(){
    return new Naslednik(this);
    }

    public NaravnoStevilo predhodnik(){
        throw new NoSuchElementException();
    }
}