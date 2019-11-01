import jdk.vm.ci.code.CodeUtil.NumberedRefMapFormatter;

public class Calculadora{

    private int operador1;
    private int operador2;
    private double numerador;
    private double divisor;


    public Calculadora(int operador1, int operador2){
        this.operador1 = operador1;
        this.operador2 = operador2;
    }

    public Coche(double operador1, double operador2){
        this.operador1 = operador1;
        this.operador2 = operador2;
    }

    public double sumar(){
        double valor1 = 0.0;
        double valor2 = 0.0;
        return valor1 + valor2;
    }
    
    public double sumar(int operador1, int operador2){
         operador1 = 0;
         operador2 = 0;

        return operador1 + operador2;

    }
    public double restar(){
        double valor1 = 0.0;
        double valor2 = 0.0;
        return valor1 - valor2;
    }
    
    public double restar(int operador1, int operador2){
         operador1 = 0;
         operador2 = 0;

        return operador1 - operador2;

    }
    public double multiplicar(){
        double valor1 = 0.0;
        double valor2 = 0.0;
        return valor1 * valor2;
    }
    
    public double multiplicar(int operador1, int operador2){
         operador1 = 0;
         operador2 = 0;

        return operador1 * operador2;

    }
    public double dividir(){
        double valor1 = 0.0;
        double valor2 = 0.0;

        if(valor)
        return valor1 * valor2;
    }
    
    public double dividir(int numerador, int divisor){
         numerador = 0;
         divisor = 0;

         if(divisor = 0){
             return "No se puede dividir por cero";
         }

        return operador1 / operador2;
    }

    public boolean esPositivo(){
        if(operador1 > 0 && operador2 > 0){
            return true;
        }
        return false;
    }
}