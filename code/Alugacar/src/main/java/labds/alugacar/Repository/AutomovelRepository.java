package labds.alugacar.Repository;

import labds.alugacar.ORM.Automovel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AutomovelRepository extends JpaRepository<Automovel, Long> {

}

