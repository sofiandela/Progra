public class Televisor{
    private int volumen;
    private int canal;

    
//7)
    //a que se refiere con encapsulamiento?

    //variables
    public Televisor(){
        this.volumen = 10;
        this.canal = 2;
    }
//atributos
    public Televisor(int volumen, int canal){
        this.volumen = volumen;
        this.canal = canal;
    }

    public int getVolumen(){
        return this.volumen;
    }

    public void ajustarVolumen(String modo){
        if(modo.equals("subir")){
            volumen++;
        }else{
            volumen--;
        }
    }
    public void cambiarCanal(String modo){
        if(modo.equals("subir")){
            canal++;
        }else{
            canal--;
        }
    }

    public int getCanal(){
        return this.canal;
    }
}