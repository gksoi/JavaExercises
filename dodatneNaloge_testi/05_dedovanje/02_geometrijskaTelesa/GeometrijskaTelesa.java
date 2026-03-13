import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.crypto.dsig.keyinfo.KeyValue;

public class GeometrijskaTelesa {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double steviloVrstic = scanner.nextInt();
        Krogla krogla = new Krogla("krogla", steviloVrstic); 
        System.out.println(krogla);
        for(int i=0; i < steviloVrstic; i++){
            if (scanner.nextInt()==1) {//kvader

                
            }
        }
    }}


  class Telo{
    private String vrsta;
     final BigDecimal pi = new BigDecimal(3.14);
     final BigDecimal triCetrt = new BigDecimal(4.00/3.00);
     private int ploscina;
     private int volumen;

    public Telo(String vrsta){
        this.vrsta = vrsta;
    }

    public String vrniVrsto(){
        return this.vrsta;
    }
    protected void nastaviVolumen(int v){
        this.volumen = v;
    }
    protected void nastaviPloscino(int v){
        this.ploscina = v;
    }

    public int vrniPloscino(){ 
        return this.ploscina;
    }

    public int vrniVolumen(){ 
        return this.volumen;
    }



}

    class Pravokotnik extends Telo{
        private int a;
        private int b;
        private int c;

        public Pravokotnik(String vrsta, int a, int b, int c){
            super(vrsta);
            this.a = a;
            this.b = b;
            this.c = c;

            super.nastaviPloscino(2*((a*b)+(b*c)+(c*a)));
            super.nastaviVolumen(a*b*c);

        }

        public String toString(){
            return String.format("%s%nr = %d%nV = %d%nP =%d%n======", super.vrniVrsto(), this.rob, super.vrniVolumen(), super.vrniPloscino());
        }

    }

  class Krogla extends Telo{
    private int rob;


    public Krogla(String vrsta, double rob) {
            super(vrsta);
            BigDecimal ploscinaX = new BigDecimal(rob);
            BigDecimal stiri = new BigDecimal(4);
            ploscinaX = ploscinaX.pow(2).multiply(pi).multiply(stiri).setScale(0, RoundingMode.HALF_UP);
            
            this.rob = ploscinaX.intValue();
            BigDecimal volumenX = new BigDecimal(rob);
            volumenX = volumenX.pow(3).multiply(pi).multiply(triCetrt).setScale(0,RoundingMode.HALF_UP);
            super.nastaviPloscino(ploscinaX.intValue())
            super.nastaviVolumen(volumenX.intValue());
        }
    
        public String toString(){
            return String.format("%s%nr = %d%nV = %d%nP =%d%n======", super.vrniVrsto(), this.rob, super.vrniVolumen(), super.vrniPloscino());
        }



}



