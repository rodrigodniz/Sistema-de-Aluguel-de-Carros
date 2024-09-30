package labds.alugacar;

import labds.alugacar.ORM.Pedido;
import labds.alugacar.Service.AutomovelService;
import labds.alugacar.Service.ClienteService;
import labds.alugacar.Service.PedidoService;
import labds.alugacar.Service.UsuarioService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class AlugacarApplication implements CommandLineRunner {

    private final PedidoService pedidoService;
    private final UsuarioService usuarioService;
    private final ClienteService clienteService;
    private final AutomovelService automovelService;


    public AlugacarApplication(PedidoService pedidoService, UsuarioService usuarioService, ClienteService clienteService, AutomovelService automovelService) {
        this.pedidoService = pedidoService;
        this.usuarioService = usuarioService;
        this.clienteService = clienteService;
        this.automovelService = automovelService;
    }

    public static void main(String[] args) {
        SpringApplication.run(AlugacarApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner sc = new Scanner(System.in);
        boolean isTrue = true;

        while (isTrue) {
            System.out.println("\nO que você deseja fazer?");
            System.out.println("0- Sair");
            System.out.println("1- Usuários");
            System.out.println("2- Pedido");
            System.out.println("3- Automóveis");

            int opcode = sc.nextInt();

            switch (opcode) {
                case 1:

                    this.usuarioService.menu(sc);

                    break;
                case 2:

                    this.pedidoService.menu(sc);

                    break;

                    case 3:
                        this.automovelService.menu(sc);

                default:
                    isTrue = false;
                    break;
            }
        }
    }
}
