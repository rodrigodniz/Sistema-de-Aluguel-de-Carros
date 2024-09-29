package labds.alugacar.Service;

import labds.alugacar.ORM.Usuario;
import labds.alugacar.Repository.UsuarioRepository;
import labds.alugacar.exception.UsuarioNaoEncontradoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario criarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    public Usuario obterUsuarioPorId(Long id) {
        return usuarioRepository.findById(id).orElseThrow(() -> new UsuarioNaoEncontradoException(id));
    }

    public List<Usuario> listarTodosUsuarios() {
        return usuarioRepository.findAll();
    }

    public Usuario atualizarUsuario(Long id, Usuario usuarioAtualizado) {
        Usuario usuario = obterUsuarioPorId(id);
        usuario.setNome(usuarioAtualizado.getNome());
        usuario.setRg(usuarioAtualizado.getRg());
        usuario.setCpf(usuarioAtualizado.getCpf());
        usuario.setEndereco(usuarioAtualizado.getEndereco());
        usuario.setProfissao(usuarioAtualizado.getProfissao());
        usuario.setEntidadeEmpregadora(usuarioAtualizado.getEntidadeEmpregadora());
        usuario.setRendimento1(usuarioAtualizado.getRendimento1());
        usuario.setRendimento2(usuarioAtualizado.getRendimento2());
        usuario.setRendimento3(usuarioAtualizado.getRendimento3());
        return usuarioRepository.save(usuario);
    }

    public void deletarUsuario(Long id) {
        usuarioRepository.deleteById(id);
    }
}
