public class Cuenta {
    private Double Saldo;
    private String Nombre;
    private Integer NC;

    public Cuenta(Double saldo, String nombre, Integer NC) {
        Saldo = saldo;
        Nombre = nombre;
        this.NC = NC;
    }

    public Double getSaldo() {
        return Saldo;
    }

    public void setSaldo(Double saldo) {
        if(saldo>0)
            Saldo = saldo;
        else{
            Saldo=0.0;
            System.out.println("no se aceptan saldos negativos");
        }
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Integer getNC() {
        return NC;
    }

    public void setNC(Integer NC) {
        this.NC = NC;
    }

    @Override
    public String toString() {
        return "Cuenta{" +
                "Saldo=" + Saldo +
                ", Nombre='" + Nombre + '\'' +
                ", NC=" + NC +
                '}';
    }
}
