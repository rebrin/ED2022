package unidad.ordenamiento;

import java.util.Arrays;
import java.util.Random;

public class ShellSort {
    int N=1000000;
    int [] arr=new int[N];
    public ShellSort(){
        Random r=new Random();
        for (int i = 0; i < N; i++) {
            arr[i]=r.nextInt(N*2);
        }
        System.out.println(Arrays.toString(arr));
        ShSort();
        System.out.println(Arrays.toString(arr));
    }

    private void ShSort() {
        int brecha=arr.length/2;
        while (brecha>0){
            for (int recorrido=brecha;recorrido<arr.length
                    ;recorrido++){
                int actual=arr[recorrido];
                int ind=recorrido;
                while(ind>=brecha&&arr[ind-brecha]>actual){
                    arr[ind]=arr[ind-brecha];
                    ind-=brecha;
                }//fin while
                arr[ind]=actual;
            }//fin for
            brecha=brecha/2;
        }//fin de while
    }


    public static void main(String[] args) {
        new ShellSort();
    }
}
