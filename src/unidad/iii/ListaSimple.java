package unidad.iii;

import kotlin.LazyThreadSafetyMode;

import java.nio.file.FileStore;
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

    public void insertarFinal(int i){
        NodoSimple nuevo=new NodoSimple(i);
        if(vacia()){
            First=Last=nuevo;
        }else{
            Last.next=nuevo;
            Last=Last.next;
        }
    }

    public void imprime(){
        System.out.print("[ ");
        for (NodoSimple tmp = First;tmp!=null;tmp=tmp.next){
            System.out.printf(" %d ",tmp.info);
        }
        System.out.println("]");
    }

    public int eliminaFinal(){
        if(!vacia()){
            int el=Last.info;
            if(First==Last){//caso 2:un solo elemento
                First=Last=null; //dejo vacia
            }else{//caso 3:mas de un elemento
                NodoSimple tmp;
                for(tmp=First;tmp.next!=Last;tmp=tmp.next);// 1 antes
                Last=tmp;
                Last.next=null;
            }
            return el;
        }else return Integer.MIN_VALUE;
    }

    public int eliminarFrente(){
        if(!vacia()){
            int el =First.info;
            if(First==Last){
                First=Last=null;
            }else {
                First=First.next;
            }
            return el;
        }
        return Integer.MIN_VALUE;
    }
    public boolean enLista(int el){
        NodoSimple tmp;
        for(tmp=First;tmp!=null && tmp.info!=el;tmp=tmp.next);
        return tmp!=null;
    }
    public void delete(int el){
        if(!vacia()){
            if(First==Last && el==First.info){//primero y unico
                First=Last=null; //limpio la lista
            }else if(el==First.info){//si está al inicio de la lista
                First=First.next;//me muevo al sig
            }else{//esta o en medio o al final de la lista
                NodoSimple pred,tmp;
                for (pred=First,tmp=First.next;
                     tmp!=null && tmp.info!=el;
                     pred=pred.next,tmp=tmp.next);//para encontrar
                if(tmp!=null){//si econtró un elemento
                    pred.next=tmp.next;
                    if(tmp==Last)
                        Last=pred;
                }
            }
        }
    }

    public static void main(String[] args) {
        ListaSimple l=new ListaSimple();
        l.insertaFrente(3);
        l.insertaFrente(2);
        l.insertaFrente(1);
        l.insertarFinal(4);
        l.insertarFinal(7);
        l.insertarFinal(24);
        l.imprime();
//        System.out.println(l.eliminaFinal());
//        System.out.println(l.eliminaFinal());
//        System.out.println(l.eliminarFrente());
//        System.out.println(l.eliminarFrente());
        System.out.println(l.enLista(24));
        l.delete(4);
        l.delete(1);
        l.delete(24);
        l.imprime();
        System.out.println();
    }
}
