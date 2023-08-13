package br.com.cursojava.b21polimorfismo03.test;

import br.com.cursojava.b21polimorfismo03.repositorio.Repositorio;
import br.com.cursojava.b21polimorfismo03.servico.RepositorioArquivo;
import br.com.cursojava.b21polimorfismo03.servico.RepositorioBancoDeDados;
import br.com.cursojava.b21polimorfismo03.servico.RepositorioMemoria;

public class RepositorioTest {

    public static void main(String[] args) {

        // Com a programação orientada a interface, podemos utilizar o tipo mais genérico
        // que neste caso é Repositorio
        Repositorio repositorio = new RepositorioArquivo();
        repositorio.salvar();

        // podemos apenas trocar o tipo do objeto para salvarmos em memória em vez de salvarmos em arquivo
        repositorio = new RepositorioMemoria();
        repositorio.salvar();

        // podemos apenas trocar o tipo do objeto para salvarmos no bd em vez de salvarmos em memória
        repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();

    }

}
