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


}
