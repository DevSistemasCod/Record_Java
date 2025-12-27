public class MainProduto {
    public static void main(String[] args) {
            Produto produto = new Produto("Notebook", 3500.0, 5);

            System.out.println("Nome: " + produto.nome());
            System.out.println("Preço: " + produto.preco());
            System.out.println("Quantidade: " + produto.quantidade());
    }
}
