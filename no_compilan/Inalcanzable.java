public class Inalcanzable {
    static void validar(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("Edad negativa");
            System.out.println("Edad validada");
        }
    }
}
