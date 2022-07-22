package com.br.fluigclean.fluigcleancalculatespend.controller;

import com.br.fluigclean.fluigcleancalculatespend.model.Carro;
import com.br.fluigclean.fluigcleancalculatespend.model.Gasto;
import com.br.fluigclean.fluigcleancalculatespend.service.CarroService;
import com.br.fluigclean.fluigcleancalculatespend.service.GastoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/carros")
public class GastoController {

    @Autowired
    private CarroService carroService;
    @Autowired
    private GastoService gastoService;

    @PostMapping("/{id}/gastos/{valorGasolina}/{kmRodadosCidade}/{kmRodadosRodovia}")
    public Gasto adicionarGasto(@PathVariable Long id, @PathVariable BigDecimal valorGasolina, @PathVariable BigDecimal kmRodadosCidade, @PathVariable BigDecimal kmRodadosRodovia){
        Carro carro = carroService.acharporid(id);
        return gastoService.adicionarGasto(carro, valorGasolina, kmRodadosCidade, kmRodadosRodovia);
    }
}
