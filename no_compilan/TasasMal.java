import java.io.IOException;

public class TasasMal {
    static double cargarTasa(String archivo) throws IOException {
        if (!archivo.endsWith(".csv")) {
            throw new IOException("Formato no soportado: " + archivo);
        }
        return 0.05;
    }

    public static void main(String[] args) {
        System.out.println(cargarTasa("tasas.pdf"));
    }
}
