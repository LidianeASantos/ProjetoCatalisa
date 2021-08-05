package br.com.zup.Assessoria.Empresarial.Exception;

public class ClienteNaoEncontradoException extends RuntimeException{

    public ClienteNaoEncontradoException(String message){
        super(message);
    }
}
