import java.util.ArrayList;

public class Pilha {
    private ArrayList<String> pilha = new ArrayList<>();

    public ArrayList<String> getPilha() {
        return pilha;
    }

    public void setPilha(ArrayList<String> pilha) {
        this.pilha = pilha;
    }

    public String empilhar(String item) {
        pilha.add(item);
        return "Empilhado!";
    }

    public int tamanho() {
        return pilha.size();
    }

    public String topo() {
        return pilha.getLast();
    }

    public String popar() {
        return pilha.removeLast();
    }

    public boolean vazio() {
        return pilha.isEmpty();
    }
}
