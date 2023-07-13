package teste;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class testtee {
	
	
	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite um filme para busca. ");
		var busca = leitor.next();
		String endereco = "http://www.omdbapi.com/?t=" + busca +"&apikey=ef30a37a";
		
		 HttpClient client = HttpClient.newHttpClient();
		   HttpRequest request = HttpRequest.newBuilder()
		         .uri(URI.create(endereco))
		         .build();
		   client.sendAsync(request, BodyHandlers.ofString())
		         .thenApply(HttpResponse::body)
		         .thenAccept(System.out::println)
		         .join(); 
		   
		   HttpResponse<String> response = client
				     .send(request, BodyHandlers.ofString()); 
		   
	}
}
