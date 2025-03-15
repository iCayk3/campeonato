package br.com.w4solution.campeonato.domain.registros;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "numeroSumula")
@Entity
@Table(name = "partidas")
public class Partida {
    @Id
    Long numeroSumula;
    String categoria;
    @Enumerated(EnumType.STRING)
    Sexo sexo;
    @Enumerated(EnumType.STRING)
    Fase fase;
    @Embedded
    Ginasio local;
    LocalDate data;
    String equipeA;
    String equipeB;
    String capitaoEquipeA;
    String capitaoEquipeB;
    Integer golsPrimeiroTempoEquipeA;
    Integer golsPrimeiroTempoEquipeB;
    Integer golsSegundoTempoEquipeA;
    Integer golsSegundoTempoEquipeB;
    Integer golsTempoExtraEquipeA;
    Integer golsTempoExtraEquipeB;
    Integer golsPenaltisEquipeA;
    Integer golsPenaltisEquipeB;
    @Embedded
    Horarios horarios;
    @ElementCollection
    @CollectionTable(name = "cartoes_amarelos_time_a", joinColumns = @JoinColumn(name = "numeroSumula_id"))
    List<Cartao> cartoesAmarelosTimeA;
    @ElementCollection
    @CollectionTable(name = "cartoes_amarelos_time_b", joinColumns = @JoinColumn(name = "numeroSumula_id"))
    List<Cartao> cartoesAmarelosTimeB;
    @ElementCollection
    @CollectionTable(name = "cartoes_vermelhos_time_a", joinColumns = @JoinColumn(name = "numeroSumula_id"))
    List<Cartao> cartoesVermelhosTimeA;
    @ElementCollection
    @CollectionTable(name = "cartoes_vermelhos_time_b", joinColumns = @JoinColumn(name = "numeroSumula_id"))
    List<Cartao> cartoesVermelhosTimeB;
    @ElementCollection
    @CollectionTable(name = "gols_time_a", joinColumns = @JoinColumn(name = "numeroSumula_id"))
    List<Gol> golsTimeA;
    @ElementCollection
    @CollectionTable(name = "gols_time_b", joinColumns = @JoinColumn(name = "numeroSumula_id"))
    List<Gol> golsTimeB;
    @ElementCollection
    @CollectionTable(name = "faltas_time_a", joinColumns = @JoinColumn(name = "numeroSumula_id"))
    List<Falta> faltasTimeA;
    @ElementCollection
    @CollectionTable(name = "faltas_time_b", joinColumns = @JoinColumn(name = "numeroSumula_id"))
    List<Falta> faltasTimeB;
    @Embedded
    Arbitragem arbitros;
}
