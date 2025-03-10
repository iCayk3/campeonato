package br.com.w4solution.campeonato.service;

import br.com.w4solution.campeonato.domain.RegistroPartida;
import br.com.w4solution.campeonato.service.persist.ArquivoService;
import com.thoughtworks.xstream.XStream;

import java.io.IOException;
import java.util.Scanner;

public class RegistrarService {
    ArquivoService arquivo;
    XStream xStream = new XStream();

    Scanner sc = new Scanner(System.in);

    public void cadastrarRegistro(){

        System.out.println("Nome do time da casa?");
        var timeA = sc.nextLine();

        System.out.println("Nome do time visitante?");
        var timeB = sc.nextLine();

        System.out.println("Tempo de jogo?");
        var tempoJogo = sc.nextLine();
        System.out.println("Total de gols time da casa?");
        var golsTimeA = sc.nextInt();
        System.out.println("Total de gols time visitante?");
        var golsTimeB = sc.nextInt();
        System.out.println("Total de cartões amarelos?");
        var totalCartaoAmarelo = sc.nextInt();
        System.out.println("Total de cartões vermelhos?");
        var totalCartalVermelho = sc.nextInt();

        var registro = new RegistroPartida(null, timeA, timeB, tempoJogo, golsTimeA, golsTimeB, totalCartaoAmarelo, totalCartalVermelho);
        var xml = xStream.toXML(registro);

        try {
            arquivo = new ArquivoService();
            arquivo.salvar("registro_partida.xml", xml);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(registro);

    }
}
