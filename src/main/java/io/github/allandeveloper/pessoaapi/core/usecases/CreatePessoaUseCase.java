package io.github.allandeveloper.pessoaapi.core.usecases;

import io.github.allandeveloper.pessoaapi.core.entities.Pessoa;

public interface CreatePessoaUseCase {

    public Pessoa execute(Pessoa pessoa);
}
