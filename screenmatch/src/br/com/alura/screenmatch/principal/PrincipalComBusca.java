package br.com.alura.screenmatch.principal;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o filme para buscar: ");
        var busca = leitura.nextLine(); // Lendo o que o usuário digitou. VAR entende que é uma STRING

        String endereco = "https://www.omdbapi.com/?t=" + busca + "&apikey=4190ee63";

        // Classe para fazer REQUISICAO, passando o endereço e a apikey.
        // Essas linhas de código foi copiado da documentação do java. (java doc 21)
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        // Pegando a resposta da requisicao de cima e imprimindo.
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.body());
    }
}
