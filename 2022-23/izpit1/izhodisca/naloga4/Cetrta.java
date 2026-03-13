
/*
Samodejno testiranje:
tj.exe Cetrta.java . .

Testni primeri:

01, 02: primera iz besedila
03..06: u = 1
07..10: u = 2
*/

import java.util.*;

public class Cetrta {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int stevilo = scanner.nextInt();
        int ukaz = scanner.nextInt();
        ArrayList<Prodajalec> prodajalci = new ArrayList<>();
        ArrayList<String> prodajalciStr = new ArrayList<>();
          String zeljenProdukt = (ukaz == 2) ? scanner.next():null;
        for(int i = 0 ; i < stevilo ; i++){
            String s = scanner.next();
            if ( prodajalciStr.contains(s) ) {
            prodajalci.get(prodajalciStr.indexOf(s)).dodajProdukt(scanner.next(), scanner.nextInt());           
            }
            else{
                Prodajalec prodajalec = new Prodajalec(s, scanner.next(), scanner.nextInt());
                prodajalci.add(prodajalec);
                prodajalciStr.add(s);
            }
        }

        if (ukaz==1) {
            prodajalciStr.sort(new Comparator<String>() {
                @Override
                public int compare(String a , String b){
                    return a.compareTo(b);
                }
            });
            for(String s : prodajalciStr){
                System.out.println(s);
            }
        }

        else if ( ukaz == 2){
            prodajalci.sort(new Comparator<Prodajalec>( ) {
                private String produkt = zeljenProdukt;
                @Override
                public int compare( Prodajalec a  , Prodajalec b){
                    return a.dobiProduktCeno(this.produkt) - b.dobiProduktCeno(this.produkt);
                }
            });

            for(Prodajalec p : prodajalci){
                if (p.dobiProduktCeno(zeljenProdukt)!=-99) {
                    System.out.println(p);
                }
            }
        }


    }
    
}


class Prodajalec {
    private HashMap<String, Integer> produkti = new HashMap<>();
    private String ime;

    public Prodajalec (String ime, String p, int cena){
        this.produkti.put(p, cena);
        this.ime = ime;
    }

    public void dodajProdukt(String p, int cena ){
        produkti.put(p, cena);
    }
    public int dobiProduktCeno(String p){
        return (this.produkti.get(p)!=null) ? this.produkti.get(p):-99;
    }
    @Override
    public String toString(){
        return this.ime;
    }

}   
    
    
    
    
    /* 
    
    {
        Scanner scanner = new Scanner(System.in);
        int kolikoLjudi = scanner.nextInt();
        int ukaz = scanner.nextInt();
        ArrayList<String> imeArtikelCena = new ArrayList<>();
        String zeljeniArtikel = "";

        if (ukaz == 2) {
             zeljeniArtikel = scanner.next();
        }
        String u = scanner.nextLine();

        for (int x = 1; x <= kolikoLjudi; x++) {
            String naslednji = scanner.nextLine();
            imeArtikelCena.add(naslednji);
        }
       // imeArtikelCena.remove(kolikoLjudi);

     //   System.out.println(imeArtikelCena);
        ArrayList <Ponudnik> ponudniki = new ArrayList<>();
        int i= 0;
        
        for(String string : imeArtikelCena){
            String[] posamezni= string.split(" ");
            //System.out.println(Arrays.toString(posamezni));
    
            Ponudnik najnovejsi =new Ponudnik(posamezni[0]);
           
            if (ponudniki.contains(najnovejsi)) {
                 ponudniki.get(i).dodajProdukt(new Produkt(posamezni[1], Integer.parseInt(posamezni[2]) , najnovejsi) );
                
            }
            else{
            najnovejsi.dodajProdukt(new Produkt(posamezni[1], Integer.parseInt(posamezni[2]) , najnovejsi));
           
            ponudniki.add(najnovejsi);
            i++;
            }


    
        }
      //  System.out.println(ponudniki);
        Set<String> urejeniPonudniki = new HashSet<>();
        for(Ponudnik ponudnik : ponudniki){
        urejeniPonudniki.add(ponudnik.vrniIme());
        }


        ArrayList<String> poAbecedi = new ArrayList<>();
        poAbecedi.addAll(urejeniPonudniki);

        Collections.sort(poAbecedi);

        if (ukaz == 1) {
            for(String ime : poAbecedi){
                System.out.println(ime);
            }
            
        }

        ArrayList<Ponudnik> tistiKiprodajaja= new ArrayList<>();
        ArrayList<imeCena> x= new ArrayList<>();
        if (ukaz==2) {
            for(Ponudnik ponudnik : ponudniki){
                if (ponudnik.aliProdaja(zeljeniArtikel)) {
                    x.add(new imeCena(ponudnik.vrniIme(), ponudnik.vrniCenoProdukta(zeljeniArtikel)));

                    tistiKiprodajaja.add(ponudnik);
                }
            }
        Comparator<imeCena> comparator = new Comparator<imeCena>() {
            @Override
            public int compare(imeCena a, imeCena b){
                return a.vrniCeno() - b.vrniCeno();

            }
        };            

        Collections.sort(x, comparator);
        for(imeCena ime : x){
            System.out.println(ime.vrniIme());
        }

        }








    }}
    
    
    
    class imeCena{
        private String ime;
        private int cena;

        public imeCena(String ime, int cena){
            this.ime = ime;
            this.cena = cena;
        }

        public int vrniCeno(){return this.cena;}
        public String vrniIme(){return this.ime;}


    }

    


      class Ponudnik{
        private String ime;
        private ArrayList<Produkt> produkti;

        public Ponudnik(String ime){
            this.ime = ime;
            this.produkti = new ArrayList<Produkt>();
        }




        public String vrniIme(){return this.ime;}

        public void dodajProdukt(Produkt produkt){
            this.produkti.add( produkt );
        }


        public boolean aliProdaja (String artikelj){
            for(Produkt produkt: this.produkti){
                if (produkt.getIme().equals(artikelj)) {
                    return true;
                }
            }

            if (produkti.contains(artikelj)) {
                return true;
            }
            return false;
        }

        public int vrniCenoProdukta(String produkt){
            for(Produkt produkt2 : this.produkti){
                if (produkt2.vrniIme().equals(produkt)){
                    return produkt2.getCena();
                }
            }
            return 0;
        }









    }






      class Produkt{
        private String ime;
        private int cena;
        private Ponudnik ponudnik;


        public Produkt(String ime, int cena, Ponudnik ponudnik){
            this.ime = ime;
            this.cena = cena;
            this.ponudnik = ponudnik;
        }


        public String getIme(){
            return this.ime;
        }
        public int getCena(){
            return this.cena;
        }

        public String vrniIme(){
            return this.ime;
        }

        public Ponudnik getPonudnik(){
            return this.ponudnik;
        }













    }





 */