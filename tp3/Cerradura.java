public class Cerradura{

    private int claveDeApertura;
    private int cantidadDeFallosConsecutivosQueLaBloquean;
    private boolean bloqueada;
    private boolean estado;
    

    public Cerradura(int claveDeApertura, int cantidadDeFallosConsecutivosQueLaBloquean){
        this.claveDeApertura = claveDeApertura;
        this.cantidadDeFallosConsecutivosQueLaBloquean = cantidadDeFallosConsecutivosQueLaBloquean;
    }

    public boolean abrir(int clave){
        return true;
    }
    public void cerrar(int clave){
        this.clave = clave;
    }
    public boolean estaAbierta(){
        return true;
    }

}