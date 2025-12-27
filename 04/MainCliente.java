import java.util.Scanner;

public class MainCliente {

    public static void main(String[] args) {
        Scanner lerDados = new Scanner(System.in);
        Cliente cliente = null;
        int opcao;

        do {
            System.out.println("\n=== MENU CLIENTE ===");
            System.out.println("1 - Cadastrar cliente");
            System.out.println("2 - Mostrar dados");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = Integer.parseInt(lerDados.nextLine());

            switch (opcao) {
                case 1:
                    cliente = cadastrarCliente(lerDados);
                    break;

                case 2:
                    mostrarCliente(cliente);
                    break;

                case 3:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }

        } while (opcao != 3);

        lerDados.close();
    }

    private static Cliente cadastrarCliente(Scanner sc) {
        System.out.print("Nome do cliente: ");
        String nome = sc.nextLine();

        System.out.print("Bairro: ");
        String bairro = sc.nextLine();

        System.out.print("Rua: ");
        String rua = sc.nextLine();

        System.out.print("Número: ");
        int numero = Integer.parseInt(sc.nextLine());

        System.out.print("CEP: ");
        String cep = sc.nextLine();

        System.out.print("Cidade: ");
        String cidade = sc.nextLine();

        // escolha do estado via sigla
        Estado estado = null;
        while (estado == null) {
            System.out.print("Estado (sigla, ex: SP, RJ, MG): ");
            String sigla = sc.nextLine().trim().toUpperCase();

            estado = obterEstadoPorSigla(sigla);

            if (estado == null) {
                System.out.println("Sigla inválida! Tente novamente.");
            }
        }

        Endereco endereco = new Endereco(bairro, rua, numero, cep, cidade, estado);
        System.out.println("Cliente cadastrado com sucesso!");

        return new Cliente(nome, endereco);
    }

    private static Estado obterEstadoPorSigla(String sigla) {
        for (Estado e : Estado.values()) {
            if (e.getSigla().equalsIgnoreCase(sigla)) {
                return e;
            }
        }
        return null;
    }

    private static void mostrarCliente(Cliente cliente) {
        if (cliente == null) {
            System.out.println("Nenhum cliente cadastrado!");
        } else {
            cliente.mostrarDados();
        }
    }
}
