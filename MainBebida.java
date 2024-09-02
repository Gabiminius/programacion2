package lab3;
import java.util.ArrayList;

public class MainBebida{
    public static void main(String[] args) {
        Bebida b1 = new Bebida(1);
        Bebida b2 = new Bebida(2);
        Bebida b3 = new Bebida(3);

        Deposito deposito = new Deposito();
        deposito.addBebida(b1);
        deposito.addBebida(b2);
        deposito.addBebida(b3);

        System.out.println(deposito.getBebida().getSerie());
        System.out.println(deposito.getBebida().getSerie());
        System.out.println(deposito.getBebida().getSerie());
        System.out.println(deposito.getBebida());


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


