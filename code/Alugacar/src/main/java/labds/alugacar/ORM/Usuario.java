package labds.alugacar.ORM;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String rg;
    private String cpf;
    private String endereco;
    private String profissao;
    private String entidadeEmpregadora;
    private Double rendimento1;
    private Double rendimento2;
    private Double rendimento3;
    private String tipoUsuario;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEntidadeEmpregadora() {
        return entidadeEmpregadora;
    }

    public void setEntidadeEmpregadora(String entidadeEmpregadora) {
        this.entidadeEmpregadora = entidadeEmpregadora;
    }

    public Double getRendimento1() {
        return rendimento1;
    }

    public void setRendimento1(Double rendimento1) {
        this.rendimento1 = rendimento1;
    }

    public Double getRendimento2() {
        return rendimento2;
    }

    public void setRendimento2(Double rendimento2) {
        this.rendimento2 = rendimento2;
    }

    public Double getRendimento3() {
        return rendimento3;
    }

    public void setRendimento3(Double rendimento3) {
        this.rendimento3 = rendimento3;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }
}
