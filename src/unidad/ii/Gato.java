package unidad.ii;

import java.util.Scanner;

public class Gato {
    //tablero de juego
    int [][] tablero=new int[3][3];
    int turno=0;
    Scanner s=new Scanner(System.in);
    public Gato(){
        //inicilizar el tablero
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                tablero[i][j]=-1;
            }
        }//termina inicia

        //mostrar tablero incial
        mostrarTablero();
        juega();

    }

    public void juega(){
       while(!hayGanador()){
            if(turno%2==0) {
                turnoHumano();
            }else {
                turnoMaquina();
            }
        }
        System.out.println("termino el juego");
    }

    public void turnoHumano(){
        System.out.println("introduce la posición x(1-3),y(1-3)");
        int x=s.nextInt();
        int y=s.nextInt();
        if(tablero[x-1][y-1]==-1)
           tablero[y-1][x-1]=1;
        System.out.println();
        mostrarTablero();
        turno++;
    }
    //aqui va minimax
    public void turnoMaquina(){
        for(int i=0;i< tablero.length;i++){
            for (int j = 0; j < tablero.length; j++) {
                if(tablero[i][j]==-1){
                    tablero[i][j]=2;
                    mostrarTablero();
                    turno++;
                    return;
                }
            }
        }

    }

    public void mostrarTablero(){
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

    //determina si hay ganador
    public boolean hayGanador(){
        if(tablero[0][0]==tablero[0][1] && tablero[0][1]==tablero[0][2] &&tablero[0][0]!=-1 )
            return true; //fila superior
        if(tablero[1][0]==tablero[1][1] && tablero[1][1]==tablero[1][2] && tablero[1][0]!=-1)
            return true;//fila media
        if(tablero[2][0]==tablero[2][1] && tablero[2][1]==tablero[2][2] && tablero[2][0]!=-1)
            return true; //fila inferior
        if(tablero[0][0]==tablero[1][0] && tablero[1][0]==tablero[2][0] &&tablero[0][0]!=-1)
            return true;//columnas
        if(tablero[0][1]==tablero[1][1] && tablero[1][1]==tablero[2][1] &&tablero[0][1]!=-1)
            return true;
        if(tablero[0][2]==tablero[1][2] && tablero[1][2]==tablero[2][2] &&tablero[1][2]!=-1)
            return true;
        if(tablero[0][0]==tablero[1][1] && tablero[1][1]==tablero[2][2]&&tablero[0][0]!=-1)
            return true;//diagonales
        if(tablero[0][2]==tablero[1][1] && tablero[1][1]==tablero[2][0] &&tablero[0][2]!=-1)
            return true;//diagonales
        else
            return false;
    }

    public boolean hayEspacios(){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero.length; j++) {
                if(tablero[i][j]==-1)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        new Gato();
    }
}
