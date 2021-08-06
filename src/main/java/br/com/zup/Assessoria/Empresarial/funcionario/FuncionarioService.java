package br.com.zup.Assessoria.Empresarial.funcionario;

import br.com.zup.Assessoria.Empresarial.Exception.ClienteNaoEncontradoException;
import br.com.zup.Assessoria.Empresarial.Exception.FuncionarioNaoEncontradoException;
import br.com.zup.Assessoria.Empresarial.cliente.ClienteDto;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FuncionarioService {

    private List<FuncionarioDto> listaFuncionario = new ArrayList<>();

    public void adicionarFuncionarioNaLista(FuncionarioDto funcionarioDto){
        listaFuncionario.add(funcionarioDto);
    }

    public List<FuncionarioDto>retornarFuncionario(){
        return this.listaFuncionario;
    }

    public FuncionarioDto pesquisarFuncionarioPeloNome(String nome){
        FuncionarioDto funcionarioDto = null;
        for (FuncionarioDto retorno: listaFuncionario){
            if (retorno.getNome().equals( nome )){
                funcionarioDto = retorno;
            }
        }
        if(funcionarioDto != null){
            return funcionarioDto;
        }

        throw new FuncionarioNaoEncontradoException("Funionario não encontrado");
    }

    public void removerFuncionarioDaLista(String nome){
        FuncionarioDto funcionarioDto = null;
        for (FuncionarioDto retorno: listaFuncionario){
            if (retorno.getNome().equals( nome )){
                listaFuncionario.remove( funcionarioDto );
            }
        }
    }
}
