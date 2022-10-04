package unidad.ii;

import java.io.Console;
import java.util.Scanner;

public class MCDRec {
    public MCDRec(){
        //Console consola=System.console();
        Scanner s=new Scanner(System.in);
        //if(consola!=null){
        System.out.println("introduce el numero1");
        int a=s.nextInt();
        System.out.println("ahora el 2");
        int b=s.nextInt();
        System.out.println("resultado:"+euclides(a,b));
        //}
    }

    public int euclides(int a, int b){
        //cond parada
        if(b==0)
            return a;
        else
            return euclides(b,a %b);
    }

    public static void main(String[] args) {
        new MCDRec();
    }
}
