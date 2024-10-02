package exercicios.requisicoes.api;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe o nome do livro: ");
        String tituloLivro = leitura.nextLine();
        String tituloLivroCodificado = URLEncoder.encode(tituloLivro, StandardCharsets.UTF_8);

        String chave = "AIzaSyDLN45b-FhvSlOh8v9uR8Lktp001wncsV4";
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + tituloLivroCodificado + "&key=" + chave;


        // Fazendo a requisição
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).GET().build();


        // Enviar a requisição e obter a resposta
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        // Processando o json da resposta
        JSONObject jsonResponse = new JSONObject(response.body());
        JSONArray items = jsonResponse.getJSONArray("items");

        // Verificando se existem items dentro do Array
        if (items.length() > 0){
            JSONObject primeiroItem = items.getJSONObject(0);
            JSONObject volumeInfo = primeiroItem.getJSONObject("volumeInfo");

            // Exibindo informações do livro
            System.out.println("Título: " + volumeInfo.getString("title"));
            System.out.println("Autores: " + volumeInfo.getJSONArray("authors").join(", "));
            System.out.println("Editora: " + volumeInfo.getString("publisher"));
            System.out.println("Data de Publicação: " + volumeInfo.getString("publishedDate"));
            System.out.println("Descrição: " + volumeInfo.getString("description"));
            System.out.println("Link para o livro: " + volumeInfo.getString("canonicalVolumeLink"));

        }else {
            System.out.println("Nenhum livro encontrado!!");
        }


    }

}
