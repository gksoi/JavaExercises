public class Pismo{
    private Posta izvorna;
    private Posta ciljna;
    private boolean jePriporoceno;
    private int razdalja;
    private static int p;
    private static int c;
    private static int r;


    public static void nastaviKonstanteZaCeno( int enotaRazdalje, int enotaCene, int priporocnina){
         r= enotaRazdalje;
         c= enotaCene;
         p= priporocnina;



    }
    
    
    
    public Pismo(Posta izvorna, Posta ciljna, boolean jePriporoceno, int razdalja){
    this.izvorna = izvorna;    
    this.ciljna = ciljna;    
    this.jePriporoceno = jePriporoceno;    
    this.razdalja = razdalja;    
    }


    @Override
    public String toString(){
        String n;
        if (jePriporoceno) {
             n = "P";
        }
        else{ 
             n = "N";
    }
        return String.format("%s -> %s (%d km) [%s]", this.izvorna, this.ciljna, this.razdalja, n );
    }

    public boolean izviraOd(Posta posta){
        if (posta.equals(this.izvorna)) {
            return true;
            
        }
        return false;
    }

    public boolean staIzvorInCiljIsta(){
        if (this.izvorna.equals(this.ciljna)) {
            return true;
        }
        return false;
    }

    public boolean imaIstiCiljKot(Pismo pismo){
        return pismo.ciljna.equals(this.ciljna);
    }

    public static boolean imataIstiCilj(Pismo p1, Pismo p2){
        return p1.ciljna.equals(p2.ciljna);
    }

    public int cena(){
        int i = 1;
        while (true) {
            if (this.razdalja <= (i*r)-1) {
                return i*c + ((jePriporoceno)? p:0);            
            }
            i++;
            
        }

    }


    public boolean jeDrazjeOd(Pismo p){
         return this.cena()>p.cena();}

    public static Pismo vrniDrazje(Pismo p1, Pismo p2){
        return (p1.cena()<=p2.cena())? p2:p1;
    }

    public Pismo izdelajPovratno(){
        return new Pismo(this.ciljna, this.izvorna, this.jePriporoceno, this.razdalja);
    }

}