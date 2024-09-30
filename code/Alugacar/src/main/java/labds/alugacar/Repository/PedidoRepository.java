package labds.alugacar.Repository;

import labds.alugacar.ORM.Pedido;
import labds.alugacar.ORM.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByUsuario(Usuario usuario);
}
