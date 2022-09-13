import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestArchivosStream {
    public static void main(String[] args) {
        try {
            Stream<String> filas = Files.lines(Paths.get("./src/productos.csv"));
            //filas.forEach(System.out::println);
//
//           Double suma= filas.map(c->c.split(","))
//                    .map(arr->Double.parseDouble(arr[1]))
//                    .reduce(0d,(a,b)->a+b);
//            System.out.println(suma);

            List<Producto> productos=new ArrayList<>();
            productos=filas
                    .map(fila->fila.split(","))
                    .map(fila->new Producto(fila[0],Double.parseDouble(fila[1]),Integer.parseInt(fila[2])))
                    .collect(Collectors.toList());
//            System.out.println(productos);
            filas.close();
            productos.add(new Producto("gansito",20.00,10));
            productos.forEach(System.out::println);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
