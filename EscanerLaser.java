package Ejercicio39_lectoresCodigos;

public class EscanerLaser implements LectorOptico {
    private String[] articulos = {"7791234567890", "7799876543210"};
    private int indice = 0;

    @Override
    public String escanearCodigo() {
        String codigo = articulos[indice % articulos.length];
        indice++;
        return codigo;
    }
}
