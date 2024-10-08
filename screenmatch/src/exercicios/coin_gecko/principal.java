package exercicios.coin_gecko;

import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe o nome da cryptomoeda para consulta o valor: ");
        String crypto = leitura.nextLine();

        String chave = "CG-NzJdNZjWv91tumwp14ar6xzL";
        String endereco = "https://api.coingecko.com/api/v3/simple/price?ids=" + crypto + "&vs_currencies=usd";
        
        
        // Requisição
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).GET().build();

        // Response
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Organizando a saída do JSON para ficar formatado
        JSONObject jsonResponse = new JSONObject(response.body());

        double valor = jsonResponse.getJSONObject(crypto).getDouble("usd");

        System.out.println("Crypto: " + crypto + " || Valor: US$ " + valor);

    }

}
