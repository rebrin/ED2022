package unidad.ii;

import java.io.Console;
import java.math.BigInteger;
import java.util.Scanner;

public class FactorialRec {
    //constructor
    public FactorialRec(){

        Scanner s=new Scanner(System.in);
        System.out.println("Número y potencia plis?");
        long n=s.nextLong();
        long pot=s.nextLong();
        //llamada rec
        System.out.println(pote(n,pot));
    }

    public long fact(long n){
        //caso base 1 y 0
        if(n==0 || n==1)
            return 1;
        else
            return n*fact(n-1);
    }
    public long pote(long n,long pot){
        //caso base 1 y 0
        if(pot==0)
            return 1;
        if(pot==1)
            return n;
        else
            return n*pote(n,pot-1);
    }



    public static void main(String[] args) {
        new FactorialRec();
    }
}
