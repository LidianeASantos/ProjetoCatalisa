package br.com.zup.Assessoria.Empresarial.servico;

import br.com.zup.Assessoria.Empresarial.cliente.ClienteDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/servicos")
public class ServicoController {

    @Autowired
    private ServicoService servicoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public List<ServicoDto> cadastrarServico(@RequestBody @Valid ServicoDto servicoDto){
        servicoService.adicionarServicoNaLista( servicoDto );
        return servicoService.retornarServico();
    }

    @GetMapping
    public List<ServicoDto> visualizarServico(){
        return servicoService.retornarServico();
    }

    @GetMapping("/{nome}")
    public ServicoDto pesquisarServicoPorNome(@PathVariable Servico nome){
        return servicoService.pesquisarServicoPeloNome( nome );

    }

    @DeleteMapping("/{nome}")
    public void removerServicoPorNome(@PathVariable String nome){
        servicoService.removerServicoDaLista( nome );
    }



}
