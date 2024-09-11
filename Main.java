import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

    }
}
class Expendedor{
    private Deposito coca;
    private Deposito sprite;
    private DepositoM monVu;
    public Expendedor(Moneda m,int tipo){


    }
    public comprarBebida(){


    }
    public getVuelto(){

    }

}
class Comprador{
    private String sonido;
    private int vuelto;
    public Comprador(Moneda m,int cualBebida, Expendedor exp){

    }
    public cuantoVuelto(){

    }
    public queBebiste(){

    }
}
    abstract class  Moneda{
    private int valor;

    public Moneda(int valor){

        this.valor=valor;

    }

    public abstract int getValor();




}
class Moneda1500 extends Moneda{
    public Moneda1500(){
        super(1500);


    }
    public int getValor(){
        return this.getValor();

    }

}

class Moneda1000 extends Moneda{

    public Moneda1000(){
        super(1000);


    }
    public int getValor(){
        return this.getValor();

    }

}
class Moneda500 extends Moneda{

    public Moneda500(){
        super(500);


    }
    public int getValor(){
        return this.getValor();

    }

}
class Moneda100 extends Moneda{

    public Moneda100(){
        super(100);

    }
    public int getValor(){
        return this.getValor();

    }

}
class Bebida{
    private int serie;
    public Bebida(int serie){
        this.serie=serie;

    }
    public String beber(){
        return "sabor:";

    }
    public int getSerie(){
        return serie;
    }
}
class Deposito{
    private ArrayList<Bebida> bebidas;
    public Deposito(){
        bebidas = new ArrayList<>();
    }
    public void addBebida(Bebida bebida){
        bebidas.add(bebida);
    }
    public Bebida getBebida(){
        if(bebidas.size()>0){
            return bebidas.remove(0);
        }
        else{
            return null;
        }
    }
}
class DepositoM{
    private ArrayList<Moneda> monedas;

    public DepositoM(){
        monedas= new ArrayList<>();

    }
    public void addMoneda(Moneda m) {
        monedas.add(m);
    }

    public Moneda getMoneda() {
        if (monedas.size() > 0) {
            return monedas.remove(0);
        } else {
            return null;
        }

    }

    public int getTotal() {
        int total = 0;
        for (Moneda m : monedas) {
            total += m.getValor();
        }
        return total;
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
class Sprite extends Bebida {
    public Sprite(int serie){
        super(serie);

    }
    public String beber(){
        return super.beber()+ " sprite";
    }

}