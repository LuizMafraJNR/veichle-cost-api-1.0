package com.br.fluigclean.fluigcleancalculatespend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Carro {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String modelo;
    private String marca;
    // String to JSON
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern="dd/MM/yyyy")
    private LocalDate dataFabricacao;
    private BigDecimal consumoMedioCidade;
    private BigDecimal consumoMedioRodovia;
    @OneToMany
    @JsonManagedReference
    private List<Gasto> listaGastos;

    public Carro() {
    }

    public Carro(String nome, String modelo, String marca, LocalDate dataFabricacao, BigDecimal consumoMedioCidade, BigDecimal consumoMedioRodovia, List<Gasto> listaGastos) {
        this.nome = nome;
        this.modelo = modelo;
        this.marca = marca;
        this.dataFabricacao = dataFabricacao;
        this.consumoMedioCidade = consumoMedioCidade;
        this.consumoMedioRodovia = consumoMedioRodovia;
    }

    public List<Gasto> getListaGastos() {
        return listaGastos;
    }

    public void setListaGastos(List<Gasto> listaGastos) {
        this.listaGastos = listaGastos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
