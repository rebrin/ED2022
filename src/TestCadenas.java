import java.util.ArrayList;
import java.util.Comparator;

public class TestCadenas {
    public static void main(String[] args) {
        ArrayList<String> Cadenas=new ArrayList<>();
        Cadenas.add("rebrin");
        Cadenas.add("romeo");
        Cadenas.add("julieta");
        Cadenas.add("william");
        Cadenas.add("dufenshmiths");
        Cadenas.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(Cadenas);
        System.out.println(Cadenas.contains("rebrin"));
        System.out.println(Cadenas.indexOf("rebrin"));
        System.out.println(Cadenas.get(3));
    }
}
