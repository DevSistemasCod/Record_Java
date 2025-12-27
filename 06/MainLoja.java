public class MainLoja {
    public static void main(String[] args) {
        Loja loja = new Loja();

        Item item1 = new Item("Notebook", 3500.0);
        loja.adicionarItem(item1);

        Item item2 = new Item("Mouse", 80.0);
        loja.adicionarItem(item2);

        Item item3 = new Item("Monitor", 1200.0);
        loja.adicionarItem(item3);

        loja.listarItens();
    }
}
