package com.bootcamp.springbootlab.muralrecados.repository;

import com.bootcamp.springbootlab.muralrecados.model.Recado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecadoRepository extends JpaRepository<Recado, Long> {

}
