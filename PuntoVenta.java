package Ejercicio39_lectoresCodigos;

import java.util.HashMap;
import java.util.Map;

public class PuntoVenta {
    private LectorOptico lector;
    private Map<String, String> catalogo = new HashMap<>();

    public PuntoVenta(LectorOptico lector) {
        this.lector = lector;
        catalogo.put("7791234567890", "Yerba mate 1 kg");
        catalogo.put("7799876543210", "Galletitas de agua");
        catalogo.put("7795550001112", "Alfajor triple");
    }

    public void cambiarLector(LectorOptico nuevo) {
        this.lector = nuevo;
    }

    public void procesarProducto() {
        String codigo = lector.escanearCodigo();
        String clave = codigo.replace("QR:producto/", "");
        String producto = catalogo.getOrDefault(clave, "Producto desconocido");
        System.out.println("Código detectado: " + codigo + " -> " + producto);
    }
}
