package br.com.w4solution.campeonato;

import br.com.w4solution.campeonato.controller.RegistrarController;
import br.com.w4solution.campeonato.main.Main;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CampeonatoApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(CampeonatoApplication.class, args);
	}

	@Autowired
	RegistrarController registrar;

	@Override
	public void run(String... args) throws Exception {
		Main principal = new Main(registrar);
		principal.exibirMenu();
	}
}
