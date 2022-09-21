package unidad.i;

import java.util.ArrayList;

public class TestAlumno {
    public static void main(String[] args) {
        Alumno a1 = new Alumno("rebrin", "rubalcava", "lopez", 1);
        Alumno a2 = new Alumno("Esteban", "Sanchez", "Garcia", 2);
        Alumno a3 = new Alumno("Miguel de Jesus", "Juarez", "Chavez", 3);
        Alumno a4 = new Alumno("Miguel Angel", "Juarez", "Chavez", 4 );
        /*Alumno[] alumnos=new Alumno[4];
        alumnos[0]=a1;
        alumnos[1]=a2;
        alumnos[2]=a3;
        alumnos[3]=a4;*/
        ArrayList<Alumno>Alumnos=new ArrayList<>();
        Alumnos.add(a1);
        Alumnos.add(a2);
        Alumnos.add(a3);
        Alumnos.add(a4);
        Alumnos.add(new Alumno("Carlos","Campos","Charicata",2022));
        for (int i=0;i<Alumnos.size();i++) {
            System.out.println(Alumnos.get(i));

        }

       /* for (int i = 0; i < alumnos.length; i++) {
            System.out.println(alumnos[i]);
        }*/
    }
}

