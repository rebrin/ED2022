import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TestSets {

    public static void main(String[] args) {
        //declaración e inicialización
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(2);
        set.add(2);
        set.add(3);
        //elimina duplicados
        System.out.println(set);
        //borramos el set
        //set.clear();
        //System.out.println(set);
        //declaramos lista, tienen elementos duplicados
        ArrayList<Integer> duplicados=new ArrayList<>();
        duplicados.add(1);
        duplicados.add(2);
        duplicados.add(2);
        duplicados.add(2);
        duplicados.add(2);
        duplicados.add(2);
        duplicados.add(3);
        duplicados.add(4);
        duplicados.add(4);
        duplicados.add(5);
        //eliminamos los duplicados usando Sets
        Set<Integer> SinDup=new HashSet<>();
        SinDup.addAll(duplicados);
        System.out.println(SinDup);

    }
}
