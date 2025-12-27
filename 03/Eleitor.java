public record Eleitor(String nome, String nacionalidade, int idade) {

    public Eleitor {

        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome inválido!");
        }

        if (nacionalidade == null ||
                (!nacionalidade.equalsIgnoreCase("brasileiro") &&
                        !nacionalidade.equalsIgnoreCase("brasileira"))) {
            throw new IllegalArgumentException("Nacionalidade deve ser 'brasileiro' ou 'brasileira'.");
        }

        if (idade < 16) {
            throw new IllegalArgumentException("Idade mínima para ser eleitor é 16 anos.");
        }
    }
}