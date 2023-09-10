package br.com.cursojava.i03streamcollectors.dominio;

import java.util.Objects;

public class ClientesBanco {

    private String nomeCliente;
    private Double rendaMensal;
    private PerfilCliente perfilCliente;

    public ClientesBanco(String nomeCliente, Double rendaMensal, PerfilCliente perfilCliente) {
        this.nomeCliente = nomeCliente;
        this.rendaMensal = rendaMensal;
        this.perfilCliente = perfilCliente;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ClientesBanco that = (ClientesBanco) o;
        return Objects.equals(nomeCliente, that.nomeCliente);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nomeCliente);
    }

    @Override
    public String toString() {
        return "\n" +
                "ClientesBanco {" + "\n" +
                "   nomeCliente='" + nomeCliente + "\n" +
                "   rendaMensal=" + rendaMensal + "\n" +
                "   perfilCliente=" + perfilCliente + "\n" +
                '}';
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public Double getRendaMensal() {
        return rendaMensal;
    }

    public PerfilCliente getPerfilCliente() {
        return perfilCliente;
    }

}

