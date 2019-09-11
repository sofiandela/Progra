public class PruebaRectangulo{
    public static void main (String args[]){

        Rectangulo rectangulito = new Rectangulo(20.0f, 10.0f);
        Rectangulo rectangulote = new Rectangulo(40.0f, 70.0f);

        System.out.println(" El perimetro es de " + rectangulito.calcularPerimetro());
        System.out.println("El area es de " + rectangulito.calcularArea());

        float area1 =0.0f , area2 = 0.0f;
        area1 = rectangulito.calcularArea();
        area2 = rectangulote.calcularArea();


       // public void quienEsMasGrande(rectangulito, rectangulote){
            
            if(area1 == area2){
                System.out.println("Son iguales");
            }
            else{
                if(area1>area2){
                System.out.println("El primero es mas grande");
            }else{
                System.out.println("El segundo es mas grande");
            }
        }
     }

}