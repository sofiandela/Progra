public class Rectangulo{
    
    private float base;
    private float altura; 
//atributo va con private.

    //creamos el costructor de rectángulo
    public Rectangulo(float base, float altura){
        this.base = base;
        this.altura = altura;
    }


//Estamos validando que lo que recibe sea valido, pero no devuelve nada.
    public void setBase(float base){
        if(base > 0){
            this.base = base;
        }
    } 

    public void setAltura(float altura){
        if(altura > 0){
            this.altura = altura;
        }
    }

    public float getBase(){
        return base;
    }

    public float getAltura(){
        return altura;
    }

    public float calcularPerimetro(){
        float perimetro = 0.0f;
        perimetro = (this.base) * 2 + (this.altura)*2;
        return perimetro;
    }

    public float calcularArea(){
        float area = 0.0f;
        area = this.base * this.altura;
        return area;
    }




}