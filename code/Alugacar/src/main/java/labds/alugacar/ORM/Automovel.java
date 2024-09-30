package labds.alugacar.ORM;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Automovel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String modelo;
    private String marca;
    private String ano;
    private String placa;

    @Deprecated
    public Automovel() {

    }

    public Automovel(String modelo, String marca, String ano, String placa) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.placa = placa;
    }

    @Override
    public String toString() {
        return "Automóvel {" +
                "ID: " + id +
                ", Modelo: '" + modelo + '\'' +
                ", Marca: '" + marca + '\'' +
                ", Ano: '" + ano + '\'' +
                ", Placa: '" + placa + '\'' +
                '}';
    }


}

