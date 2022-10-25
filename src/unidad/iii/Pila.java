package unidad.iii;

public class  Pila <T> extends ListaDoble<T>{
    //constructor
    public Pila(){
        super();//llamada al constructor padre
    }
    public void push(T el){
        insertarFinal(el);
    }
    public T pop(){
        return eliminarFinal();
    }
    public T top(){
        return Last.info;
    }

    public static void main(String[] args) {
        Pila<Integer> pila=new Pila<>();
        pila.push(2);
        pila.push(3);
        pila.push(1);
        pila.push(4);
        pila.push(5);
        pila.imprime();
        System.out.println(pila.top());
        System.out.println("sale:"+pila.pop());
        System.out.println("sale:"+pila.pop());
        pila.imprime();
    }
}
