public class PruebaAlumno{
    public static void main(String args[]){
        Alumno joaquin = new Alumno (10, 7);
        

        char situacion = ' ';

        situacion = joaquin.situacionAlumno();

        if (situacion == 'c' ){
            System.out.println("Curso");
        }
        if (situacion == 'p' ){
            System.out.println("Promociona");
        }
        if (situacion == 'r' ){
            System.out.println("recurso");
        }
        


    } 
}