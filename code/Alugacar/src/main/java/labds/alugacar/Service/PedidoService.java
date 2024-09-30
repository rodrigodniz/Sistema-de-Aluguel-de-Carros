package labds.alugacar.Service;

import labds.alugacar.ORM.Automovel;
import labds.alugacar.ORM.Usuario;
import labds.alugacar.Repository.AutomovelRepository;
import labds.alugacar.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import labds.alugacar.ORM.Cliente;
import labds.alugacar.ORM.Pedido;
import labds.alugacar.Repository.ClienteRepository;
import labds.alugacar.Repository.PedidoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@Service
public class PedidoService {
    private final PedidoRepository pedidoRepository;
    private final ClienteRepository clienteRepository;
    private final AutomovelRepository automovelRepository;
    private final UsuarioRepository usuarioRepository;

    @Autowired
    public PedidoService(PedidoRepository pedidoRepository, ClienteRepository clienteRepository, AutomovelRepository automovelRepository, UsuarioRepository usuarioRepository) {
        this.pedidoRepository = pedidoRepository;
        this.clienteRepository = clienteRepository;
        this.automovelRepository = automovelRepository;
        this.usuarioRepository = usuarioRepository;
    }

    public Pedido criarPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }

    public List<Pedido> visualizarPedidos(Cliente cliente) {
        return pedidoRepository.findByUsuario(cliente);
    }

    public void menu(Scanner sc) {
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("\n Ações: ");
            System.out.println("0 - Sair");
            System.out.println("1 - Criar Pedido");
            System.out.println("2 - Status do Pedido");
            System.out.println("3 - Ver pedidos");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    this.Register(sc);
                    break;
                case 2:
                    this.Status(sc);
                    break;
                case 3:
                    this.Show();
                    break;
                case 0:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        sc.close();
    }

    private void Register(Scanner sc) {
        try {
            System.out.println("Digite o numero do pedido: ");
            long id = sc.nextLong();

            System.out.println("Digite o ID do cliente: ");
            long idCliente = sc.nextLong();


            Usuario usuario = usuarioRepository.findById(idCliente)
                    .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

            System.out.println("Digite o ID do automovel: ");
            long idAutomovel = sc.nextLong();


            Automovel automovel = automovelRepository.findById(idAutomovel)
                    .orElseThrow(() -> new RuntimeException("Automovel não encontrado"));


            Pedido pedido = new Pedido(id, usuario, automovel);
            criarPedido(pedido);

            System.out.println("Pedido criado com sucesso!");
        } catch (RuntimeException e) {
            System.out.println("Erro ao criar pedido: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        }
    }



    private void Show() {
        Iterable<Pedido> pedidos = pedidoRepository.findAll();
        pedidos.forEach(System.out::println);
    }

    private void Status(Scanner sc) {
        System.out.println("Digite o número do pedido para alterar o status: ");
        long id = sc.nextLong();
        System.out.println("Digite o novo status do pedido: ");
        String novoStatus = sc.next();

        alterarStatusPedido(id, novoStatus);
    }

    private void alterarStatusPedido(long id, String novoStatus) {
        Optional<Pedido> pedidoOpt = pedidoRepository.findById(id);
        if (pedidoOpt.isPresent()) {
            Pedido pedido = pedidoOpt.get();
            pedido.setStatus(novoStatus);
            pedidoRepository.save(pedido);
            System.out.println("Status do pedido atualizado com sucesso.");
        } else {
            System.out.println("Pedido não encontrado.");
        }
    }
}
