package br.com.cursojava.b21polimorfismo03.servico;

import br.com.cursojava.b21polimorfismo03.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("salvando em um Arquivo");
    }

}
