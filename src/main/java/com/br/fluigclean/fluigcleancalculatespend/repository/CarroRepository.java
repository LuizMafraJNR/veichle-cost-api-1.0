package com.br.fluigclean.fluigcleancalculatespend.repository;

import com.br.fluigclean.fluigcleancalculatespend.model.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarroRepository extends JpaRepository<Carro, Long> {
}
