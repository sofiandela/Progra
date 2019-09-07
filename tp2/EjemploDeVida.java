public class EjemploDeVida{
    public static void main(String args[]){

        Persona sofia;

        sofia = new Persona ("Sofia", "Mujer", "39267083", 2.8, 0.50);

        System.out.print(sofia.toString());

        //d1)Alimentar a Sofia 1.0 es un valor, se le dice literal = son variables sin nombre.
        sofia.alimentar(1.0);
        //d2) crecer
        sofia.crecer(0.5);

    }
}

