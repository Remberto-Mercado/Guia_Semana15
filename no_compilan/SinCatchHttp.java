import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class SinCatchHttp {
    public static void main(String[] args) {
        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest peticion = HttpRequest.newBuilder()
            .uri(URI.create("https://jsonplaceholder.typicode.com/todos/1"))
            .GET()
            .build();
        HttpResponse<String> respuesta = cliente.send(peticion, HttpResponse.BodyHandlers.ofString());
        System.out.println(respuesta.body());
    }
}
