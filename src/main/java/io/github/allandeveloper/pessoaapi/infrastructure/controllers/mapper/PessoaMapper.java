package io.github.allandeveloper.pessoaapi.infrastructure.controllers.mapper;

import io.github.allandeveloper.pessoaapi.core.entities.Pessoa;
import io.github.allandeveloper.pessoaapi.infrastructure.dtos.PessoaDto;
import org.springframework.stereotype.Component;

@Component
public class PessoaMapper {

    public PessoaDto toDto(Pessoa pessoa) {
        return new PessoaDto(pessoa.id(), pessoa.nome(), pessoa.cpfCnpj(), pessoa.email(), pessoa.tipo());
    }


    public Pessoa toEntity(PessoaDto pessoaDto) {
        return new Pessoa(null, pessoaDto.nome(), pessoaDto.cpfCnpj(), pessoaDto.email(), pessoaDto.tipo());
    }
}
