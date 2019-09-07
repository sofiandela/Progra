public class Ciclista {

    public static void main (String args[]){
        //el ciclista compra su bicicleta

        Bicicleta rutaRoja; // es una variable rutaRoja, de tipo bicicleta.


        // creamos el objeto  - instanciamos la clase (ejemplificamos - for instance - crea el ejemplo de bicicleta) 
        rutaRoja = new bicicleta();


        byte cadenciaQueDeseaRicardo = 30; //30 es un valor literal, lo guarda en memoria sin ponerle un nombre.

        //Ricardo se sube a su bici

        System.out.print("Velocidad: ");
        System.out.println(rutaRoja.calcularVelocidad);

       


        rutaRoja.subirPinion();
        rutaRoja.subirPinion();

        rutaRoja.establecerCadencia(30);

        System.out.print("Velocidad: ");
        System.out.println(rutaRoja.calcularVelocidad);



        


        public rutaRoja()




    }
}