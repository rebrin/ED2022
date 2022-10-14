package unidad.iii;

public class NodoDoble <T>{
    T info;
    NodoDoble next;
    NodoDoble prev;
    public NodoDoble(T i){
        this(i,null,null);
    }
    public NodoDoble(T i,NodoDoble p,NodoDoble n){
        info=i;
        prev=p;
        next=n;
    }
}
