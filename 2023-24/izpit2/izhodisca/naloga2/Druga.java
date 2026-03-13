
/*
Samodejno testiranje:

tj.exe

Javni testni primeri:

01: primer iz besedila
02: vse smeri so 1 ali 2, ostalo enako kot v besedilu
02--06: vse smeri so 1 ali 2
01, 07--10: splo"sni primeri

V vseh testnih primerih (javnih in skritih) so elementi tabele <rel>
"stevila z intervala [-1000, 1000].
*/

import java.util.*;

public class Druga {

    public static void main(String[] args) {
        // dopolnite za potrebe ro"cnega testiranja
    }

    public static int[][] visine(int[][] rel, int[][] smer){
        int h = rel.length;
        int w = rel[0].length;
        int[][] vrni = new int[h][w];
        int[][] grdiIndeksi = new int[h*w][4];
        int a = 0;
        vrni[0][0] = 0;
        for(int i = 0; i < h ; i++){
            for(int j = 0 ; j < w ; j++){
                int smerr = smer[i][j];
                int rell = rel[i][j];
                // System.out.println(smerr);
                switch(smerr){
                    case 0:
                    continue;
                    case 1:
                    if(vrni[i-1][j]==0 && i!=0 && j!=0){
                    grdiIndeksi[a][0]=i;
                    grdiIndeksi[a][1]=j;
                    grdiIndeksi[a][2]=smerr;
                    grdiIndeksi[a][3]=rell;
                    grdiIndeksi[++a][0]= -100;

                }else{
                    vrni[i][j] = rell + vrni[i][j-1];
                    }continue;

                    case 2:
                    if(vrni[i-1][j]==0 && i!=0 && j!=0){
                    grdiIndeksi[a][0]=i;
                    grdiIndeksi[a][1]=j;
                    grdiIndeksi[a][2]=smerr;
                    grdiIndeksi[a][3]=rell;
                    grdiIndeksi[++a][0]= -100;

                }
                else{
                    vrni[i][j] = rell + vrni[i-1][j];
                    }continue;
                    
                    case 3 :
                    grdiIndeksi[a][0]=i;
                    grdiIndeksi[a][1]=j;
                    grdiIndeksi[a][2]=smerr;
                    grdiIndeksi[a][3]=rell;
                    grdiIndeksi[++a][0]= -100;
                    continue;

                    case 4 :
                    grdiIndeksi[a][0]=i;
                    grdiIndeksi[a][1]=j;
                    grdiIndeksi[a][2]=smerr;
                    grdiIndeksi[a][3]=rell;
                    grdiIndeksi[++a][0]= -100;

                    continue;
                }
                
            }
        }
        int b = 0;        
        while(grdiIndeksi[b][0] != -100){
            
            int i = grdiIndeksi[b][0];
            if(i==-100){
                break;
            }
            int x = i;
            int j = grdiIndeksi[b][1];
            int y = j;

            int ssmer =grdiIndeksi[b][2];
            int reel =grdiIndeksi[b][3];

            if(ssmer==4){
                i++;
                if(vrni[i][j]==0){
                    if(vrni[i-1][j]==0 ){
                    grdiIndeksi[a][0]=i;
                    grdiIndeksi[a][1]=j;
                    grdiIndeksi[a][2]=ssmer;
                    grdiIndeksi[a][3]=reel;
                    grdiIndeksi[++a][0]= -100;

                }
                }
                vrni[x][y] = reel + vrni[i][j];

            }
            else if(ssmer==3){
                j++;
                if(vrni[i][j]==0){
                    if(vrni[i-1][j]==0 ){
                    grdiIndeksi[a][0]=i;
                    grdiIndeksi[a][1]=j;
                    grdiIndeksi[a][2]=ssmer;
                    grdiIndeksi[a][3]=reel;
                    grdiIndeksi[++a][0]= -100;

                }
                }
                vrni[x][y] = reel + vrni[i][j];
            }
            else if(ssmer==1){
                j--;
                if(vrni[i][j]==0){
                    if(vrni[i-1][j]==0){
                    grdiIndeksi[a][0]=i;
                    grdiIndeksi[a][1]=j;
                    grdiIndeksi[a][2]=ssmer;
                    grdiIndeksi[a][3]=reel;
                    grdiIndeksi[++a][0]= -100;

                }
                }

            }
            
            b++;
            if(b==h*w){
                break;
            }


        }
        vrni[0][0] = 0;



        return vrni;

    }
    
    /* {
        int[][] visine = new int[rel.length][rel[0].length];

        for(int i =0; i < rel.length; i++ ){
            for(int x = 0; x<rel[i].length; x++){
                if (smer[i][x] == 0) {
                    rel[i][x] = 0;
                }
                if (smer[i][x] == 1) {
                    int nadmorska = rel[i][x]+ rel[i][x-1];
                    rel[i][x] = nadmorska;
                }
                if (smer[i][x] == 2) {
                    int nadmorska  =rel[i][x]+ rel[i-1][x];
                    rel[i][x] = nadmorska;
                }
                if (smer[i][x] == 3) {
                    int nadmorska = rel[i][x]+ rel[i][x+1];
                    rel[i][x] = nadmorska;
                }
                if (smer[i][x] == 4) {
                    int nadmorska = rel[i][x]+ rel[i+1][x];
                    rel[i][x] = nadmorska;
                }

            }
        }



        return rel;
    }
 */
    // pomo"zne metode, notranji razredi (po potrebi) ...
}
