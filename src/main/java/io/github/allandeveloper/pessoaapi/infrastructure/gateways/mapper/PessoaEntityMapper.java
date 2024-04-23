package io.github.allandeveloper.pessoaapi.infrastructure.gateways.mapper;

import io.github.allandeveloper.pessoaapi.core.entities.Pessoa;
import io.github.allandeveloper.pessoaapi.infrastructure.persistence.PessoaEntity;
import org.springframework.stereotype.Component;

@Component
public class PessoaEntityMapper {

    public PessoaEntity toPessoaEntityJPA(Pessoa pessoa) {
        return new PessoaEntity(pessoa.id(), pessoa.nome(), pessoa.email(), pessoa.cpfCnpj(), pessoa.tipo());
    }


    public Pessoa toPessoaEntityCore(PessoaEntity pessoaEntity) {
        return new Pessoa(pessoaEntity.getId(), pessoaEntity.getNome(),  pessoaEntity.getCpfCnpj(), pessoaEntity.getEmail(), pessoaEntity.getTipo());
    }

}
