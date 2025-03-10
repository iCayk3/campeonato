package br.com.w4solution.campeonato.main;

import br.com.w4solution.campeonato.controller.RegistrarController;

import java.util.Scanner;

public class Main {

    public void exibirMenu(){
        var registrar = new RegistrarController();
        var opcao = -1;
        var sc = new Scanner(System.in);

        while(opcao != 0){
            System.out.println("""
                Selecione uma das opções: 
                1 - Cadastrar time
                2 - Cadastrar jogador
                3 - Registrar informações da partida
                4 - Calendario de jogos
                5 - Tabela de classificação
                
                """);
            opcao = sc.nextInt();

            switch (opcao){
                case 0:
                    System.out.println("Até a próxima!");
                    break;
                case 1:
                    System.out.println("Cadastrar time");
                    break;
                case 2:
                    System.out.println("Cadastrar jogador");
                    break;
                case 3:
                    System.out.println("Registrar informações da partida");
                    registrar.cadastrarRegistro();
                    break;
                case 4:
                    System.out.println("Calendario de jogos");
                    break;
                case 5:
                    System.out.println("Tabela de classificação");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
