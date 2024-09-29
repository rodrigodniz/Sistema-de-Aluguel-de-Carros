package labds.alugacar.exception;

public class UsuarioNaoEncontradoException extends RuntimeException {
    public UsuarioNaoEncontradoException(Long id) {
        super("Usuário não encontrado com ID: " + id);
    }
}
