package unidad.i;

public class Contacto {
    //atributos de clase
    String nombre;
    Integer edad;
    String correo;
    String Telefono;
    //constructor
    public Contacto(String nombre,Integer edad, String correo,String telefono){
        this.nombre=nombre;
        this.edad=edad;
        this.correo=correo;
        this.Telefono=telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    @Override
    public String toString() {
        return nombre+
                "," + edad +
                "," + correo +
                "," + Telefono+"\n";
    }
}
