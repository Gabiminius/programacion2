package lab3;
import java.util.ArrayList;

public class MainBebida{
    public static void main(String[] args) {
        Bebida b=new Bebida(4);
        b.llenar(500);
        System.out.println(b.getSerie());
        System.out.println(b.beber(40));
        System.out.println(b.beber(0));
        System.out.println(b.beber(460));
        System.out.println(b.beber(3));


    }
}
class Bebida {
    public static final int VOLUMEN = 500;
    private int contenido;
    private int serie;

    public Bebida(int serie) {
        this.contenido = 0;
        this.serie = serie;
    }

    public int getSerie() {
        return serie;
    }

    public void llenar(int lleno) {
        if (lleno <= Bebida.VOLUMEN) {
            contenido = lleno;
        } else {
            contenido = VOLUMEN;
        }
    }

    public int beber(int tomo) {
        if (tomo <= 0) {
            return 0;
        }

        if (tomo > contenido) {
            int consumido = contenido;
            contenido = 0;
            return consumido;
        } else {
            contenido = contenido -tomo;
            return tomo;
        }
    }
}
class Deposito{
    private ArrayList<Bebida> bebidas;
    public Deposito(){
        bebidas= new ArrayList<>();

    }
    public void addBebida(Bebida bebida){
        bebidas.add(bebida);
    }
    public Bebida getBebida(){
        if (bebidas.size() > 0) {
            return bebidas.remove(0);
        } else {
            return null;
        }

    }
}


