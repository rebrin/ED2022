package unidad.i;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;

public class TestEstructuras {
    public static void main(String[] args) {
        //declara
        ArrayList<Integer> MisEnteros;
        //new = inicia
        MisEnteros=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 10; i++) {
            MisEnteros.add(r.nextInt(100));
        }
      MisEnteros.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
        System.out.println(MisEnteros);
    }
}
