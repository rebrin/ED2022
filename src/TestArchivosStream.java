import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TestArchivosStream {
    public static void main(String[] args) {
        try {
            Stream<String> filas = Files.lines(Paths.get("./src/productos.csv"));
            //filas.forEach(System.out::println);

           Double suma= filas.map(c->c.split(","))
                    .map(arr->Double.parseDouble(arr[1]))
                    .reduce(0d,(a,b)->a+b);
            System.out.println(suma);
            filas.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
