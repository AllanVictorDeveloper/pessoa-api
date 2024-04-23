package io.github.allandeveloper.pessoaapi.infrastructure.dtos;

import io.github.allandeveloper.pessoaapi.core.enums.EnumTipoPessoa;

public record PessoaDto(
        Long id,
        String nome,
        String cpfCnpj,
        String email,
        EnumTipoPessoa tipo
) {
}
