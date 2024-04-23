package io.github.allandeveloper.pessoaapi.infrastructure.configuration;

import io.github.allandeveloper.pessoaapi.core.gateways.PessoaGateway;
import io.github.allandeveloper.pessoaapi.core.usecases.CreatePessoaUseCase;
import io.github.allandeveloper.pessoaapi.core.usecases.CreatePessoaUseCaseImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public CreatePessoaUseCase createPessoaUseCase(PessoaGateway pessoaGateway) {
        return new CreatePessoaUseCaseImpl(pessoaGateway);
    }

}
