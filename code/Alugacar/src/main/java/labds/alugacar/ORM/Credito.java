package labds.alugacar.ORM;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

@Entity
public class Credito {

    @Id
    private Long id;
    @ManyToOne
    @JoinColumn(name = "banco_id")
    private Agente banco;
    private double valor;
    private double taxaJuros;
    private LocalDate dataAprovacao;

    public Agente getBanco() {
        return banco;
    }

    public void setBanco(Agente banco) {
        this.banco = banco;
    }
    // Getters e Setters
}
