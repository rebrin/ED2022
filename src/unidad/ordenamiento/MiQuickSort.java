package unidad.ordenamiento;

import java.util.Arrays;
import java.util.Random;

public class MiQuickSort {
    int N=10;
    int [] arr;

    public MiQuickSort(){
        Random r=new Random();
        for (int i = 0; i < N; i++) {
            arr[i]=r.nextInt(N*2);
        }
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public void quickSort(int [] arr,int indiceIzq,int indiceDer){
        //condición de parada
        if(indiceIzq<indiceDer){
            int inicio=ordenarSeccion(arr,indiceIzq,indiceDer);
            quickSort(arr,indiceIzq,inicio-1);
            quickSort(arr,inicio+1,indiceDer);
        }
    }

    private int ordenarSeccion(int[] arr, int indiceIzq, int indiceDer) {
        int pivote=arr[indiceDer];//toma el ultimo como pivote
        int elemento=indiceIzq-1;
        for (int i = indiceIzq; i <indiceDer ; i++) {
            if(arr[i]<pivote){ //intercambio
                elemento++;
                int tmp=arr[elemento];
                arr[elemento]=arr[i];
                arr[i]=tmp;
            }
        }
        elemento++;
        int tmp=arr[elemento];
        arr[elemento]=arr[indiceDer];
        arr[indiceDer]=tmp;
        //regresamos el ultimo elemento antes del pivote
        return elemento;
    }
}
