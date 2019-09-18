public class Coche{

    private int CERO_KM;
    private int ANO_ACTUAL;
    private int cantidadCoches; //static
    private String marca;
    private double modelo;
    private int kilometros;
    private int ano;
    private double precio;

    //creo el constructor
    public Coche(String marca, double modelo, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;

    }

    public Coche(String marca, double modelo, int kilometros, int ano, double precio){
        this.marca = marca;
        this.modelo = modelo;
        this.kilometros = kilometros;
        this.ano = ano;
        this.precio = precio;
    }

    // public int getCantidadDeCoches(){
    //     return cantidadDeCoches;
    // }
    //No sé muy bien como encarar getCantidadDeCoches

    public void setKilometros(int kilometros){
        this.kilometros = kilometros;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }
    public double getPrecio(){
        return precio;
    }

    public int calcularAntiguedad(){
        int antiguedad = 0;
        antiguedad = ANO_ACTUAL - this.ano;
        return antiguedad; 
    }

    public int getKilometros(){
        int kilometrosRecorridos = 0;
        kilometrosRecorridos = CERO_KM + kilometros;
        return kilometrosRecorridos;

    }

}