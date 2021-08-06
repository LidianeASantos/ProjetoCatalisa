package br.com.zup.Assessoria.Empresarial.Exception;

public class FuncionarioNaoEncontradoException extends RuntimeException{

    public FuncionarioNaoEncontradoException(String message){
        super(message);
    }
}
