public class CajeroAutomatico{
    public static void main(String args[]){

        Cuenta miCuenta = new Cuenta("Sofia");;

        System.out.println(miCuenta.toString());
        miCuenta.depositar(100.0);
        System.out.println(miCuenta.toString());
        miCuenta.retirar(50.0);
        System.out.println(miCuenta.toString());


        //para validar
        if (monto< 0){
            System.out.println("Error, usted no puede ingresar un monto negativo");
        }else{
            miCuenta.depositar(monto);
            System.out.println(miCuenta);
            miCuenta.retirar(monto);
            System.out.println(miCuenta);
        }





    }
}