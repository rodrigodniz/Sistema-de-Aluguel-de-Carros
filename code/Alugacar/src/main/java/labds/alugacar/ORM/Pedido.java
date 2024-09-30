package labds.alugacar.ORM;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import java.time.LocalDate;

@Entity
public class Pedido {

    public LocalDate getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDate dataPedido) {
        this.dataPedido = dataPedido;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Usuario usuario;

    @OneToOne
    @JoinColumn(name = "automovel_id")
    private Automovel automovel;

    private String status;
    private LocalDate dataPedido;

    @Deprecated
    public Pedido() {


    }

    public Pedido(Long id, Usuario usuario, Automovel automovel) {
        this.id = id;
        this.usuario = usuario;
        this.automovel = automovel;
        this.dataPedido = LocalDate.now();
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }

    public Usuario getCliente() {
        return usuario;
    }

    public void setCliente(Usuario usuario) {
        this.usuario = usuario;
    }

}

