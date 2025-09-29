import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> teste = new ArrayList<>();
        Pilha pilha = new Pilha(teste);

        // Vai dar erro.
        // System.out.println("°1");
        // System.out.println(pilha.popar());

        System.out.println("\n°2");
        System.out.printf(pilha.empilhar("a"));

        System.out.println("\n°3");
        System.out.println(pilha.empilhar("c"));

        System.out.println("\n°4");
        System.out.println(pilha.topo());

        System.out.println("\n°5");
        System.out.println(pilha.tamanho());

        System.out.println("\n°6");
        System.out.println(pilha.empilhar("g"));

        System.out.println("\n°7");
        System.out.println(pilha.popar());

        System.out.println("\n°8");
        System.out.println(pilha.empilhar("m"));

        System.out.println("\n°9");
        System.out.println(pilha.popar());

        System.out.println("\n°10");
        System.out.println(pilha.topo());

        System.out.println("\n°11");
        System.out.println(pilha.popar());

        System.out.println("\n°12");
        System.out.println(pilha.popar());

        System.out.println("\n°13");
        System.out.println(pilha.vazio());
    }
}