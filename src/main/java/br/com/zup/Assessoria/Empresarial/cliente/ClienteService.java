package br.com.zup.Assessoria.Empresarial.cliente;

import br.com.zup.Assessoria.Empresarial.Exception.ClienteNaoEncontradoException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    private List<ClienteDto> listaCliente = new ArrayList<>();

    public void adicionarClienteNaLista(ClienteDto clienteDto){
        listaCliente.add(clienteDto);
    }

    public List<ClienteDto>retornarCliente(){
        return this.listaCliente;
    }

    public ClienteDto pesquisarClientePeloNome(String nome){
        ClienteDto clienteDto = null;
        for (ClienteDto retorno: listaCliente){
            if (retorno.getNome().equals( nome )){
                clienteDto = retorno;
            }
        }
        if(clienteDto != null){
            return clienteDto;
        }

        throw new ClienteNaoEncontradoException("Cliente não encontrado");
    }


}
