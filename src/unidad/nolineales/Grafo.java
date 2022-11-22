package unidad.nolineales;

import java.util.ArrayDeque;

public class Grafo {
    Grafo(){
        NodoG CHERAN=new NodoG("CHERAN");
        NodoG QUIROGA=new NodoG("QUIROGA");
        NodoG PURUANDIRO=new NodoG("PURUANDIRO");
        NodoG APATZINGAN=new NodoG("APATZINGAN");
        NodoG PATZCUARO=new NodoG("PATZCUARO");
        NodoG MORELIA=new NodoG("MORELIA");
        NodoG URUAPAN=new NodoG("URUAPAN");
        NodoG CDHIDALGO=new NodoG("CIUDAD HIDALGO");
        NodoG ZAMORA=new NodoG("ZAMORA");
        conecta(CHERAN,PATZCUARO);
        conecta(QUIROGA,MORELIA);
        conecta(PURUANDIRO,MORELIA);
        conecta(PATZCUARO,MORELIA);
        conecta(CDHIDALGO,MORELIA);
        conecta(URUAPAN,MORELIA);
        conecta(URUAPAN,PATZCUARO);
        conecta(URUAPAN,APATZINGAN);
        conecta(QUIROGA,ZAMORA);

        System.out.println(busqG(APATZINGAN,ZAMORA));
    }//constructor vacio
    public void conecta(NodoG a,NodoG b){
        if(!a.listaAdy.contains(b))
            a.listaAdy.add(b);
        if(!b.listaAdy.contains(a))
            b.listaAdy.add(a);
    }

    public boolean busqG(NodoG Origen,NodoG Destino){
        ArrayDeque<NodoG> frontera=new ArrayDeque<>();
        ArrayDeque<NodoG> visitados=new ArrayDeque<>();
        //incluye origen en frontera
        frontera.add(Origen);
        while(true){
            if(frontera.isEmpty()){
                //no hay solución
                return false;
            }
            NodoG S=frontera.poll();
            if(S==Destino){//solucion
                System.out.println(path(S));
                return true;
            }
            visitados.add(S);
            S.listaAdy.stream().filter
                    (hijo->!frontera.contains(hijo) && !visitados.contains(hijo))
                    .forEach(hijo->{frontera.add(hijo); hijo.padre=S;});
        }
    }

    public String path(NodoG actual){
        String camino= actual.nombre;
        while(actual.padre!=null){
            camino=actual.padre.nombre+"-"+camino;
            actual=actual.padre;
        }
        return camino;
    }

    public static void main(String[] args) {
        new Grafo();
    }
}
