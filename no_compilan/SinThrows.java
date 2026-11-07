import java.io.IOException;

public class SinThrows {
    static double cargarTasa(String archivo) {
        if (!archivo.endsWith(".csv")) {
            throw new IOException("Formato no soportado: " + archivo);
        }
        return 0.05;
    }
}
