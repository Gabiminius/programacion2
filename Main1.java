public class Main1 {
    public static void main(String[] args) {
        CuatroOperaciones a= new CuatroOperaciones(3,5);

    }


}
class SumaResta{
    private float uno;
    private float dos;
    public SumaResta(float uno,float dos){
        this.uno=uno;
        this.dos=dos;

    }
    public float suma(){
        return uno +dos;

    }
    public float resta(){
        return uno-dos;

    }
    public float getUno(){
        return uno;
    }
    public float getDos(){
        return dos;
    }

}
class CuatroOperaciones extends SumaResta{
    CuatroOperaciones(float uno,float dos){
        super(uno,dos);

    }
    public float multiplica(){
        return getUno()*getDos();
    }
    public float divide(){
        return getUno()/getDos();
    }
}
