package unidad.ii;

public class TriangPascal {
    public TriangPascal(){
        System.out.println(Triang(4,2));
        //todo hacer el triangulo completo hasta el nivel que le suministre el usuario
    }

    public int Triang(int f, int c){
        //condición de parada
        if(c==0)
            return 1;
        if(f==c)
            return 1;
        else
            return Triang(f-1,c)+Triang(f-1,c-1);
    }

    public static void main(String[] args) {
        new TriangPascal();
    }
}
