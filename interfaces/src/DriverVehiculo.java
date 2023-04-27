public class DriverVehiculo {
    public static void main(String[] args) {
        Camion camion = new Camion("pemex cara", 5);
        System.out.println(camion);
        System.out.println(camion.encender());
        camion.avanzar();
        camion.frenar();
        System.out.println(camion.apagar());
        System.out.println("----motocicleta----");
        Motocicleta motomami = new Motocicleta(150,"motomami");
        System.out.println(motomami);
        motomami.encender();
        motomami.avanzar();
        motomami.hacerCaballito();
        motomami.frenar();
        motomami.apagar();
    }
}