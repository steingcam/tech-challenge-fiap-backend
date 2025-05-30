package br.com.techchallenge.foodsys.comandos.usuario;

import br.com.techchallenge.foodsys.compartilhado.CompartilhadoService;
import br.com.techchallenge.foodsys.dominio.usuario.Usuario;
import br.com.techchallenge.foodsys.dominio.usuario.UsuarioRepository;
import br.com.techchallenge.foodsys.utils.ValidarUsuarioExistente;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DesativarUsuarioComando {

    private final UsuarioRepository usuarioRepository;
    private final ValidarUsuarioExistente validarUsuarioExistente;
    private final CompartilhadoService sharedService;

    public Usuario execute(Long id) {
        Usuario usuario = validarUsuarioExistente.execute(id);
        desativarUsuario(usuario);
        return usuarioRepository.save(usuario);
    }

    private void desativarUsuario(Usuario usuario) {
        usuario.setAtivo(false);
        usuario.setDataDesativacao(sharedService.getCurrentDateTime());
    }
}