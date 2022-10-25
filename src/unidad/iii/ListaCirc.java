package unidad.iii;

public class ListaCirc <T>{
    NodoCirc<T> Tail;

    public ListaCirc(){
        Tail=null;
    }//inicializa la lista

    //lista vacia
    public boolean vacia(){
        return Tail==null;
    }

    public void insertarFrente(T inf){
        if(vacia()){
            Tail=new NodoCirc<>(inf);
            Tail.next=Tail;
        }else {
            NodoCirc<T> nvo=new NodoCirc<>(inf,Tail.next);
            Tail.next=nvo;
        }
    }

    public void insertarFinal(T el){
        NodoCirc<T> nvo=new NodoCirc<>(el);
        if(vacia()){
            Tail=nvo;
            nvo.next=Tail;
        }else{
            nvo.next=Tail.next;
            Tail.next=nvo;
            Tail=nvo;
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

    public T eliminarFrente(){
        if(!vacia()){
            NodoCirc<T> tmp;
            if(Tail==Tail.next){//solo hay 1
                tmp=Tail;
                Tail=null;
            }else {//hay mas 1
                tmp=Tail.next;
                Tail.next=tmp.next;
            }
            return tmp.info;
        }else
        return null;
    }

    public T eliminarFinal(){
        if(!vacia()){
            T el=Tail.info;
            if(Tail==Tail.next){//solo hay un elemento
                Tail=null;
            }else{//hay mas de un elemento en la lista
                NodoCirc<T> tmp;
                for(tmp=Tail.next;tmp.next!=Tail;tmp=tmp.next);
                tmp.next=Tail.next;
                Tail=tmp;
            }
            return el;
        }else
            return null;
    }
    public boolean buscar(T busc){
        NodoCirc<T> tmp;
        for(tmp=Tail.next;tmp!=Tail&& tmp.info!=busc;tmp=tmp.next);
        return tmp.info==busc;
    }

    // TODO: 20/10/2022 realizar el método de delete (borrar cualquier parte) 
    public static void main(String[] args) {
        ListaCirc<Integer> lc=new ListaCirc<>();
        lc.insertarFinal(1);
        lc.insertarFinal(2);
        lc.insertarFinal(3);
        lc.insertarFinal(4);
        lc.insertarFinal(5);
        lc.imprime();
//        System.out.println(lc.eliminarFinal());
//        System.out.println(lc.eliminarFinal());
//        System.out.println(lc.eliminarFinal());
//        lc.imprime();
        System.out.println(lc.buscar(1));
        System.out.println();
    }
}
