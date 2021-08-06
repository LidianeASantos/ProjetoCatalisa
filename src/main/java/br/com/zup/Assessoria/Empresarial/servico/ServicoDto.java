package br.com.zup.Assessoria.Empresarial.servico;

import br.com.zup.Assessoria.Empresarial.cliente.ClienteDto;

public class ServicoDto {

    private Servico nome;

    private double valorServico;

    private ClienteDto cliente;

    public ServicoDto() {
    }

    public ServicoDto(Servico nome, double valorServico, ClienteDto cliente) {
        this.nome = nome;
        this.valorServico = valorServico;
        this.cliente = cliente;
    }

    public Servico getNome() {
        return nome;
    }

    public void setNome(Servico nome) {
        this.nome = nome;
    }

    public double getValorServico() {
        return valorServico;
    }

    public void setValorServico(double valorServico) {
        this.valorServico = valorServico;
    }

    public ClienteDto getCliente() {
        return cliente;
    }

    public void setCliente(ClienteDto cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return "ServicoDto{" +
                "nome=" + nome +
                ", valorServico=" + valorServico +
                ", cliente=" + cliente +
                '}';
    }
}