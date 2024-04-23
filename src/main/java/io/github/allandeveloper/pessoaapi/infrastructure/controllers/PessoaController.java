package io.github.allandeveloper.pessoaapi.infrastructure.controllers;


import io.github.allandeveloper.pessoaapi.core.entities.Pessoa;
import io.github.allandeveloper.pessoaapi.core.usecases.CreatePessoaUseCase;
import io.github.allandeveloper.pessoaapi.infrastructure.dtos.PessoaDto;
import io.github.allandeveloper.pessoaapi.infrastructure.controllers.mapper.PessoaMapper;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/pessoa")
@AllArgsConstructor
public class PessoaController {

    private final CreatePessoaUseCase createPessoaUseCase;
    private final PessoaMapper pessoaMapper;

    @PostMapping
    public PessoaDto createPessoa(@RequestBody PessoaDto pessoaDto) {

        Pessoa pessoaEntity = pessoaMapper.toEntity(pessoaDto);

        try {

            Pessoa pessoaNew = createPessoaUseCase.execute(pessoaEntity);

            return pessoaMapper.toDto(pessoaNew);

        } catch (RuntimeException runtimeException) {
            throw new RuntimeException(runtimeException.getMessage());
        }
    }
}
