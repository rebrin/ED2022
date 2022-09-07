
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class JuegoPalindromo {
    public static void main(String[] args) {
        System.out.println("introduce la palabra a evaluar");
        Scanner s=new Scanner(System.in);

        String cad=s.nextLine();
        //todas a minusculas y filtrar algunos caracteres especiales
        cad=cad.toLowerCase();
        cad=cad.replace(" ","");
        cad=cad.replace(".","");
        cad=cad.replace("\n","");
        cad=cad.replace("í","i");
        cad=cad.replace("á","a");
        cad=cad.replace("é","e");
        cad=cad.replace(",","");

        ArrayDeque<Character> pila=new ArrayDeque<>();
        Queue<Character> cola=new ArrayDeque<>();
        for(int i=0;i<cad.length();i++){
            Character letra=cad.charAt(i);
            pila.push(letra);
            cola.add(letra);
        }
        System.out.println(pila);
        System.out.println(cola);
        boolean palindromo=true;
        while (!pila.isEmpty()){
            Character p=pila.pop();
            Character c=cola.poll();
            if(p!=c){
                palindromo=false;
                break;
            }
        }
        if(palindromo)
            System.out.println("la palabra es palindromo");
        else
            System.out.println("no es palindromo");
    }
}
