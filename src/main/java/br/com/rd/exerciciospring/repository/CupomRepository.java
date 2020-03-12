package br.com.rd.exerciciospring.repository;

import br.com.rd.exerciciospring.model.entity.Cupom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CupomRepository extends JpaRepository<Cupom, Long> {
}
