public class Curso {

    private String nome;
    private Professor professor;

    public Curso(String nome, Professor professor) {
        this.nome = nome;
        this.professor = professor;
    }

    public void detalhes() {
        System.out.println("Curso: " + nome);
        System.out.println("Professor: " + professor.nome());
        System.out.println("Disciplina: " + professor.disciplina());
    }
}
