package unidad.busquedas;


import java.util.Arrays;
import java.util.Scanner;

public class BSecuencial {
    int N=10;
    int [] arr;

    public BSecuencial(){
        Scanner s=new Scanner(System.in);
        arr=new int[N];
        for (int i = 0; i < N; i++) {
            arr[i]=(int)(Math.random()*(N*2));
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Introduce un elemento a buscar");
        int busc=s.nextInt();
        System.out.println(buscarS(busc));
    }

    private int buscarS(int busc) {
        for (int i = 0; i < N; i++) {
            if(busc==arr[i]){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        new BSecuencial();
    }
}
