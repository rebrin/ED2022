package unidad.ordenamiento;

import java.util.Arrays;
import java.util.Random;
public class InsertSort {
    int N=10000;
    public InsertSort(){
        int[] arr=new int[N];
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i]=r.nextInt(N*2);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(insertionSort(arr)));
    }
    public int[] insertionSort(int[] arr){
        for(int i=1;i<arr.length;i++){
            int j=i;
            int el=arr[i];
            while (j>0 && arr[j-1]>el){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=el;
        }
        return arr;
    }

    public static void main(String[] args) {
        new InsertSort();
    }
}
