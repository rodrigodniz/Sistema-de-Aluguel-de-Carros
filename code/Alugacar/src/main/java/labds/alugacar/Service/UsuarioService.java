package labds.alugacar.Service;

import labds.alugacar.ORM.Cliente;
import labds.alugacar.ORM.Usuario;
import labds.alugacar.Repository.ClienteRepository;
import labds.alugacar.Repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

@Service
public class UsuarioService {
    private final ClienteRepository clienteRepository;
    private final UsuarioRepository usuarioRepository;

    @Autowired
    public UsuarioService(ClienteRepository clienteRepository, UsuarioRepository usuarioRepository) {
        this.clienteRepository = clienteRepository;
        this.usuarioRepository = usuarioRepository;
    }

    public void menu(Scanner sc) throws IOException {
        boolean isTrue = true;

        while (isTrue) {
            System.out.println("\n Ações: ");
            System.out.println("0 - Voltar");
            System.out.println("1 - Cadastrar usuario: ");
            System.out.println("2 - Excluir usuario:");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    this.Register(sc);
                    break;
                case 2:
                    this.Delete(sc);
                    break;
                default:
                    isTrue = false;
                    break;
            }
        }
    }

    public void Register(Scanner sc) throws IOException {
        sc.nextLine();

        System.out.println("Digite o nome do usuario: ");
        String nome = sc.nextLine();

        System.out.println("Digite o RG ");
        String rg = sc.nextLine();

        System.out.println("Digite o CPF ");
        String cpf = sc.nextLine();

        System.out.println("Digite o Endereço");
        String endereco = sc.nextLine();

        System.out.println("1- Cliente 2- Agente");
        int num = sc.nextInt();

        if (num == 1) {
            Cliente cliente = new Cliente(nome, rg, cpf, endereco);
            clienteRepository.save(cliente);
        } else if (num == 2) {

        }
        System.out.println("Usuario salvo!");
    }


    public List<Usuario> Show(Scanner sc) {
        return usuarioRepository.findAll();
    }

    public void Delete(Scanner sc) {
        System.out.println("Digite o id do usuario: ");
        long id = sc.nextInt();
        usuarioRepository.deleteById(id);
        System.out.println("Usuario deletado!");
    }
}
