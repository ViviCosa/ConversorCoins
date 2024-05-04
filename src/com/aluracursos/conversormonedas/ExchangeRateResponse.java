package com.aluracursos.conversormonedas;

import com.google.gson.annotations.SerializedName;

public class ExchangeRateResponse {
    @SerializedName("conversion_result")
    private double cantidadDeConversion;
    public double getCantidadDeConversion() {
        return cantidadDeConversion;
    }


}
