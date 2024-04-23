package io.github.allandeveloper.pessoaapi.infrastructure.gateways;

import io.github.allandeveloper.pessoaapi.core.entities.Pessoa;
import io.github.allandeveloper.pessoaapi.core.gateways.PessoaGateway;
import io.github.allandeveloper.pessoaapi.infrastructure.gateways.mapper.PessoaEntityMapper;
import io.github.allandeveloper.pessoaapi.infrastructure.persistence.PessoaEntity;
import io.github.allandeveloper.pessoaapi.infrastructure.persistence.PessoaRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class PessoaRepositoryGateway implements PessoaGateway {

    private final PessoaRepository pessoaRepository;
    private final PessoaEntityMapper pessoaEntityMapper;

    @Override
    public Pessoa createPessoa(Pessoa pessoa) {

        try {

            PessoaEntity pessoaEntityJPA = this.pessoaEntityMapper.toPessoaEntityJPA(pessoa);

            PessoaEntity pessoaNew = this.pessoaRepository.save(pessoaEntityJPA);

            return this.pessoaEntityMapper.toPessoaEntityCore(pessoaNew);

        } catch (RuntimeException runtimeException) {
            throw new RuntimeException(runtimeException.getMessage());
        }
    }

    @Override
    public Pessoa findByCpfCpnj(String cpfCnpj) {

        PessoaEntity pessoaResult = this.pessoaRepository.findByCpfCnpj(cpfCnpj);

        if(pessoaResult == null) return null;

        return this.pessoaEntityMapper.toPessoaEntityCore(pessoaResult);
    }
}
