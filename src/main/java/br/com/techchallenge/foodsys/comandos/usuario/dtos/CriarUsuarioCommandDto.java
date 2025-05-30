package br.com.techchallenge.foodsys.comandos.usuario.dtos;

import br.com.techchallenge.foodsys.enums.TipoUsuario;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CriarUsuarioCommandDto {

    @NotBlank(message = "{nome.obrigatorio}")
    private String nome;

    @Email(message = "{email.invalido}")
    @NotBlank(message = "{email.obrigatorio}")
    private String email;

    @NotBlank(message = "{senha.obrigatoria}")
    private String senha;

    @NotBlank(message = "{login.obrigatorio}")
    private String login;

    @NotNull(message = "{tipo.obrigatorio}")
    private TipoUsuario tipo;
}