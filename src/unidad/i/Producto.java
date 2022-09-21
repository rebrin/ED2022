package unidad.i;

public class Producto {
    String Nombre;
    Double Precio;
    Integer Cantidad;

    public Producto(String nombre, Double precio, Integer cantidad) {
        Nombre = nombre;
        Precio = precio;
        Cantidad = cantidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Double getPrecio() {
        return Precio;
    }

    public void setPrecio(Double precio) {
        Precio = precio;
    }

    public Integer getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Integer cantidad) {
        Cantidad = cantidad;
    }

    @Override
    public String toString() {
        return Nombre+","+Precio+","+Cantidad;
    }
}
