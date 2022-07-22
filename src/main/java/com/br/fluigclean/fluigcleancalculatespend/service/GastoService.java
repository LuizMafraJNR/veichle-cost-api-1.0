package com.br.fluigclean.fluigcleancalculatespend.service;

import com.br.fluigclean.fluigcleancalculatespend.model.Carro;
import com.br.fluigclean.fluigcleancalculatespend.model.Gasto;
import com.br.fluigclean.fluigcleancalculatespend.repository.CarroRepository;
import com.br.fluigclean.fluigcleancalculatespend.repository.GastoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.List;
import java.util.Optional;

import static java.math.MathContext.*;

@Service
public class GastoService {

    @Autowired
    private CarroRepository carroRepository;
    @Autowired
    private GastoRepository gastoRepository;
    public Gasto adicionarGasto(Carro carro, BigDecimal valorGasolina, BigDecimal kmRodadosCidade, BigDecimal kmRodadosRodovia) {
        Gasto gasto = new Gasto();
        carro.getListaGastos().add(gasto);
        gasto.setValorGasolina(valorGasolina);
        gasto.setKmRodadosCidade(kmRodadosCidade);
        gasto.setKmRodadosRodovia(kmRodadosRodovia);
        gasto.setCarro(carro);
        gasto.setValorGasto(gasto.getValorGasolina().multiply(gasto.getKmRodadosCidade().divide(carro.getConsumoMedioCidade(), 2).add(gasto.getKmRodadosRodovia().divide(carro.getConsumoMedioRodovia(), 2))));
        return gastoRepository.save(gasto);
    }
    /**
    public List<Gasto> buscarAllGastoDoCarro(Carro carro, Gasto gasto) {
        Carro carro = carroRepository.findById();
        return gastoRepository.findById(gasto.getCarro().getId());
    }*/
}
