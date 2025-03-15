package br.com.w4solution.campeonato.service;

import br.com.w4solution.campeonato.domain.registros.*;
import br.com.w4solution.campeonato.repository.PartidaRepository;
import com.thoughtworks.xstream.XStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

@Service
public class RegistrarService {

    @Autowired
    PartidaRepository repository;

    Scanner sc = new Scanner(System.in);

    public void cadastrarRegistro(){

        Long numeroSumula = 1L;
        String categoria = "Adulto";
        Ginasio local = new Ginasio("Maria pajé", "São João de Pirabas", "PA");
        Horarios horarios = new Horarios("19:00", "19:30", null, null);
        Cartao cartao1 = new Cartao("Cayke Silva");
        Gol gol1 = new Gol("Cayke Silva", "07:45");
        Gol gol2 = new Gol("Cayke Silva", "08:15");
        Gol gol3 = new Gol("Cayke Silva", "09:27");
        Falta falta1 = new Falta("MM", "02:44");
        Falta falta2 = new Falta("CC", "02:59");
        Falta falta4 = new Falta("DD", "05:21");
        Falta falta6 = new Falta("MM", "07:11");
        Falta falta7 = new Falta("MM", "11:11");
        List<Falta> faltas= new ArrayList<>();
        faltas.add(falta1);
        faltas.add(falta2);
        faltas.add(falta4);
        faltas.add(falta6);
        faltas.add(falta7);
        List<Gol> gols = new ArrayList<>();
        gols.add(gol1);
        gols.add(gol2);
        gols.add(gol3);
        List<Cartao> cartoesAmarelos = new ArrayList<>();
        cartoesAmarelos.add(cartao1);
        Arbitragem arbitros = new Arbitragem("Fulano", "Ciclano", "Beltrano", "Batman");
        Partida partida = new Partida(
                numeroSumula,
                "Adulto",
                Sexo.MASCULINO,
                Fase.CHAVE,
                local,
                LocalDate.now(),
                "Time 1",
                "Time 2",
                "Eu",
                "Você",
                gols.size(),
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                horarios,
                cartoesAmarelos,
                null,
                null,
                null,
                gols,
                null,
                null,
                faltas,
                arbitros
        );
        System.out.println(partida);
        repository.save(partida);
    }
}
