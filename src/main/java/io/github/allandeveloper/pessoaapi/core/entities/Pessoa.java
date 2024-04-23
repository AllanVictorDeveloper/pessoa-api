package io.github.allandeveloper.pessoaapi.core.entities;

import io.github.allandeveloper.pessoaapi.core.enums.EnumTipoPessoa;

public record Pessoa(
        Long id,
        String nome,
        String cpfCnpj,
        String email,
        EnumTipoPessoa tipo
) {
}
