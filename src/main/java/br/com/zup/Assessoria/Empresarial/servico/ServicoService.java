package br.com.zup.Assessoria.Empresarial.servico;

import br.com.zup.Assessoria.Empresarial.Exception.ServicoNaoEncontradoException;
import br.com.zup.Assessoria.Empresarial.cliente.ClienteDto;
import br.com.zup.Assessoria.Empresarial.cliente.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServicoService {

    @Autowired
    private ClienteService clienteService;

    private List<ServicoDto> listaServico = new ArrayList<>();

    public void adicionarServicoNaLista(ServicoDto servicoDto){
        clienteService.adicionarClienteNaLista( servicoDto.getCliente() );
        listaServico.add( servicoDto );
    }

    public List<ServicoDto> retornarServico(){
        return this.listaServico;
    }

    ServicoDto pesquisarServicoPeloNome(Servico nome){
        ServicoDto servicoDto = null;

        for (ServicoDto retorno : listaServico){
            if (retorno.getNome().equals( nome )){
                servicoDto = retorno;
            }
        }
        if (servicoDto != null){
            return servicoDto;
        }
        throw new ServicoNaoEncontradoException( "Serviço não encontrado!" );
    }

    private ServicoDto atualizarServico(ServicoDto objetoParaAtualizar, ServicoDto objetoDaPesquisa){
        objetoParaAtualizar.setCliente( objetoDaPesquisa.getCliente() );
        objetoParaAtualizar.setValorServico( objetoDaPesquisa.getValorServico() );

        return objetoParaAtualizar;
    }

    public ServicoDto atualizarOuAdicionarServico(ServicoDto servicoDto){
        try {
            ServicoDto objetoDaLista = pesquisarServicoPeloNome( servicoDto.getNome() );
            objetoDaLista = atualizarServico(objetoDaLista, servicoDto);
            return objetoDaLista;
        }catch (ServicoNaoEncontradoException e){
            adicionarServicoNaLista( servicoDto );
            return servicoDto;
        }
    }

    public void removerServicoDaLista(String nome){
        ClienteDto clienteDto = null;
        for (ServicoDto retorno: listaServico){
            if (retorno.getNome().equals( nome )){
                listaServico.remove( listaServico );
            }
        }
    }


}
