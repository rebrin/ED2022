package unidad.ordenamiento;

import java.util.Arrays;
import java.util.Random;

public class Bubble {
    int n=100000;
    int [] arr=new int[n];
    public Bubble(){
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(n*2);
        }
        System.out.println(Arrays.toString(arr));
        ordenaBurbuja();
        System.out.println(Arrays.toString(arr));
    }

    public void ordenaBurbuja(){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1; j++) {
                if(arr[j]>arr[j+1]){
                    //intercambio
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
    }
    public static void main(String[] args) {
        new Bubble();
    }
}
