package br.com.w4solution.campeonato.controller;

import br.com.w4solution.campeonato.service.RegistrarService;

public class RegistrarController {

    public void cadastrarRegistro(){
        RegistrarService registrarService = new RegistrarService();
        registrarService.cadastrarRegistro();
    }
}
