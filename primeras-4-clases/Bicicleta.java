public class Bicicleta{

        //definimos los atributos
        private char color;
         // r = rojo - a = amarillo - n = negro
        private byte cantidadDePiniones;
        private byte rodado;
        private char tipo; // m = mountain bike / r = ruta
        private byte cadencia;
        private float velocidad;
        private byte pinionActual;


        //definimos el comportamiento (metodo)
        //toda operación que no sea una definicion, tiene que estar dentro de un método
        //los métodos pueden devolver un valor

        public Bicicleta(){
            color = 'n';
            cantidadDePiniones = (byte)5;
            rodado = (byte)28;
            tipo = 'm';
            cadencia = (byte)0;
            velocidad = (float)0.0;
            pinionActual = (byte)1;
        }


        public Bicicleta (char color, char tipo){
            this.pinionActual = (byte)1;
            this.color = color;
            this.tipo = tipo;
        }

        public float calcularVelocidad(){
            velocidad = cadencia / pinionActual;
        }
        public float verVelocidad(){
            calcularVelocidad();
            return velocidad;
        }

        public void subirPinion(){
            pinionActual++;
        }
        public void bajarPinion(){
            pinionActual--;
        }

        public void establecerCadencia(byte cadencia){
            this.cadencia = cadencia;
        }
        public byte verPinion(){
            color = 'r';
            return pinionActual;
        }
        public byte verColor(){
            return color;
        }
        public byte verTipo(){
            return tipo;
        }



        


        
        

}