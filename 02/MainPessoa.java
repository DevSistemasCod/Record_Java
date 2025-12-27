import java.util.InputMismatchException;
import java.util.Scanner;

public class MainPessoa {
    public static int validarIdade(Scanner lerDados) throws InputMismatchException {
        System.out.print("Informe a idade: ");

        try {
            return lerDados.nextInt();
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Deve ser informado um número inteiro!");
        }
    }

    public static void main(String[] args) {
        String nome;
        int idade;
        Scanner lerDados = new Scanner(System.in);
        System.out.println("Informe o nome: ");
        nome = lerDados.nextLine();

        try {
            idade = validarIdade(lerDados);
            Pessoa pessoa = new Pessoa(nome, idade);
            System.out.println("Dados da Pessoa: " + pessoa.toString());

        } catch (InputMismatchException e){
            System.err.println("Entrada inválida: " + e.getMessage());
        }
        catch ( IllegalArgumentException e) {
            System.err.println("Entrada inválida: " + e.getMessage());
        }

        lerDados.close();
    }
}
