package unidad.iii;

public class NodoCirc<T> {
    NodoCirc next;
    T info;
    public NodoCirc(T info){
        this(info,null);
    }

    public NodoCirc(T info,NodoCirc n){
        this.info=info;
        next=n;
    }
}
