package unidad.iii;

public class NodoSimple {
    public int info;
    public NodoSimple next;

    //primer constructor
    public NodoSimple(int i, NodoSimple n){
        info=i;next=n;
    }
    //costructor 2
    public NodoSimple(int i){
        this(i,null);
    }
}
