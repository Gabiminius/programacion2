package lab3;

import java.util.EnumSet;

public class Main27 {
    public static void main(String[] args) {
        Expendedor e1= new Expendedor();
        Moneda m1=new Moneda();
    }
}
class Expendedor{
    private int deposito;
    public Expendedor(){

    }
    public Bebida comprarBebida(Moneda m){
        Bebida b1=new Bebida();
        return b1;

    }

}
class Bebida {

    public Bebida() {

    }

    public String beber() {
            String s = new String("gluglu");
            return s;
    }

}
class Moneda{
    public Moneda(){

    }
}


