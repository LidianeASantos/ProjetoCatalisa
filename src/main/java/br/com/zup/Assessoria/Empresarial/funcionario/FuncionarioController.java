package br.com.zup.Assessoria.Empresarial.funcionario;

import br.com.zup.Assessoria.Empresarial.cliente.ClienteDto;
import br.com.zup.Assessoria.Empresarial.cliente.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;


    @PostMapping
    public List<FuncionarioDto> cadastrarCliente(@RequestBody @Valid FuncionarioDto funcionarioDto){
        funcionarioService.adicionarFuncionarioNaLista( funcionarioDto );
        return funcionarioService.retornarFuncionario();
    }

    @GetMapping
    public List<FuncionarioDto> visualizarPetShop(){
        return funcionarioService.retornarFuncionario();
    }

    @GetMapping("/{nome}")
    public FuncionarioDto pesquisarPeloNomeFuncionario(@PathVariable String nome){
        return funcionarioService.pesquisarFuncionarioPeloNome( nome );

    }
}
