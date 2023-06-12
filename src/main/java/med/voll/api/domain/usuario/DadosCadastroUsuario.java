package med.voll.api.domain.usuario;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record DadosCadastroUsuario(


        @NotBlank(message = "{email.obrigatorio}")
        @Email(message = "{email.invalido}")
        String login,
        @NotBlank(message = "{senha.obrigatorio}")
        String senha
) {

}
