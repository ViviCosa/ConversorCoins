package com.aluracursos.conversormonedas;

import java.io.IOException;

public class PrincipalConversiones {
    public static void main(String[] args) throws IOException, InterruptedException {
        String baseCurrency = "USD";
        String targetCurrency = "ARS";
        ExchangeRateApiClient cliente = new ExchangeRateApiClient();
        double amount = 32;

        try {
            double cantidadConvertida = cliente.convertCurrency(amount, baseCurrency, targetCurrency);
            System.out.println(amount + " " + baseCurrency + " equivale a " + cantidadConvertida + " " + targetCurrency);
        } catch (IOException | InterruptedException e) {
            System.err.println("Error: " + e.getMessage());
        }


        }

}
