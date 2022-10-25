package unidad.i;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Scanner;

public class TestContacto {


    public static void guardar(ArrayList<Contacto> contactos)  {
        String ruta="./agenda.csv";
        File file=new File(ruta);
        try{
            Formatter escribe=new Formatter(file);
            for (Contacto c:contactos
                 ) {
                escribe.format(c.toString());
            }
            escribe.close();
            System.out.println("se guardo correctamente");
        }catch(Exception e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        ArrayList<Contacto> listaContactos = new ArrayList();

        cargarContactos(listaContactos);

        listaContactos.add(new Contacto("ivana",12,"ivy@gmail.com","789312546"));

        guardar(listaContactos);

    }

    private static void cargarContactos(ArrayList<Contacto> listaContactos) {
        String ruta="./agenda.csv";
        File file=new File(ruta);
        try{
            Scanner lectura=new Scanner(file);
            //leer
            String[] palabras=new String[4];
            while (lectura.hasNext()){
                palabras=lectura.next().split(",");
               listaContactos.add(new Contacto(palabras[0],Integer.parseInt(palabras[1]),palabras[2],palabras[3]));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
