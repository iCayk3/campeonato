package br.com.w4solution.campeonato.domain.registros;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
public class Horarios {
    String tempo1;
    String tempo2;
    String extra;
    String penaltis;
}
