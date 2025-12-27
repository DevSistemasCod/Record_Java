public record Pessoa(String nome, int idade) {

    public Pessoa {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }

        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa.");
        }
    }
}
