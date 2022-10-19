package unidad.iii;

public class ListaCirc <T>{
    NodoCirc Tail;

    public ListaCirc(){
        Tail=null;
    }//inicializa la lista

    //lista vacia
    public boolean vacia(){
        return Tail==null;
    }

    public void insertarFrente(T inf){
        if(vacia()){
            Tail=new NodoCirc(inf);
            Tail.next=Tail;
        }else {
            NodoCirc<T> nvo=new NodoCirc(inf,Tail.next);
            Tail.next=nvo;
        }
    }

    public void imprime(){
        if(!vacia()){
            System.out.print("[ ");
            NodoCirc<T> tmp;
            tmp=Tail.next;
            do{
                System.out.print(" "+tmp.info+" ");
                tmp=tmp.next;
            }while (tmp!=Tail.next);
            System.out.println(" ]");
        }
    }

    public static void main(String[] args) {
        ListaCirc<Integer> lc=new ListaCirc<>();
        lc.insertarFrente(1);
        lc.insertarFrente(2);
        lc.insertarFrente(3);
        lc.imprime();
        System.out.println();
    }
}
