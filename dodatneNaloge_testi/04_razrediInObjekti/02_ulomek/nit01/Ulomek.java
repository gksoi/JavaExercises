import java.math.*;


public class Ulomek{
    private int stevec;
    private int imenovalec;




public Ulomek(int a, int b){
    int gcd = okrajsaj(a, b);
    if (a>0 && b<0 || a<0 && b<0) {
        b*=-1;
        a*=-1;
    }
    if (b!=0  ) {
        this.stevec = a/gcd;
        this.imenovalec = b/gcd;
        
    }

}

private int okrajsaj(int a, int b){
    BigInteger gcd = BigInteger.valueOf(a);
   // System.out.println(gcd.gcd(BigInteger.valueOf(b)).intValue());
    return gcd.gcd(BigInteger.valueOf(b)).intValue();
}


public String toString(){
    return String.format("%d/%d",this.stevec, this.imenovalec );

}

public boolean jeEnakKot(Ulomek u){
    return this.toString().equals(u.toString());
}

public Ulomek negacija(){
    return new Ulomek(this.stevec*(-1), this.imenovalec);

}

public Ulomek obrat(){
    return new Ulomek(this.imenovalec, this.stevec);

}

public Ulomek vsota(Ulomek u) {
    return new Ulomek(this.stevec*u.imenovalec + u.stevec*this.imenovalec,  this.imenovalec * u.imenovalec);

}
public Ulomek razlika(Ulomek u) {
    return new Ulomek(this.stevec*u.imenovalec - u.stevec*this.imenovalec,  this.imenovalec * u.imenovalec);


}
public Ulomek zmnozek(Ulomek u) {
    return new Ulomek(this.stevec*u.stevec, this.imenovalec*u.imenovalec);

}
public Ulomek kolicnik(Ulomek u){
    return new Ulomek(this.stevec*u.imenovalec, this.imenovalec*u.stevec);

}

public Ulomek potenca(int eksponent){
    BigInteger stevecNaEksponent = BigInteger.valueOf(this.stevec);
    BigInteger imenovalecNaEksponent = BigInteger.valueOf(this.imenovalec);

    if (eksponent==0) {
        return new Ulomek(1, 1);
    }
    if (eksponent>0) {
        return new Ulomek(stevecNaEksponent.pow(eksponent).intValue(), imenovalecNaEksponent.pow(eksponent).intValue());
    }
    return new Ulomek( imenovalecNaEksponent.pow(eksponent*(-1)).intValue(),stevecNaEksponent.pow(eksponent*(-1)).intValue());
}


public boolean jeManjsiOd(Ulomek u){
    return this.stevec/this.imenovalec < u.stevec/u.imenovalec;

}




}