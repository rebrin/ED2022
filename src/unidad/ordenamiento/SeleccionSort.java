package unidad.ordenamiento;

import java.util.Arrays;
import java.util.Random;

public class SeleccionSort {
    int N=100000;
    int [] arr= new int[N];
    public SeleccionSort(){
        Random r=new Random();
        for (int i = 0; i < N; i++) {
            arr[i]=r.nextInt(N*2);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(selection()));
    }

    public int [] selection(){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1,min=i; j < arr.length; j++) {
                if(arr[j]<arr[min])
                    min=j;
                if( min!=i){
                    int tmp=arr[i];
                    arr[i]=arr[min];
                    arr[min]=tmp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        new SeleccionSort();
    }
}
