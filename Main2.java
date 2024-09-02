package lab3;
public class Main2{
    public static void main(String[] args) {

            SumaResta p= new SumaResta(3,4);
            System.out.println(p.suma());
            System.out.println(p.resta());

    }
}
class SumaResta {
    private float uno;
    private float dos;
    public SumaResta(float a,float b){
        this.uno=a;
        this.dos=b;

    }
    public float suma(){
        return (float) uno+dos;


    }
    public float resta(){
        return (float) uno-dos;

    }
    public float getUno(){
        return uno;
    }
    public float getDos(){
        return dos;

    }


}
class CuatroOperaciones{
    private SumaResta sumaresta;
    public CuatroOperaciones(float uno,float dos){
        this.sumaresta= new SumaResta(uno,dos);

    }
    public float multiplica(){
        return sumaresta.getUno()*sumaresta.getDos();

    }
    public float divide(){
        return sumaresta.getUno()/sumaresta.getDos();

    }
    public float suma(){
        return sumaresta.suma();
    }
    public float resta(){
        return sumaresta.resta();
    }

}
