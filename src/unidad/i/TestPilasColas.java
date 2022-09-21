package unidad.i;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TestPilasColas {
    public static void main(String[] args) {
        Queue<Integer> cola=new ArrayDeque<>();
        cola.add(1);
        cola.add(2);
        cola.add(3);
        cola.add(4);
        System.out.println(cola);
        System.out.println(cola.poll());
        System.out.println(cola);
        cola.add(1);
        System.out.println(cola);
        //------------------------
        System.out.println("---------------------------------------------");
        ArrayDeque<Integer> pila=new ArrayDeque<>();
        pila.push(1);
        pila.push(2);
        pila.push(3);
        pila.push(4);
        pila.push(4);
        System.out.println(pila);
        System.out.println(pila.pop());
        System.out.println(pila);
        pila.poll();
        pila.poll();
        pila.poll();
        pila.poll();
        pila.poll();
        System.out.println(pila);
        }
    }

