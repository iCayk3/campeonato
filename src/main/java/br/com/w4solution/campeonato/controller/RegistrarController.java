package br.com.w4solution.campeonato.controller;

import br.com.w4solution.campeonato.service.RegistrarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RegistrarController {

    @Autowired
    RegistrarService registrarService;

    public void cadastrarRegistro(){
        registrarService.cadastrarRegistro();
    }
}
