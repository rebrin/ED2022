package unidad.iii;

import java.nio.file.FileStore;

public class ListaDoble<T> {
    NodoDoble<T> First;
    NodoDoble<T> Last;
    //constructor
    public ListaDoble(){
        First=Last=null;
    }
    public boolean vacia(){
        return First==null;
    }
    public void imprime(){
        if(!vacia()){
            System.out.print("[ ");
            for (NodoDoble<T> tmp=First;tmp!=null;tmp=tmp.next)
                System.out.print(" "+tmp.info+" ");
            System.out.println(" ]");
        }
    }
    public void insertarFrente(T el){
        if(vacia()){//caso 1:lista vacia
            First=Last=new NodoDoble<T>(el);
        }else{//caso 2: mas de un elemento
            NodoDoble<T> nvo=new NodoDoble<T>(el,null,First);
            First.prev=nvo;
            First=nvo;
        }
    }
    public void insertarFinal(T el){
        if(vacia()){
            First=Last=new NodoDoble<T>(el);
        }else {
            NodoDoble<T> nvo=new NodoDoble<T>(el,Last,null);
            Last.next=nvo;
            Last=nvo;
        }
    }

    public T eliminarFinal(){
        if(!vacia()){
            T el=Last.info;
            if(First==Last){//solo hay un hijo
                First=null;Last=null;
            }else {//caso 3, mas de un elemento
                Last=Last.prev;
                Last.next=null;
            }
            return el;
        }else
            return null;
    }
    public T eliminarFrente(){
        if(!vacia()){
            T el=First.info;
            if(First==Last){//solo hay un hijo
                First=null;Last=null;
            }else {//caso 3, mas de un elemento
                First=First.next;
                First.prev=null;
            }
            return el;
        }else
            return null;
    }

    public boolean buscar(T busq){
        NodoDoble tmp;
        for(tmp= First;tmp!=null&&tmp.info!=busq;tmp=tmp.next);
        return tmp!=null;
    }
    public int buscarPos(T busq){
        NodoDoble tmp;
        int cont;
        for(tmp=First,cont=0;tmp!=null&&tmp.info!=busq;tmp=tmp.next,cont++);
        return tmp==null?-1:cont;
    }

    //todo hacer el metodo delete (elimina de cualquier parte de la lista)

    public static void main(String[] args) {
        ListaDoble<Integer> listaEnteros=new ListaDoble<>();
        listaEnteros.insertarFrente(3);
        listaEnteros.insertarFrente(2);
        listaEnteros.insertarFrente(1);
        listaEnteros.insertarFinal(4);
        listaEnteros.insertarFinal(5);
        listaEnteros.imprime();
        System.out.println(listaEnteros.eliminarFinal());
        System.out.println(listaEnteros.eliminarFrente());
        System.out.println(listaEnteros.buscar(3));
        System.out.println(listaEnteros.buscarPos(5));

        listaEnteros.imprime();
    }
}
