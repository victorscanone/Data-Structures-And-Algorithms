import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pilha pilha = new Pilha();

        /*
        * 1) Levando em consideração uma pilha inicialmente
        * vazia e que as seguintes operações foram realizadas,
        * responda:
        *
        * 1. pop()
        * 2. push(p, 'a')
        * 3. push(p, 'c')
        * 4. top()
        * 5. size()
        * 6. push(p, 'g')
        * 7. pop()
        * 8. push(p, 'm')
        * 9. pop()
        * 10. top()
        * 11. pop()
        * 12. pop()
        * 13. empty()
        *
        * a) Qual o retorno do passo 1?
        * b) Qual o retorno do passo 4?
        * c) Qual o retorno do passo 5?
        * d) Qual o retorno do passo 10?
        * e) Qual o retorno do passo 13?
        * */

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

        /*
        * 2) Levando em consideração uma fila inicialmente vazia
        * e que as seguintes operações foram realizadas, responda:
        *
        * 1. dequeue()
        * 2. enqueue(f, b)
        * 3. dequeue()
        * 4. head()
        * 5. size()
        * 6. empty()
        * 7. enqueue(f, c)
        * 8. dequeue()
        * 9. enqueue(f, d)
        * 10. head()
        * 11. dequeue()
        * 12. dequeue()
        * 13. empty()
        *
        * a) Qual o retorno do passo 1?
        * b) Qual o retorno do passo 4?
        * c) Qual o retorno do passo 5?
        * d) Qual o retorno do passo 10?
        * e) Qual o retorno do passo 13?
        * */

        Fila fila = new Fila();

        // Vai dar erro, pois, não há o que retirar.
        // System.out.println("\n°1");
        // System.out.println(fila.desenfileirar());

        System.out.println("\n°2");
        System.out.println(fila.enfileirar('b'));

        System.out.println("\n°3");
        System.out.println(fila.desenfileirar());

        // Vai dar erro, pois, não há o que mostrar.
        // System.out.println("\n°4");
        // System.out.println(fila.cabeca());

        System.out.println("\n°5");
        System.out.println(fila.tamanho());

        System.out.println("\n°6");
        System.out.println(fila.vazio());

        System.out.println("\n°7");
        System.out.println(fila.enfileirar('c'));

        System.out.println("\n°8");
        System.out.println(fila.desenfileirar());

        System.out.println("\n°9");
        System.out.println(fila.enfileirar('d'));

        System.out.println("\n°10");
        System.out.println(fila.cabeca());

        System.out.println("\n°11");
        System.out.println(fila.desenfileirar());

        // Vai dar erro, pois, não há o que retirar.
        // System.out.println("\n°12");
        // System.out.println(fila.desenfileirar());

        System.out.println("\n°13");
        System.out.println(fila.vazio());
    }
}