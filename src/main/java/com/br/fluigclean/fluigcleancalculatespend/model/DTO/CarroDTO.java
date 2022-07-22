package com.br.fluigclean.fluigcleancalculatespend.model.DTO;

import com.br.fluigclean.fluigcleancalculatespend.model.Carro;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.time.LocalDate;

public class CarroDTO {
    private String nome;
    private String modelo;
    private String marca;
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="dd/MM/yyyy")
    private LocalDate dataFabricacao;
    private BigDecimal consumoMedioCidade;
    private BigDecimal consumoMedioRodovia;

    public  CarroDTO(){}

    public CarroDTO(Carro carro) {
        this.nome = carro.getNome();
        this.modelo = carro.getModelo();
        this.marca = carro.getMarca();
        this.dataFabricacao = carro.getDataFabricacao();
        this.consumoMedioCidade = carro.getConsumoMedioCidade();
        this.consumoMedioRodovia = carro.getConsumoMedioRodovia();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public BigDecimal getConsumoMedioCidade() {
        return consumoMedioCidade;
    }

    public void setConsumoMedioCidade(BigDecimal consumoMedioCidade) {
        this.consumoMedioCidade = consumoMedioCidade;
    }

    public BigDecimal getConsumoMedioRodovia() {
        return consumoMedioRodovia;
    }

    public void setConsumoMedioRodovia(BigDecimal consumoMedioRodovia) {
        this.consumoMedioRodovia = consumoMedioRodovia;
    }
}
