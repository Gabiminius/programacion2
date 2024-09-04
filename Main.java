public class Main {
    public static void main(String[] args) {
        CreaYPruebaBebida.pruebaVeSerieBebe(1,0001);

    }
 
}
class CreaYPruebaBebida {
    public static void pruebaVeSerieBebe(int que, int serie){
        Bebida b=null;
        switch (que){
            case 1:  b = new Sprite(serie); break;
            case 2:  b = new Fanta(serie); break;
            case 3:  b = new Kem(serie); break;
            case 4:  b = new CocaCola(serie); break;
            default: return;
        }
        System.out.println(b.getSerie()+": "+b.beber());
    }
}
abstract class Bebida{
    private int serie;
    public Bebida(int serie){
        this.serie=serie;

    }
    public int getSerie(){
        return serie;
    }
    public abstract String beber();
}
class Sprite extends Bebida {
    Sprite(int serie){
        super(serie);

    }
    public String beber(){
        return "sprite";
    }

}
class Fanta extends Bebida {
    Fanta(int serie){
        super(serie);

    }
    public String beber(){
        return "fanta";
    }

}
class Kem extends Bebida {
    Kem(int serie){
        super(serie);

    }
    public String beber(){
        return "kem";
    }

}
class CocaCola extends Bebida {
    CocaCola(int serie){
        super(serie);

    }
    public String beber(){
        return "cocacola";
    }

}

