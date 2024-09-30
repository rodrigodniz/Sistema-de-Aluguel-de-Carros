package labds.alugacar.Repository;

import labds.alugacar.ORM.Cliente;
import labds.alugacar.ORM.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
    List<Pedido> findByCliente(Cliente cliente);
}
