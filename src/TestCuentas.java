import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestCuentas {
    public static void main(String[] args) {
     Cuenta c1=new Cuenta(125000.0,"Berlin",01);
     Cuenta c2=new Cuenta(5000.500,"Tokio",02);
     Cuenta c3=new Cuenta(123564.5,"Profesor",03);
     Cuenta c4=new Cuenta(789526.5,"Moscu",04);
     Cuenta c5=new Cuenta(1250.5,"Rio",05);

     ArrayList<Cuenta>cuentas=new ArrayList<>();
     cuentas.add(c1);
     cuentas.add(c2);
     cuentas.add(c3);
     cuentas.add(c4);
     cuentas.add(c5);


        List<Cuenta> filtradas=new ArrayList<>();
     filtradas=cuentas.stream().filter(cuenta -> cuenta.getSaldo()>5000)
             .collect(Collectors.toList());
        //filtradas.forEach(cuenta -> System.out.println(cuenta));
        //todo mostrar todas las cuentas que contengan una i en el nombre
        List<Cuenta> nombres=new ArrayList<>();
        nombres=cuentas.stream()
                .filter(cad->cad.getNombre().contains("i"))
                .collect(Collectors.toList());
        //nombres.forEach(c-> System.out.println(c));
//        for (Cuenta cuenta:cuentas) {
//            if(cuenta.getNombre().contains("i")){
//                nombres.add(cuenta);
//            }
//        }
//        nombres.forEach(c-> System.out.println());
        //todo mostrar todos los que tengan un saldo menor a 6000
        List<Cuenta> menorSeisMil=new ArrayList<>();
        menorSeisMil=cuentas.stream()
                .filter(cuenta -> cuenta.getSaldo()<6000)
                .collect(Collectors.toList());
        menorSeisMil.forEach(c-> System.out.println(c));
        //todo mostrar saldo entre 2000 y 20000


    }
}
