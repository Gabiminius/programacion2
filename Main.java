import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
    // click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
    public class Main {
    public static void main(String[] args) {
        Expendedor expendedor = new Expendedor(3);
        Moneda moneda = new Moneda();
        Bebida bebida1 = expendedor.comprarBebida(moneda, 1);

        System.out.println(bebida1.getSerie());
        System.out.println(bebida1.beber());


    }
}
class Deposito {
    private ArrayList<Bebida> bebidas;

    public Deposito() {
        bebidas = new ArrayList<>();
    }

    public void addBebida(Bebida bebida1) {
        bebidas.add(bebida1);
    }

    public Bebida getBebida() {
        if (bebidas.size() > 0) {
            return bebidas.remove(0);
        } else {
            return null;
        }
    }
}
    class Expendedor{
        private Deposito depositoCoca;
        private Deposito depositoSprite;
        private int serieCoca = 100;
        private int serieSprite = 200;

        public Expendedor(int cantidad) {
            depositoCoca = new Deposito();
            depositoSprite = new Deposito();


            for (int i = 0; i < cantidad; i++) {
                depositoCoca.addBebida(new CocaCola(serieCoca++));
                depositoSprite.addBebida(new Sprite(serieSprite++));
            }
        }

        public Bebida comprarBebida(Moneda moneda, int tipo) {
            if (tipo == 1) {
                return depositoCoca.getBebida();
            } else if (tipo == 2) {
                return depositoSprite.getBebida();
            }
            return null;
        }

    }
    class Moneda {
    public Moneda(){

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
class Sprite extends Bebida {
    public Sprite(int serie){
        super(serie);

    }
    public String beber(){
        return super.beber()+ " sprite";
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