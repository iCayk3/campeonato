package br.com.w4solution.campeonato.repository;

import br.com.w4solution.campeonato.domain.registros.Partida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartidaRepository extends JpaRepository<Partida, Long> {
}
