package br.com.zup.Assessoria.Empresarial.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class Clientecontroller {

    @Autowired
    private ClienteService clienteService;


    @PostMapping
    public List<ClienteDto> cadastrarCliente(@RequestBody @Valid ClienteDto clienteDto){
        clienteService.adicionarClienteNaLista( clienteDto );
        return clienteService.retornarCliente();
    }

    @GetMapping
    public List<ClienteDto> visualizarPetShop(){
        return clienteService.retornarCliente();
    }

    @GetMapping("/{nome}")
    public ClienteDto pesquisarPeloNomeCliente(@PathVariable String nome){
        return clienteService.pesquisarClientePeloNome( nome );

    }


    @DeleteMapping("/{nome}")
    public void removerClientePorNome(@PathVariable String nome){
        clienteService.removerClinteDaLista( nome );
    }

}
