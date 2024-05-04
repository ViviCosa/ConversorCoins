package com.aluracursos.conversormonedas;

import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ExchangeRateApiClient {

private final String apiKey = "35941137dcb297a138be9c26";
    private final String baseUrl = "https://v6.exchangerate-api.com/v6/";

    public double convertCurrency(double amount, String baseCurrency, String targetCurrency) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(baseUrl + apiKey + "/pair/" + baseCurrency + "/" + targetCurrency + "/" + amount))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        if (response.statusCode() != 200) {
            throw new IOException("Error al obtener las tasas de cambio: " + response.statusCode());
        }
        Gson gson = new Gson();
        ExchangeRateResponse exchangeRateResponse = gson.fromJson(response.body(), ExchangeRateResponse.class);
        return exchangeRateResponse.getCantidadDeConversion();
    }

}
