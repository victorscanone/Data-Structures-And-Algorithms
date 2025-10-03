import java.util.ArrayList;

public class Listas {
    private ArrayList<String> lista;

    public Listas() {
        this.lista = new ArrayList<String>();
    }

    public ArrayList<String> getLista() {
        return lista;
    }

    public void setLista(ArrayList<String> lista) {
        this.lista = lista;
    }

    public String inserir(String item) {
        lista.add(item);
        return "Inserido!";
    }

    public String tamanho() {
        return String.format("Tamanho = %d", lista.size());
    }

    public String remover(int item) {
        lista.remove(item);
        return String.format("Item do index %d removido!", item);
    }

    public String inserirNo(int index, String item) {
        lista.add(index, item);
        return String.format("Item %s inserido no index %d!", item, index);
    }

    public void acessar(int index) {
        lista.get(index);
    }
}
