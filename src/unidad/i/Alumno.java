package unidad.i;

import com.sun.nio.sctp.AbstractNotificationHandler;

public class Alumno {
    String Nombre;
    String APaterno;
    String AMaterno;
    Integer NC;

    //const
    public Alumno(String Nombre, String paterno, String materno,Integer nc){
        this.Nombre=Nombre;
        APaterno=paterno;
        AMaterno=materno;
        NC=nc;
    }

    @Override
    public String toString() {
        return "NC:"+NC+" Nombre:"+Nombre+" "+APaterno+" "+AMaterno;
    }

}
