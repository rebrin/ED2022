package unidad.ii;

import java.util.Scanner;

public class Gato {
    int turno=0;
    Scanner s=new Scanner(System.in);
    public Gato(){
        int [][] tablero=new int[3][3];
//        inicilizar el tablero
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j]=-1;
            }
        }//termina inicia
       //int [][] tablero={{2,2,1},{2,1,-1},{-1,-1,-1}};
        //mostrar tablero incial
        mostrarTablero(tablero);
        juega(tablero);
    }

    public void juega(int [][] tablero){
       while(isMovesLeft(tablero)&&!hayGanador(tablero)){
            if(turno%2==0) {
               turnoHumano(tablero);
            }else {
                turnoMaquina(tablero);
            }
            mostrarTablero(tablero);
        }
        System.out.println("termino el juego");
    }

    public void turnoHumano(int [][] tablero){
        boolean turnoVal=false;
        while (!turnoVal){
        System.out.println("introduce la posición x(0-2),y(0-2) fila,col");
        int x=s.nextInt();
        int y=s.nextInt();
            if(tablero[x][y]==-1){
               tablero[x][y]=1;
                System.out.println();
                //mostrarTablero();
                turno++;
                turnoVal=true;
            }else
                System.out.println("jugada no valida");
        }//fin del while
    }
    //aqui va minimax
    public void turnoMaquina(int [][] tablero){
        int bestScore=Integer.MIN_VALUE;//aqui en vez de menos infinito
        int bestI=0,bestJ=0;
        int score=0;
        for(int i=0;i< tablero.length;i++){
            for (int j = 0; j < tablero.length; j++) {
                if(tablero[i][j]==-1){
                    tablero[i][j]=2;
                    score=minimax(tablero,0,false);
                    tablero[i][j]=-1;
                    if(score > bestScore){
                        bestScore=score;
                        bestI=i;
                        bestJ=j;
//                        System.out.println(score+" "+bestScore);
//                        System.out.println(bestI+" "+bestJ);
                    }
                }
            }
        }
        tablero[bestI][bestJ]=2;
    //    System.out.printf("\n%d %d %d\n",bestScore,bestI,bestJ);
        turno++;
    }

    private int minimax(int[][] tablero,int depth, boolean isMaxim) {
        int score=evalua(tablero);
//        mostrarTablero(tablero);
//        System.out.println(score);
        System.out.println();
        if (score==1)//gana MAX
            return score;
        if(score==-1)//gana MIN
            return score;
        if(isMovesLeft(tablero)==false) //ya no hay elementos
            return 0;
        if(isMaxim){
            int punt=0;
            int bestScore=Integer.MIN_VALUE;
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero.length; j++) {
                    if(tablero[i][j]==-1){//si esta disponible el espacio
                        tablero[i][j]=2;//escribe el valor de la IA
                        bestScore=Math.max(bestScore,minimax(tablero,depth+1,false));
                        tablero[i][j]=-1;//deshace el tiro
                    }
                }
            }
            return bestScore;
        }//fin de if maxim
        else { //es un turno de jugador
            int punt=0;
            int bestScore=Integer.MAX_VALUE;
            for (int i = 0; i < tablero.length; i++) {
                for (int j = 0; j < tablero.length; j++) {
                    if(tablero[i][j]==-1){//si esta disponible el espacio
                        tablero[i][j]=1;//escribe el valor del jugador
//                        punt=minimax(tablero,depth+1,true);//turno de min
                        bestScore=Math.min(bestScore,minimax(tablero,depth+1,true));
                        tablero[i][j]=-1;//deshace el tiro
//                        bestScore=Integer.min(punt,bestScore);
                    }
                }
            }
            return bestScore;
        }
    }

    public void mostrarTablero(int [][] tablero){
        //1 nosotros, 2 la maquina, -1 vacio
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if(tablero[i][j]==1){
                    System.out.print(" X ");
                } else if (tablero[i][j]==2) {
                    System.out.print(" 0 ");
                }else System.out.print(" _ ");
            }
            System.out.println();
        }
    }

    //esta función se encarga de evaluar quien gana, -1 gano, 1 gana la máquina, 0 empate o sigue
    public int evalua(int [][] tablero){
        for (int row = 0; row<3; row++)
        {
            if (tablero[row][0]==tablero[row][1] &&
                    tablero[row][1]==tablero[row][2])
            {
                if (tablero[row][0]==1)
                    return -1;
                else if (tablero[row][0]==2)
                    return 1;
            }
        }

        // verificamos las columnas.
        for (int col = 0; col<3; col++)
        {
            if (tablero[0][col]==tablero[1][col] &&
                    tablero[1][col]==tablero[2][col])
            {
                if (tablero[0][col]==1)
                    return -1;
                else if (tablero[0][col]==2)
                    return 1;
            }
        }
        // verificamos las diagonales.
        if (tablero[0][0]==tablero[1][1] && tablero[1][1]==tablero[2][2])
        {
            if (tablero[0][0]==1)
                return -1;
            else if (tablero[0][0]==2)
                return 1;
        }
        if (tablero[0][2]==tablero[1][1] && tablero[1][1]==tablero[2][0])
        {
            if (tablero[0][2]==1)
                return -1;
            else if (tablero[0][2]==2)
                return 1;
        }
        // si no hay ganador regresamos 0
        return 0;
    }
    //determina si hay ganador
    public boolean hayGanador(int[][] tablero){
        if(tablero[0][0]==tablero[0][1] && tablero[0][1]==tablero[0][2] && tablero[0][0]!=-1 )
            return true; //fila superior
        if(tablero[1][0]==tablero[1][1] && tablero[1][1]==tablero[1][2] && tablero[1][0]!=-1)
            return true;//fila media
        if(tablero[2][0]==tablero[2][1] && tablero[2][1]==tablero[2][2] && tablero[2][0]!=-1)
            return true; //fila inferior
        if(tablero[0][0]==tablero[1][0] && tablero[1][0]==tablero[2][0] && tablero[0][0]!=-1)
            return true;//columnas
        if(tablero[0][1]==tablero[1][1] && tablero[1][1]==tablero[2][1] && tablero[0][1]!=-1)
            return true;
        if(tablero[0][2]==tablero[1][2] && tablero[1][2]==tablero[2][2] && tablero[1][2]!=-1)
            return true;
        if(tablero[0][0]==tablero[1][1] && tablero[1][1]==tablero[2][2]&&tablero[0][0]!=-1)
            return true;//diagonales
        if(tablero[0][2]==tablero[1][1] && tablero[1][1]==tablero[2][0] &&tablero[0][2]!=-1)
            return true;//diagonales
        else
            return false;
    }

    boolean isMovesLeft(int [][] tablero)
    {
        for (int i = 0; i<3; i++)
            for (int j = 0; j<3; j++)
                if (tablero[i][j]==-1)
                    return true;
        return false;
    }
    public static void main(String[] args) {
        new Gato();
    }
}
