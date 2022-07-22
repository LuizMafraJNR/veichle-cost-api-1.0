package com.br.fluigclean.fluigcleancalculatespend.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Gasto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal valorGasolina;
    private BigDecimal kmRodadosCidade;
    private BigDecimal kmRodadosRodovia;
    private BigDecimal valorGasto;
    @ManyToOne
    @JsonBackReference
    private Carro carro;

    public Gasto(){}
    public Gasto(BigDecimal valorGasolina, BigDecimal kmRodadosCidade, BigDecimal kmRodadosRodovia){
        this.kmRodadosCidade = kmRodadosCidade;
        this.kmRodadosRodovia = kmRodadosRodovia;
        this.valorGasolina = valorGasolina;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValorGasolina() {
        return valorGasolina;
    }

    public void setValorGasolina(BigDecimal valorGasolina) {
        this.valorGasolina = valorGasolina;
    }

    public BigDecimal getKmRodadosCidade() {
        return kmRodadosCidade;
    }

    public void setKmRodadosCidade(BigDecimal kmRodadosCidade) {
        this.kmRodadosCidade = kmRodadosCidade;
    }

    public BigDecimal getKmRodadosRodovia() {
        return kmRodadosRodovia;
    }

    public void setKmRodadosRodovia(BigDecimal kmRodadosRodovia) {
        this.kmRodadosRodovia = kmRodadosRodovia;
    }

    public BigDecimal getValorGasto() {
        return valorGasto;
    }

    public void setValorGasto(BigDecimal valorGasto) {
        this.valorGasto = valorGasto;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }
}
