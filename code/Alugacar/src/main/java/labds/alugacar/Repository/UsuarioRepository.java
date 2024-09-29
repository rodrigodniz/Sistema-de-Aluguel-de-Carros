package labds.alugacar.Repository;

import labds.alugacar.ORM.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    List<Usuario> findByTipoUsuario(String tipoUsuario);
}
