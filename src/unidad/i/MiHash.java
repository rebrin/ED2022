package unidad.i;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Scanner;

public class MiHash {
    public static void main(String[] args) {
        Hashtable<Character,String> Morse=new Hashtable<>();
        Morse.put('a',".-");
        Morse.put('b',"-...");
        Morse.put('c',"-.-.");
        Morse.put('d',"-..");
        Morse.put('e',".");
        Scanner s=new Scanner(System.in);

        System.out.println("introduce la palabra");
        String CadenaEntrada=s.nextLine();
        for(int i=0;i<CadenaEntrada.length();i++){
            char car=CadenaEntrada.charAt(i);
            if(Morse.containsKey(car)){
                System.out.print(Morse.get(CadenaEntrada.charAt(i))+" ");
            }else
                System.out.print(CadenaEntrada.charAt(i)+" ");
        }
    }
}
