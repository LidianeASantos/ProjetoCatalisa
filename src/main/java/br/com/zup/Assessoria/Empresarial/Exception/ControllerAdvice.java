package br.com.zup.Assessoria.Empresarial.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestControllerAdvice
public class ControllerAdvice {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public MensagemDeErro manipularExcecoesDeValidacao(MethodArgumentNotValidException exception){
        List<FieldError> fildErros = exception.getBindingResult().getFieldErrors();

        List<Erro> erros = fildErros.stream().map( objeto -> new Erro( objeto.getDefaultMessage() ) ).
                collect( Collectors.toList());
        return new MensagemDeErro( 400, erros );
    }

    @ExceptionHandler(ClienteNaoEncontradoException.class)
    public MensagemDeErro manipularClienteNaoEncontrado(ClienteNaoEncontradoException exception){
        List<Erro> erros = Arrays.asList( new Erro( exception.getMessage() ) );

        return new MensagemDeErro( 400, erros );
    }

    @ExceptionHandler(FuncionarioNaoEncontradoException.class)
    public MensagemDeErro manipularFuncionarioNaoEncontrado(FuncionarioNaoEncontradoException exception){
        List<Erro> erros = Arrays.asList( new Erro( exception.getMessage() ) );

        return new MensagemDeErro( 400, erros );
    }

    public MensagemDeErro manipularServicoNaoEncontrado(ServicoNaoEncontradoException exception){
        List<Erro> erros = Arrays.asList( new Erro( exception.getMessage() ) );

        return new MensagemDeErro( 400, erros );
    }


}
