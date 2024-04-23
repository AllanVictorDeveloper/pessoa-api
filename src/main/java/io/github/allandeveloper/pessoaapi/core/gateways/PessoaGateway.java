package io.github.allandeveloper.pessoaapi.core.gateways;

import io.github.allandeveloper.pessoaapi.core.entities.Pessoa;

public interface PessoaGateway {

    Pessoa createPessoa(Pessoa pessoa);

    Pessoa findByCpfCpnj(String cpfCnpj);
}
