import java.util.ArrayList;
import java.util.Scanner;
public class PotiPoGrafu{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int steviloVozlisc = 6;//scanner.nextInt();
        int steviloPovezav = 5;//scanner.nextInt();
        Graf graf = new Graf(steviloVozlisc, steviloPovezav);
        graf.dodajPovezavo(1,3);
        graf.dodajPovezavo(1, 5);
        graf.dodajPovezavo(2, 3);
        graf.dodajPovezavo(2, 1);
        graf.dodajPovezavo(3, 1);
        graf.sprintajPovezave();
        graf.povezave(2,5,-1);

      //  for(int i=0; i < steviloPovezav; i++){

      //      String povezava = scanner.nextInt();
     //   }
        


    }
    private static class Graf{
        private int steviloVozlisc;
        private int steviloPovezav;
        private int[] vozlisca;
        private ArrayList<ArrayList<Integer>> povezave;
        private int safety;
    
        public  Graf(int steviloVozlisc, int steviloPovezav){
            this.steviloVozlisc =  steviloVozlisc;
            this.steviloPovezav = steviloPovezav;
            this.vozlisca = new int[steviloVozlisc];
            this.povezave = new ArrayList<ArrayList<Integer>>();
            this.safety=0;
            for(int x = 0 ; x < this.steviloVozlisc; x++){
                this.vozlisca[x] = x;
                this.povezave.add(new ArrayList<Integer>());
            }
        }
    
        public int vrniSteviloVozlisc(){
            return this.steviloVozlisc;
        }
        public int vrniSteviloPovezav(){
            return this.steviloPovezav;
        }
        public void sprintajPovezave(){
            System.out.println(this.povezave);

        }
    
        public void dodajPovezavo(int zacetnoVozlisce, int koncnoVozlisce){
            this.povezave.get(zacetnoVozlisce).add(koncnoVozlisce);
            this.povezave.get(zacetnoVozlisce).sort(null);
            //System.out.println(this.povezave);
        }
    
        public void povezave(int zacetnoVozlisce, int koncnoVozlisce, int izKeregaVozliscaSiPrisel){
            boolean imaTastevilkaKoncnoVozlisce = false;
                for(int x = 0; x< this.povezave.get(zacetnoVozlisce).size();x++ ){
                    //  System.out.println(x);
                    for(int vozlisce :this.povezave.get(zacetnoVozlisce) ){
                        if (vozlisce == koncnoVozlisce) {
                            imaTastevilkaKoncnoVozlisce = true;
                       }
                        
                    }
                    for(int vozlisce :this.povezave.get(zacetnoVozlisce) ){
                        if (imaTastevilkaKoncnoVozlisce) {
                            System.out.print(" "+zacetnoVozlisce);
                            if (vozlisce < koncnoVozlisce && vozlisce != izKeregaVozliscaSiPrisel) {
                                povezave(vozlisce, koncnoVozlisce, zacetnoVozlisce );
                            }
                            System.out.println(String.format(" %d %n", koncnoVozlisce));
                        }
                        else if (vozlisce != izKeregaVozliscaSiPrisel) {
                            povezave(vozlisce, koncnoVozlisce, zacetnoVozlisce );

                        }{

                        }
                    }
                    
                    
                    
   
            }
        }
            
        

}    }


