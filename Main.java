package Ejercicio39_lectoresCodigos;

public class Main {
    public static void main(String[] args) {
        PuntoVenta caja = new PuntoVenta(new EscanerLaser());
        System.out.println("Escáner láser:");
        caja.procesarProducto();
        caja.procesarProducto();

        caja.cambiarLector(new CamaraQR());
        System.out.println("Cámara QR:");
        caja.procesarProducto();
    }
}
