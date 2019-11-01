public class Temperatura{

    private double valor;
    public static final byte CELSIUS = 0;
    public static final byte FARENHEIT = 1; //el public permite que el encapsulamiento sea nulo y otros objetos lo puedan utilizar Y modificar
    public static final byte KELVIN = 2;

    public static double convertir(double valor, byte unidad){
        double resultado = 0;

        switch (unidad) {
            case Temperatura.CELSIUS:
                resultado = valor;
                break;
            case Temperatura.FARENHEIT:
                resultado = (valor *1.8) + 32;
                break;
            case Temperatura.KELVIN:
                resultado = valor + 273.15;
                break;
        }
        return resultado;
    }

    
}