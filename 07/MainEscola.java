public class MainEscola {
    public static void main(String[] args) {

        Escola escola = new Escola();

        escola.adicionarAluno(new Aluno("Hector", 8.0));
        escola.adicionarAluno(new Aluno("Pedro", 5.0));
        escola.adicionarAluno(new Aluno("Flavia", 6.5));

        escola.listarTodos();
        System.out.println();
        escola.listarAprovados();
    }
}
