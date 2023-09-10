package br.com.cursojava.g01parametrizandocomportamento.interfaces;

import br.com.cursojava.g01parametrizandocomportamento.dominio.Discente;


public interface DiscentePredicate {
    public abstract boolean test(Discente discente);
}
