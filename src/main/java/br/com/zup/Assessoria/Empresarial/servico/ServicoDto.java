package br.com.zup.Assessoria.Empresarial.servico;

public class ServicoDto {

    private ServicoEnum nomeServico;

    private double valorServico;

    public ServicoDto(ServicoEnum nomeServico) {
        this.nomeServico = nomeServico;
    }

    public ServicoEnum getNomeServico() {
        return nomeServico;
    }

    public void setNomeServico(ServicoEnum nomeServico) {
        this.nomeServico = nomeServico;
    }

    public double getValorServico() {
        return valorServico;
    }

    public void setValorServico(double valorServico) {
        this.valorServico = valorServico;
    }
}
