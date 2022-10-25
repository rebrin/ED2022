package unidad.iii;

public class Cola<T> extends ListaDoble<T>{
    public Cola(){
        super(); //llama al constrcutor padre
    }
    public void queue(T el){
        insertarFinal(el);
    }
    public T dequeue(){
        return eliminarFrente();
    }
    public T peek(){
        return First.info;
    }

    public static void main(String[] args) {
        Cola<Integer> c=new Cola<>();
        c.queue(1);
        c.queue(2);
        c.queue(3);
        c.queue(4);
        c.queue(5);
        c.imprime();
        System.out.println("atendio:"+c.dequeue());
        System.out.println("atendio:"+c.dequeue());
        c.imprime();
    }
}
