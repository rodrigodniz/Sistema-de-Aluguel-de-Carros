package labds.alugacar.ORM;


import jakarta.persistence.*;

@Entity
public class Contrato {

    @Id
    private Long id;
    @OneToOne
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;
    private int duracao;
    private boolean opcaoCompra;

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
    }

}

