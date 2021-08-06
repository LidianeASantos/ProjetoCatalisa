package br.com.zup.Assessoria.Empresarial.funcionario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
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

    @DeleteMapping("/{nome}")
    public void removerFuncionarioPorNome(@PathVariable String nome){
        funcionarioService.removerFuncionarioDaLista( nome );
    }
}
