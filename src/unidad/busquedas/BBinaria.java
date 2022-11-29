package unidad.busquedas;

import java.util.Arrays;
import java.util.Scanner;

public class BBinaria {
    int N=10;
    int[] arr=new int[N];
    public BBinaria(){
        for (int i = 0; i < N; i++) {
            arr[i]=(int)(Math.random()*(2*N));
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Scanner s= new Scanner(System.in);
        System.out.println("buscado?>");
        int buscado=s.nextInt();
        System.out.println(binaria(buscado,0,arr.length));
    }

    private int binaria(int buscado,int inf,int sup) {
        int mitad;        //condición de parada
        if (inf > sup)
            return -1;
        else {
            mitad = (inf + sup) / 2;
            if (buscado < arr[mitad])
                return binaria(buscado, inf, mitad - 1);
             else if(buscado >arr[mitad])
                return binaria(buscado,mitad+1,sup);
             else return mitad;
        }
    }

    public static void main(String[] args) {
        new BBinaria();
    }
}
