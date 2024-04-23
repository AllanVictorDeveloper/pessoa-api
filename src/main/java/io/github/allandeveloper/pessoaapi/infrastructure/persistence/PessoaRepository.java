package io.github.allandeveloper.pessoaapi.infrastructure.persistence;

import io.github.allandeveloper.pessoaapi.core.entities.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends JpaRepository<PessoaEntity, Long> {
    PessoaEntity findByCpfCnpj(String cpfCnpj);
}
