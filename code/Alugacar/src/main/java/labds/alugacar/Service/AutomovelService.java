package labds.alugacar.Service;

import labds.alugacar.ORM.Automovel;
import labds.alugacar.Repository.AutomovelRepository;
import org.springframework.stereotype.Service;
import java.util.Scanner;

@Service
public class AutomovelService {
    private final AutomovelRepository automovelRepository;

    public AutomovelService(AutomovelRepository automovelRepository) {
        this.automovelRepository = automovelRepository;
    }

    public void menu(Scanner sc) {
        boolean isTrue = true;

        while (isTrue) {
            System.out.println("\n Ações: ");
            System.out.println("0 - Sair");
            System.out.println("1 - Criar Automóvel");
            System.out.println("2 - Ver Automóveis");

            int opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    this.Register(sc);
                    break;
                case 2:
                    this.Show();
                    break;

                default:
                    isTrue = false;
                    break;
            }
        }
    }

    private void Register(Scanner sc) {
        sc.nextLine();

        System.out.println("Digite as informações do automóvel:");

        System.out.println("Modelo: ");
        String modelo = sc.nextLine();

        System.out.println("Marca: ");
        String marca = sc.nextLine();

        System.out.println("Ano: ");
        String ano = sc.nextLine();

        System.out.println("Placa: ");
        String placa = sc.nextLine();

        Automovel automovel = new Automovel(modelo, marca, ano, placa);
        automovelRepository.save(automovel);
        System.out.println("Automóvel cadastrado com sucesso.");
    }

    private void Show() {

        Iterable<Automovel> automovels = this.automovelRepository.findAll();

        automovels.forEach(System.out::println);
        }
    }

