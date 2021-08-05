package br.com.zup.Assessoria.Empresarial.servico;

import br.com.zup.Assessoria.Empresarial.Exception.ServicoNaoEncontradoException;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ServicoService {

    private List<ServicoDto> listaServico = new ArrayList<>();

    public void adicionarServico(ServicoDto servicoDto){
        listaServico.add( servicoDto );
    }

    public List<ServicoDto> retornarServico(){
        return this.listaServico;
    }

    public ServicoDto pesquisarServicoPeloNome(String nome){
        ServicoDto servicoDto = null;
        for (ServicoDto percorrer: listaServico){
            if (percorrer.getNomeServico().equals( nome )){
                servicoDto = percorrer;
            }
        }
        if (servicoDto != null){
            return servicoDto;
        }
        throw new ServicoNaoEncontradoException("Serviço não encontrado!");
    }
}
