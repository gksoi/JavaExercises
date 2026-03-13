import java.util.Scanner;


public class PostnePosiljke{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int razdaljnaCena = scanner.nextInt();
        int denarneEnoteZ = scanner.nextInt();
        int ekstraEnotaD  =scanner.nextInt();
        int cenaPriporocenega = scanner.nextInt();
        int cenaČrkeT = scanner.nextInt();
        int n = scanner.nextInt();
        Posiljka.nastaviCene(razdaljnaCena, denarneEnoteZ, ekstraEnotaD, cenaPriporocenega, cenaČrkeT);
        Posiljka[] pisma = new Posiljka[n];

        for(int i=0; i<n; i++ ){
            String info = scanner.nextLine();
            String[] informacije = info.split(" ");
            if(informacije[0].equals("NavadnoPismo")){
                pisma[i] = new Posiljka.NavadnoPismo(informacije[1], informacije[2], informacije[3]);
            }
            else if (informacije[0].equals("Telegram")) {
                pisma[i] = new Posiljka.Telegram(informacije[1], informacije[2]);
                
            }
            else{
                pisma[i] = new Posiljka.NavadnoPismo.PriporocenoPismo(informacije[1], informacije[2], informacije[3], informacije[4]);
            }
        }
        int ukaz = scanner.nextInt();
        if (ukaz==1) {
            for(Posiljka posiljka : pisma){
                System.out.println(posiljka);
            }
            
        }

        if (ukaz == 2) {
            Posiljka najdrazja = pisma[0];
            for(Posiljka posiljka : pisma){
                if (najdrazja.cena()< posiljka.cena()) {
                    najdrazja = posiljka;
                }
            }
            System.out.println(najdrazja);
        }

        if (ukaz == 3) {
            for(Posiljka posiljka : pisma){
                if (posiljka.getClass().getName()=="PriporocenoPismo") {
                    PriporocenoPismo povratnica = (PriporocenoPismo) posiljka;
                    System.out.println(posiljka.povratnica());
                    
                }
            }
        }

    
    
    
    }


    private static class Posiljka{
        private String naslovnik;
        private String vsebina;
        private static int R;
        private static int Z;
        private static int D;
        private static int P;
        private static int T;

        public Posiljka(String naslovnik, String vsebina){
            this.naslovnik = naslovnik;
            this.vsebina = vsebina;
        }

        public static void nastaviCene(int razdaljnaCena, int denarneEnoteZ, int ekstraEnotaD, int cenaPriporocenega , int cenaČrkeT){
            R = razdaljnaCena ;
            Z = denarneEnoteZ ;
            D = ekstraEnotaD ;
            P = cenaPriporocenega ;
            T = cenaČrkeT ;
        }

        public String vrniNaslovnika(){
            return this.naslovnik;
        }
        public String vrniVsebino(){ return this.vsebina;}

        public int cena(){
            return 0;
        }

        public String toString(){
            return this.getClass().getName() +" " + this.naslovnik + this.vsebina;
            
        }

        
        
        
        
        private static class NavadnoPismo extends Posiljka{
            private int razdaljaDoNaslovnika;
            private int cena;
            
            public NavadnoPismo(String naslovnik, String vsebina, String razdaljaDoNaslovnika){
                super(naslovnik, vsebina);
                this.razdaljaDoNaslovnika = Integer.valueOf(razdaljaDoNaslovnika);
                int i = 0;
                while (true) {
                    if (this.razdaljaDoNaslovnika>=i*R && this.razdaljaDoNaslovnika < R*(i+1)) {
                        this.cena = Z + i*D;
                        break;
                    }
                }
            }
            @Override
            public int cena(){
                return this.cena;
            }
            
            public String vrniNaslovnika(){
                return super.vrniNaslovnika();
            }
            public String vrnivsebino(){
                return super.vrnivsebino();
            }
            
            @Override
            public String toString(){
                return super.toString() + " " +this.cena + this.razdaljaDoNaslovnika;
            }
            
            
            
            
        }
        private static class PriporocenoPismo extends NavadnoPismo{
            private String posiljatelj;
            
            public PriporocenoPismo(String naslovnik, String vsebina, String razdaljaDoNaslovnika, String posiljatelj){
                super(naslovnik, vsebina, razdaljaDoNaslovnika);
                this.posiljatelj = posiljatelj;
                super.cena *= P;
            }
            @Override
            public int cena(){
                return super.cena;
            }
            
            @Override
            public String toString(){
                return super.toString() + " "+ this.posiljatelj;
            }
            
            public PriporocenoPismo povratnica(){
                return new PriporocenoPismo(this.posiljatelj, super.vrniVsebino()  , super.razdaljaDoNaslovnika, super.vrniNaslovnika() );
            }
            
        }
        public static class Telegram extends Posiljka{
            private int cena;
            public Telegram(String naslovnik, String vsebina){
                super(naslovnik, vsebina);
                this.cena = super.vsebina.replace("1","").replace("2","")
                .replace("3","").replace("4","")
                .replace("5","").replace("6","")
                .replace("7","").replace("8","")
                .replace("9","").replace("0","")
                .replace("_","").length()*T;
            }
            @Override
            public int cena(){
                return this.cena;
            }
    
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    



    
}