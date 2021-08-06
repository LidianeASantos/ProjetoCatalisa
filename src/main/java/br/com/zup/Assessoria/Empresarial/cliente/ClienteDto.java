package br.com.zup.Assessoria.Empresarial.cliente;

import br.com.zup.Assessoria.Empresarial.pessoa.Pessoa;
import br.com.zup.Assessoria.Empresarial.servico.ServicoDto;

import javax.validation.constraints.NotBlank;

public class ClienteDto extends Pessoa {

    private Atividade atividade;

    private String descricao;

    @NotBlank
    private String funcionarioResponsavel;


    public ClienteDto(String nome, String endereco, String email, String telefone, Atividade atividade,
                      String descricao, String funcionarioResponsavel) {
        super( nome, endereco, email, telefone );
        this.atividade = atividade;
        this.descricao = descricao;
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;

    }

    public String getFuncionarioResponsavel() {
        return funcionarioResponsavel;
    }

    public void setFuncionarioResponsavel(String funcionarioResponsavel) {
        this.funcionarioResponsavel = funcionarioResponsavel;
    }

    @Override
    public String toString() {
        return "ClienteDto{" +
                "atividade=" + atividade +
                ", descricao='" + descricao + '\'' +
                ", funcionarioResponsavel='" + funcionarioResponsavel + '\'' +
                '}';
    }
}
