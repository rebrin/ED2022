package unidad.iii;

import kotlin.LazyThreadSafetyMode;

import java.util.concurrent.FutureTask;

public class ListaSimple {
    NodoSimple First;
    NodoSimple Last;

    public ListaSimple(){
        First= Last=null;
    }

    public boolean vacia(){
        return First==null;
    }

    public void insertaFrente(int info){
        if(vacia()) {//caso 1 lista vacia
            First=Last=new NodoSimple(info);
        }else{//caso2 hay mas de un elemento
            NodoSimple nuevo=new NodoSimple(info, First);
            First=nuevo;
        }
    }

    public static void main(String[] args) {
        ListaSimple l=new ListaSimple();
        l.insertaFrente(3);
        l.insertaFrente(2);
        l.insertaFrente(1);
        System.out.println();
    }
}
