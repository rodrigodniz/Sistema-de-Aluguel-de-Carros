package labds.alugacar.ORM;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Cliente extends Usuario {

    private String profissao;
    private String empregador;
    private Double rendimento;

    public Cliente(String nome, String rg, String cpf, String endereco) {
    }

    public Cliente() {

    }

}
