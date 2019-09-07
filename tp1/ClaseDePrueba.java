public class ClaseDePrueba{
    public static void main (String args[]){

        int capacidadHdd = 1; //expresado en tera
        double capacidadDvd = 8.5; //espresado en GIGA
        double capacidadBlueRay = 25.0; //espresado en GIGA

        int cantidadDeDvdsParaBackupearHdd;
        int cantidadDeBlueRaysParaBackupearHdd;

        int conversionDeUnidad = 1024;

        cantidadDeDvdsParaBackupearHdd = ((capacidadHdd*conversionDeUnidad)/ capacidadDvd );
        cantidadDeBlueRaysParaBackupearHdd = ((capacidadHdd*conversionDeUnidad)/ capacidadBlueRay );

        System.out.println("Cantidad de DVD que se necesitan para backupear hdd es de: " + cantidadDeDvdsParaBackupearHdd);
        System.out.println("Cantidad de BLUERAYS que se necesitan para backupear hdd es de: " + cantidadDeBlueRaysParaBackupearHdd);
    }
}


//Al compilarlo salta error cuando se opera con división "/ " 
//Intenté corregirlo cambiando por "%" pero el error sigue siendo el mismo.
//10) no se :( 