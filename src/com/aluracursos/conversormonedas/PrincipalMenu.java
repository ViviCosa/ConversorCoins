package com.aluracursos.conversormonedas;

import java.io.IOException;
import java.util.Scanner;

public class PrincipalMenu {
    public static void main(String[] args) {
        int opcion = 0;

        System.out.println("***********************************");

        String menu = """
                                
                *** Escriba el número de la opción deseada ***
                1 - Dólar ----> Peso argentino
                2 - Peso argentino ----> Dólar
                3 - Dólar ----> Real brasileño
                4 - Real brasileño ----> Dólar
                9 - Salir
                                
                """;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9) {
            System.out.println(menu);
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Digite la cantidad que quiere convertir");
                    Scanner lectura = new Scanner(System.in);
                    ExchangeRateApiClient dolarAPesoAr = new ExchangeRateApiClient();
                    double amount = lectura.nextDouble();
                    String baseCurrency = "USD";
                    String targetCurrency = "ARS";
                    try {
                        double cantidadConvertida = dolarAPesoAr.convertCurrency(amount, baseCurrency, targetCurrency);
                        System.out.println(amount + " " + baseCurrency + " equivale a " + cantidadConvertida + " " + targetCurrency);
                    } catch (IOException | InterruptedException e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                    break;
            }
            switch (opcion) {
                case 2:
                    System.out.println("Digite la cantidad que quiere convertir");
                    Scanner lectura = new Scanner(System.in);
                    ExchangeRateApiClient pesoArDolar = new ExchangeRateApiClient();
                    double amount = lectura.nextDouble();
                    String baseCurrency = "ARS";
                    String targetCurrency = "USD";
                    try {
                        double cantidadConvertida = pesoArDolar.convertCurrency(amount, baseCurrency, targetCurrency);
                        System.out.println(amount + " " + baseCurrency + " equivale a " + cantidadConvertida + " " + targetCurrency);
                    } catch (IOException | InterruptedException e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                    break;
            }
            switch (opcion) {
                case 3:
                    System.out.println("Digite la cantidad que quiere convertir");
                    Scanner lectura = new Scanner(System.in);
                    ExchangeRateApiClient dolarAReal = new ExchangeRateApiClient();
                    double amount = lectura.nextDouble();
                    String baseCurrency = "USD";
                    String targetCurrency = "BRL";
                    try {
                        double cantidadConvertida = dolarAReal.convertCurrency(amount, baseCurrency, targetCurrency);
                        System.out.println(amount + " " + baseCurrency + " equivale a " + cantidadConvertida + " " + targetCurrency);
                    } catch (IOException | InterruptedException e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                    break;
            }
            switch (opcion) {
                case 4:
                    System.out.println("Digite la cantidad que quiere convertir");
                    Scanner lectura = new Scanner(System.in);
                    ExchangeRateApiClient realADolar = new ExchangeRateApiClient();
                    double amount = lectura.nextDouble();
                    String baseCurrency = "BRL";
                    String targetCurrency = "USD";
                    try {
                        double cantidadConvertida = realADolar.convertCurrency(amount, baseCurrency, targetCurrency);
                        System.out.println(amount + " " + baseCurrency + " equivale a " + cantidadConvertida + " " + targetCurrency);
                    } catch (IOException | InterruptedException e) {
                        System.err.println("Error: " + e.getMessage());
                    }
                    break;
            }
            switch (opcion) {
                case 9:
                    System.out.println("Gracias");
                    break;
            }
        }
    }
}
