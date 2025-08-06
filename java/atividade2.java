
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class atividade2  {

    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        System.out.println("Lista original: " + numeros);

        Collections.reverse(numeros);
        System.out.println("Lista invertida (Collections.reverse()): " + numeros);

        List<Integer> numerosInvertidos = new ArrayList<>();
        for (int i = numeros.size() - 1; i >= 0; i--) {
            numerosInvertidos.add(numeros.get(i));
        }
        System.out.println("Lista invertida (nova lista): " + numerosInvertidos);
    }
}

//2.Crie um programa que leia 5 nomes do teclado e os armazene em um ArrayList. Depois, imprima todos os nomes em ordem inversa.