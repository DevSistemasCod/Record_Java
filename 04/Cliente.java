public class Cliente {

    private String nome;
    private Endereco endereco;

    public Cliente(String nome, Endereco endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("== Endereço ==");
        System.out.println("Bairro: " + endereco.bairro());
        System.out.println("Rua: " + endereco.rua());
        System.out.println("Número: " + endereco.numero());
        System.out.println("CEP: " + endereco.cep());
        System.out.println("Cidade: " + endereco.cidade());
        System.out.println("Cidade: " + endereco.estado());
    }
}

