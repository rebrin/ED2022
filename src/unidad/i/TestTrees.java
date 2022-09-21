package unidad.i;

import com.sun.source.tree.Tree;

import javax.print.attribute.standard.MediaSize;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.TreeSet;

public class TestTrees {
    public static void main(String[] args) {
        Random r=new Random();
        ArrayList<Integer>ListaEnteros=new ArrayList<>();
        TreeSet<Integer>TreeEnteros=new TreeSet<>();
        for (int i = 0; i < 1000000; i++) {
            Integer NAlea=r.nextInt(1000000);
            ListaEnteros.add(NAlea);
            TreeEnteros.add(NAlea);
        }
        ListaEnteros.add(1000001);
        TreeEnteros.add(1000001);

        //System.out.println(ListaEnteros);
        //System.out.println(TreeEnteros);

        double ti=System.currentTimeMillis();
        System.out.println(TreeEnteros.contains(1000001));
        System.out.println(System.currentTimeMillis()-ti);
        /* formas de iterar
        for (Integer ele:TreeEnteros) {
            System.out.println(ele);
        }*/

        Iterator<Integer>it=ListaEnteros.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

    }
}
