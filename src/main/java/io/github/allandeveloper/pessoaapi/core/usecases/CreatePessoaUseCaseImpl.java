package io.github.allandeveloper.pessoaapi.core.usecases;

import io.github.allandeveloper.pessoaapi.core.entities.Pessoa;
import io.github.allandeveloper.pessoaapi.core.exceptions.BusinessException;
import io.github.allandeveloper.pessoaapi.core.gateways.PessoaGateway;

public class CreatePessoaUseCaseImpl implements CreatePessoaUseCase {


    private final PessoaGateway pessoaGateway;

    public CreatePessoaUseCaseImpl(PessoaGateway pessoaGateway) {
        this.pessoaGateway = pessoaGateway;
    }

    @Override
    public Pessoa execute(Pessoa pessoa) {

       Pessoa pessoaExistente = pessoaGateway.findByCpfCpnj(pessoa.cpfCnpj());
        if(pessoaExistente != null) throw new BusinessException("Já existe uma pessoa com o CPF/CNPJ " + pessoa.cpfCnpj()+ " no sistema.");
        return pessoaGateway.createPessoa(pessoa);
    }
}
