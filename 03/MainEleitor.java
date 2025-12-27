public class MainEleitor {
    public static void main(String[] args) {
        try {
            Eleitor e1 = new Eleitor("Pedro", "brasileiro", 20);
            System.out.println("Eleitor válido: " + e1);
        } catch (Exception ex) {
            System.out.println("Erro ao criar eleitor 1: " + ex.getMessage());
        }

        try {
            // Eleitor inválido
            Eleitor e2 = new Eleitor("", "argentino", 14);
            System.out.println("Eleitor válido: " + e2);
        } catch (Exception ex) {
            System.out.println("Erro ao criar eleitor 2: " + ex.getMessage());
        }
    }
}
