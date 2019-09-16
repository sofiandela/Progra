public class ManejoAscensor{
    public static void main(String args[]){

        //tipo ascensor
        Ascensor consorcioCallePeron = new Ascensor (4, 150.0);
        Persona nina = new Persona( "Nina", "Mujer", 33999776, 60, 1.70);
        Persona juan = new Persona( "Juan", "Hombre", 33999776, 88, 1.77);
        Persona enrique = new Persona( "Enrique", "Hombre", 33999776, 90, 1.80);
        System.out.println(consorcioCallePeron.getPisoActual());
        //b) Se encuentra en el piso 0;

        consorcioCallePeron.abrirPuerta();
        consorcioCallePeron.cerrarPuerta();
        consorcioCallePeron.subir();
        consorcioCallePeron.subir();
        consorcioCallePeron.subir();
        System.out.println(consorcioCallePeron.getPisoActual());

        consorcioCallePeron.abrirPuerta();
        consorcioCallePeron.ingresar(nina);
        consorcioCallePeron.ingresar(enrique);
        consorcioCallePeron.ingresar(juan);
        consorcioCallePeron.salir(enrique);
        consorcioCallePeron.cerrarPuerta();
        consorcioCallePeron.subir();
        consorcioCallePeron.subir();
        System.out.println(consorcioCallePeron.getPisoActual());
        


    }
}