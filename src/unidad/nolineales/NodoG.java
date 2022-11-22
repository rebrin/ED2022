package unidad.nolineales;

import java.util.ArrayList;

public class NodoG {
    NodoG padre;
    String nombre;
    ArrayList <NodoG> listaAdy;
    public NodoG(String name){
        padre=null;
        nombre=name;
        listaAdy=new ArrayList<>();
    }
}
