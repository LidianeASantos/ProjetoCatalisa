package br.com.zup.Assessoria.Empresarial.configuracao;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Component;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@Component
public class ConfiguracaoMensagem {

    @Bean
    public MessageSource messageSource(){
        ReloadableResourceBundleMessageSource messageSource  = new ReloadableResourceBundleMessageSource();
        messageSource.setBasename( "classpath:mensagensDeValidacao" );
        messageSource.setDefaultEncoding( "UTF-8" );
        return messageSource;
    }

    public LocalValidatorFactoryBean  validator(){
        LocalValidatorFactoryBean bean = new LocalValidatorFactoryBean();
        bean.setValidationMessageSource( messageSource() );
        return bean;
    }

}
