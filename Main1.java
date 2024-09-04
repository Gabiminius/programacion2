public class Main1 {
    public static void main(String[] args) {
        CuatroOperaciones a= new CuatroOperaciones(3,5);
        
    }


}
class SumaResta{
    protected float uno;
    protected float dos;
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

}
class CuatroOperaciones extends SumaResta{
    CuatroOperaciones(float uno,float dos){
        super(uno,dos);

    }
    public float multiplica(){
        return uno*dos;
    }
    public float divide(){
        return uno/dos;
    }
}
