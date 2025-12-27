public class Main {
    public static void main(String[] args) {

        Professor prof = new Professor("Chico Bento", "Programação");
        Curso curso = new Curso("Desenvolvimento de Sistemas", prof);

        curso.detalhes();
    }
}
