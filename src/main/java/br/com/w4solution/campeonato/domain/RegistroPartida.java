package br.com.w4solution.campeonato.domain;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class RegistroPartida {
    Long id;
    String timeA;
    String timeB;
    String TempoJogo;
    Integer golsTimeA;
    Integer golsTimeB;
    Integer totalCartaoAmarelos;
    Integer totalCartaoVermelhos;

    @Override
    public String toString() {
        return "RegistroPartida{" +
                "id=" + id +
                ", timeA='" + timeA + '\'' +
                ", timeB='" + timeB + '\'' +
                ", TempoJogo='" + TempoJogo + '\'' +
                ", golsTimeA=" + golsTimeA +
                ", golsTimeB=" + golsTimeB +
                ", totalCartaoAmarelos=" + totalCartaoAmarelos +
                ", totalCartaoVermelhos=" + totalCartaoVermelhos +
                '}';
    }
}
