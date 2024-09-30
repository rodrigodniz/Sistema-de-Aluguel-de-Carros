package labds.alugacar.ORM;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Agente extends Usuario {

    private String tipo;
    private String contato;
    // Getters e Setters
}

