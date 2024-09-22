@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    List<Usuario> findByTipoUsuario(String tipoUsuario);
}
