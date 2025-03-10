package br.com.w4solution.campeonato.service.persist;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ArquivoService {

    File file;
    FileWriter fileWriter;

    public void salvar(String nomeArquivo, String conteudo) throws IOException {
        //file = new File(nomeArquivo);
        fileWriter = new FileWriter(nomeArquivo);
        fileWriter.write(conteudo);
        fileWriter.close();
    }
}
