package br.com.zup.Assessoria.Empresarial.funcionario;

import br.com.zup.Assessoria.Empresarial.pessoa.Pessoa;

public class FuncionarioDto extends Pessoa {

    private double salario;
    private Funcao funcao;

    public FuncionarioDto(String nome, String endereco, String email,
                          String telefone, double salario, Funcao funcao) {
        super( nome, endereco, email, telefone );
        this.salario = salario;
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Funcao getFuncao() {
        return funcao;
    }

    public void setFuncao(Funcao funcao) {
        this.funcao = funcao;
    }

    @Override
    public String toString() {
        return "FuncionarioDto{" +
                "salario=" + salario +
                ", funcao=" + funcao +
                '}';
    }
}
