package unidad.ordenamiento;

import java.util.Arrays;
import java.util.Random;

public class MiMergeSort {
    int N=10;
    int[] lista=new int[N];
    public MiMergeSort(){
        Random r=new Random();
        for (int i = 0; i < N; i++) {
            lista[i]=r.nextInt(N*2);
        }
        System.out.println(Arrays.toString(lista));
        mergeSort(lista,0, lista.length-1);
        System.out.println(Arrays.toString(lista));
    }

    public void mergeSort(int[] lista,int ini,int fin){
        if (ini < fin) {
            int med=(fin+ini)/2;
            mergeSort(lista,ini,med);
            mergeSort(lista,med+1,fin);
            mezclar(lista,ini,med,fin);
        }
    }

    private void mezclar(int[]lista,int ini,int med,int fin) {
        int izq=ini,der=med+1,ia=0;
        int[]liAux=new int[lista.length];//para pedir
        while(izq<=med && der<=fin){
            if(lista[izq]<lista[der]){
                liAux[ia]=lista[izq];
                izq++;
                ia++;
            }else {
                liAux[ia]=lista[der];
                der++;
                ia++;
            }
        }//fin de while
        //for para copiar las partes restantes
        for (int k = der; k <= fin; k++) {
            liAux[ia]=lista[k];
            ia++;
        }
        for (int k = izq; k <=med ; k++) {
            liAux[ia]=lista[k];
            ia++;
        }
        //for es para copiar la lista aux a la lista orignal
        for (int k = 0; k <= ia-1; k++) {
            lista[ini+k]=liAux[k];
        }
    }

    public static void main(String[] args) {
        new MiMergeSort();
    }
}
