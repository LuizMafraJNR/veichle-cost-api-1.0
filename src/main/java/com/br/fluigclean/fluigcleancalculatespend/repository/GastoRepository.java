package com.br.fluigclean.fluigcleancalculatespend.repository;

import com.br.fluigclean.fluigcleancalculatespend.model.Gasto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GastoRepository extends JpaRepository<Gasto, Long> {
}
