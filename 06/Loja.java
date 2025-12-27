import java.util.ArrayList;

public class Loja {

    private ArrayList<Item> itens = new ArrayList<>();

    public void adicionarItem(Item p) {
        itens.add(p);
    }

    public void listarItens() {
        for (Item i : itens) {
            System.out.println("Item: " + i.nome() + " | Preço: R$ " + i.preco());
        }
    }
}
