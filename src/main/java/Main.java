import model.Cliente;
import model.Seguro;
import service.ClienteService;
import service.SeguroService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ClienteService clienteService = ClienteService.getInstance();
        SeguroService seguroService = SeguroService.getInstance();

        // Menu para interações
        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar Cliente");
            System.out.println("2. Listar Clientes");
            System.out.println("3. Cadastrar Seguro");
            System.out.println("4. Listar Seguros");
            System.out.println("5. Sair");
            System.out.print("Opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir a nova linha

            switch (opcao) {
                case 1:
                    // Cadastrar Cliente
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Endereço: ");
                    String endereco = scanner.nextLine();

                    Cliente cliente = new Cliente(nome, cpf, endereco);
                    clienteService.salvarCliente(cliente);
                    break;

                case 2:
                    // Listar Clientes
                    System.out.println("Clientes cadastrados:");
                    clienteService.listarClientes().forEach(c -> System.out.println(c.getNome()));
                    break;

                case 3:
                    // Cadastrar Seguro
                    System.out.print("Tipo de Seguro: ");
                    String tipo = scanner.nextLine();
                    System.out.print("Valor: ");
                    double valor = scanner.nextDouble();
                    scanner.nextLine(); // Consumir a nova linha

                    Seguro seguro = new Seguro(tipo, valor);
                    seguroService.salvarSeguro(seguro);
                    break;

                case 4:
                    // Listar Seguros
                    System.out.println("Seguros cadastrados:");
                    seguroService.listarSeguros().forEach(s -> System.out.println(s.getTipo()));
                    break;

                case 5:
                    // Sair
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
