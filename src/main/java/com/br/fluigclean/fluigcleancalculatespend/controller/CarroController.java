package com.br.fluigclean.fluigcleancalculatespend.controller;

import com.br.fluigclean.fluigcleancalculatespend.model.Carro;
import com.br.fluigclean.fluigcleancalculatespend.model.DTO.CarroDTO;
import com.br.fluigclean.fluigcleancalculatespend.model.Gasto;
import com.br.fluigclean.fluigcleancalculatespend.service.CarroService;
import com.br.fluigclean.fluigcleancalculatespend.service.GastoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.beans.Transient;
import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {

    // REST FULL

    @Autowired
    private CarroService carroService;
    @Autowired
    private GastoService gastoService;

    // Salvar novo carro
    @PostMapping
    @Transactional
    public Carro salvar(@RequestBody() CarroDTO dto){
        return carroService.salvar(dto);
    }
    // Mudar dados pelo ID
    @PutMapping("/{id}")
    public Carro modificar(@RequestBody CarroDTO carroDTO, @PathVariable Long id){
        Carro carro = carroService.acharporid(id);
        return carroService.modificar(carro, carroDTO);
    }
    // Listar veiculo pelo ID
    @GetMapping("/{id}")
    public Carro listarPorID(@PathVariable Long id, Gasto gasto){
        return carroService.acharporid(id);
    }
    // Listar todos os veiculos
    // Deletar pelo ID
    @GetMapping
    public List<Carro> listar(){
        return carroService.listar();
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){
        carroService.deletar(id);
    }
}
