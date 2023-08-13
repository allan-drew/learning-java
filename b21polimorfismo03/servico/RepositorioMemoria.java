package br.com.cursojava.b21polimorfismo03.servico;

import br.com.cursojava.b21polimorfismo03.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {

    @Override
    public void salvar() {
        System.out.println("salvando em Memória");
    }

}
