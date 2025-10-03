import java.util.ArrayList;

public class Fila {
    private ArrayList<Character> fila;

    public Fila() {
        this.fila = new ArrayList<Character>();
    }

    public void setFila(ArrayList<Character> fila) {
        this.fila = fila;
    }

    public ArrayList<Character> getFila() {
        return fila;
    }

    public String enfileirar(char item) {
        fila.add(item);
        return String.format("%s adicionado à fila!", item);
    }

    public String desenfileirar() {
        char removido = fila.getFirst();
        fila.removeFirst();
        return String.format("%s foi desenfileirado!",removido);
    }

    public String cabeca() {
        return String.format("%s é o head da fila!", fila.getFirst());
    }

    public String tamanho() {
        return String.format("O tamanho da fila é: %d", fila.size());
    }

    public String vazio() {
        return String.format("Vazio: %B", fila.isEmpty());
    }
}
