public class Vehiculo {

    public static void main(String arg[]) {
        // Vehiculo 1 SuperClase heredada de Vehiculo

        System.out.println("-> Vehiculo: 1");

        // Instancia de Vehiculo 1

        Camioneta c1 = new Camioneta();

        // Imprimir la información de vehiculo 1

        c1.imprimirInformacion();


        // Vehiculo 2 SuperClase heredad de Vehiculo

        System.out.println("-> Vehiculo: 2");

        // Instancia de Vehiculo 2

        PickUp c2 = new PickUp();

        // Imprimir informacion del Vehiculo 2

        c2.imprimirInformacion();


        // Vehiculo 3 SuperClase heredada de Vehiculo

        System.out.println("-> Vehiculo: 3");

        // Instancia de Vehiculo 3

        Turismo c3 = new Turismo();

        // Imprimir informacion del vehiculo

        c3.imprimirInformacion();

    }


    /*
    Declaracion de la super clase Vehiculo, Aqui defino
    los atributos de un  en general ehiculo y heredaran las subclases
    de otros vehiculo.
    */

    public static abstract class Vehiculos {

        // Nombre del modelo de vehiculo.

        private String modelo;

        // Año del vehiculo

        private String anio;

        // Marca del vehiculo

        private String marca;



        public Vehiculos() {
         
            // Constructor Vacio
        }

        public Vehiculos(String modelo, String anio, String marca)
                
                          {
            this.modelo = modelo;

            this.anio = anio;

            this.marca = marca;

        }


        /*
        Declaracion de los getters y setters
        de cada variable de los vehiculos.
        */

        public String getModelo() {
            return this.modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }


        public String getAnio() {
            return this.anio;
        }

        public void setCodigo(String anio) {
            this.anio = anio;
        }


        public String getMarca() {
            return this.marca;
        }

        public void setMarca(String marca) {
            this.marca = marca ;
        }


        //Imprimir informacion de los vehiculos

        public void imprimirInformacion() {
            System.out.println("");

            System.out.println("Nombre: " + modelo);

            System.out.println("Codigo: " + anio);

            System.out.println("Carrera: " + marca);


            System.out.println("Informacion: " + getVehiculoInformacion());

            System.out.println("");
        }


        //Metodo abstracto que obtiene la informacion
        //general de los vehiculos

        abstract String getVehiculoInformacion();

    }

    
    //Declaracion del 1er vehiculo donde heredara los atributos

    public static class Camioneta extends Vehiculo {

        public Camioneta() {

            setModelo("Sportage");

            setAnio("2016");

            setMarca("KIA");

        }


        public String getVehiculoInformacion() {
            return "Informacion del Vehiculo: Camioneta KIA";
        }


    }
    
    //Vehiculo 2
    
    public static class PickUp extends Vehiculo {

        public PickUp() {


            super();
        }


        public String getVehiculoInformacion() {
            return "Informacion del Vehiculo: PickUp FORD";
        }

    }

       public static class PickUp extends Vehiculo {

        public PickUp() {


            setModelo("Ford F-150");

            setAnio("2013");

            setMarca("FORD");

        }


        public String getVehiculoInformacion() {
            return "Informacion del vehiculo: PickUp Ford";
        }

    }

    public static class Turismo extends Vehiculo {

        public Turismo() {


            setModelo("Yaris");

            setAnio("2008");

            setMarca("TOYOTA");

        }


        public String getVehiculoInformacion() {
            return "Informacion del vehiculo: Turismo TOYOTA";
        }

    }

}
