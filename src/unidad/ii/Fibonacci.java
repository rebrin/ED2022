package unidad.ii;

import java.io.Console;
import java.util.Scanner;

public class Fibonacci {
    public Fibonacci(){
        System.out.println("introduce el numero fibonacci?");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

    }
    public int fib(int n){
        if(n==0 || n==1)
            return n;
        else
            return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        new Fibonacci();
    }
}
