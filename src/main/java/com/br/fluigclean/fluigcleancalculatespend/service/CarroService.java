package com.br.fluigclean.fluigcleancalculatespend.service;

import com.br.fluigclean.fluigcleancalculatespend.model.Carro;
import com.br.fluigclean.fluigcleancalculatespend.model.DTO.CarroDTO;
import com.br.fluigclean.fluigcleancalculatespend.model.Gasto;
import com.br.fluigclean.fluigcleancalculatespend.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@Service
public class CarroService {

    @Autowired
    private CarroRepository carroRepository;
    // Listar todos
    public List<Carro> listar(){
        return carroRepository.findAll();
    }
    // Salvar um carro
    public Carro salvar(CarroDTO dto) {
        Carro carro = new Carro();
        carro.setNome(dto.getNome());
        carro.setModelo(dto.getModelo());
        carro.setMarca(dto.getMarca());
        carro.setDataFabricacao(dto.getDataFabricacao());
        carro.setConsumoMedioCidade(dto.getConsumoMedioCidade());
        carro.setConsumoMedioRodovia(dto.getConsumoMedioRodovia());
        return carroRepository.save(carro);
    }
    // Deletar um carro pelo ID
    public void deletar(Long id) {
        carroRepository.deleteById(id);
    }
    // Buscar carro pelo ID
    public Carro acharporid(Long id) {
        Optional<Carro> carro = carroRepository.findById(id);
        if (carro.isPresent()){
            return carro.get();
        } else {
            throw new RuntimeException();
        }
    }
    // Mudar dados do carro pelo ID
    public Carro modificar(Carro carro, CarroDTO carroDTO){
        carro.setNome(carroDTO.getNome());
        carro.setModelo(carroDTO.getModelo());
        carro.setMarca(carroDTO.getMarca());
        carro.setDataFabricacao(carroDTO.getDataFabricacao());
        carro.setConsumoMedioCidade(carroDTO.getConsumoMedioCidade());
        carro.setConsumoMedioRodovia(carroDTO.getConsumoMedioRodovia());
        return carroRepository.save(carro);
    }
    /**
    public void adicionarNaLista(Carro carro) {
        carro.getListaGastos().add()
    }*/
}
