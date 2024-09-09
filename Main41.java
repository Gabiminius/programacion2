package Lab4;

import java.util.ArrayList;

public class Main41 {
    public static void main(String[] args) {
        Deposito d1=new Deposito( );
        Deposito d2=new Deposito( );
        Deposito d3=new Deposito( );
        Deposito d4=new Deposito( );
        d1.addBebida(new CocaCola(15));
        d1.addBebida(new CocaCola(16));
        d2.addBebida(new Kem(30));
        d2.addBebida(new Kem(31));
        d2.addBebida(new Kem(32));
        d3.addBebida(new Fanta(45));
        d3.addBebida(new Fanta(46));
        d3.addBebida(new Fanta(47));
        d4.addBebida(new Sprite(60));
        d4.addBebida(new Sprite(61));
        Bebida b=null;
        b=d1.getBebida();
        if(b!=null)System.out.println(b.getSerie()+", "+b.beber());
        b=d1.getBebida();
        if(b!=null)System.out.println(b.getSerie()+", "+b.beber());
        b=d1.getBebida();
        if(b!=null)System.out.println(b.getSerie()+", "+b.beber());
        b=d1.getBebida();
        if(b!=null)System.out.println(b.getSerie()+", "+b.beber());
        b=d1.getBebida();

    }
}

abstract class  Bebida{
    private int serie;
    public Bebida(int serie){
        this.serie=serie;

    }
    public int getSerie(){
        return serie;
    }
    public String beber(){
               return "sabor:";
    }
}

class Deposito {
    private ArrayList<Bebida> bebida1;

    public Deposito() {
        bebida1 = new ArrayList<>();
    }

    public void addBebida(Bebida bebida) {
        bebida1.add(bebida);
    }

    public Bebida getBebida() {
        if (bebida1.size()!=0) {
            return bebida1.remove(0);
        } else {
            return null;
        }
    }
}
class Sprite extends Bebida {
    public Sprite(int serie){
        super(serie);

    }
    public String beber(){
        return super.beber()+ " sprite";
    }

}
class Fanta extends Bebida {
    public Fanta(int serie){
        super(serie);

    }
    public String beber(){
        return super.beber()+" fanta";
    }

}
class Kem extends Bebida {
    public Kem(int serie){
        super(serie);

    }
    public String beber(){
        return super.beber()+ " kem";
    }

}
class CocaCola extends Bebida {
    public CocaCola(int serie){
        super(serie);

    }
    public String beber(){
        return super.beber()+" cocacola";
    }

}
