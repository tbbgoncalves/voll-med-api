package med.voll.api.paciente;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import med.voll.api.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(@NotNull Long id,
                                       @NotBlank
                                       String nome,
                                       @NotBlank
                                       @Pattern(regexp = "\\d{10,11}")
                                       String telefone,
                                       @Valid DadosEndereco endereco) {
}
