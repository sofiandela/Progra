// Ingresar dos notas de un alumno y mostrar los mensajes que corresponda:
// Se tiene que crear la clase alumno que va a contener como atributos las dos notas 
// y como método la situación del alumno (sutuacionAlumno) que puede ser: 
// 'p' = Promociona la materia;
// 'c ' = cursa la materia;
// 'r' = reprueba la materia;
// a)Promociono: si ambas notas son 7 o superior ;
// b)Cursó: si ambas notas son 4 o más, con lo cual no reune los requisitos para la promoción
// c) reprobó: alguna de las notas obtenidas no llega a ser cuatro (4);


public class Alumno{

    private float notaPrimerParcial;
    private float notaSegundoParcial;


//Armamos el constructor
    public Alumno (float notaPrimerParcial, float notaSegundoParcial){
        this.notaPrimerParcial = notaPrimerParcial;
        this.notaSegundoParcial = notaSegundoParcial;
    }

    public void setNotaPrimerParcial(float notaPrimerParcial){
        if(notaPrimerParcial >= 0 && notaPrimerParcial <= 10 ){
             this.notaPrimerParcial = notaPrimerParcial;
        }
    }
    public void setNotaSegundoParcial(float notaSegundoParcial){
        if(notaSegundoParcial >= 0 && notaSegundoParcial <= 10 ){
            this.notaSegundoParcial = notaSegundoParcial;
        }
    }
    
    public float getNotaPrimerParcial(){
        return notaPrimerParcial;
    }
    public float getNotaSegundoParcial(){
        return notaSegundoParcial;
    }


    public char situacionAlumno(){

       if(notaPrimerParcial >= 7 && notaSegundoParcial >= 7 ){
            return 'p';
        }else{
           if(notaPrimerParcial >= 4 && notaSegundoParcial >= 4){
               return 'c';
           }else{
               return 'r';
           }
       }
    }



}
