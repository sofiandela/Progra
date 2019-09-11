public class EjemploDeVida{
    public static void main(String args[]){

        Persona sofia;

        sofia = new Persona ("Sofia", "Mujer", 38432153, 2.8, 0.50);

        System.out.print(sofia.toString()); //aqui se observa que sofia es un nuevo objeto de tipo persona.

        //d1)Alimentar a Sofia 1.0 es un valor, se le dice literal = son variables sin nombre.
        sofia.alimentar(1.0);
        //d2) crecer
        sofia.crecer(0.5);
        sofia.cumplirAnos();

        System.out.print(sofia.toString());//lo que ocurre quí es que el objeto Sofia adquiere nuevos valores al implementar los métodos
        //alimentar(), crecer() y cumplirAnos()

    }
}

