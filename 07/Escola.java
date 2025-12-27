import java.util.ArrayList;

public class Escola {

    private ArrayList<Aluno> alunos = new ArrayList<>();

    public void adicionarAluno(Aluno a) {
        alunos.add(a);
    }

    public void listarTodos() {
        System.out.println("Todos os alunos:");
        for (Aluno a : alunos) {
            System.out.println(a.nome() + " - Nota: " + a.nota());
        }
    }

    public void listarAprovados() {
        System.out.println("Alunos aprovados:");
        for (Aluno a : alunos) {
            if (a.nota() >= 5) {
                System.out.println(a.nome() + " - Nota: " + a.nota());
            }
        }
    }
}
