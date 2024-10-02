package exercicios.ordenando_dados;

import java.util.ArrayList;
import java.util.Collections;

public class Principal_Numeros_Inteiros {
    public static void main(String[] args) {

        // Criando o objeto da lista
        ArrayList<Integer> numerosInteiros = new ArrayList<Integer>();

        // Adicionando a lista
        numerosInteiros.add(9);
        numerosInteiros.add(15);
        numerosInteiros.add(24);
        numerosInteiros.add(2);
        numerosInteiros.add(5);

        System.out.println("Lista dos números fora de ordem: " + numerosInteiros);

        // Ordenar a lista em ordem crescente
        Collections.sort(numerosInteiros);

        System.out.println("Lista dos números ordem crescente: " + numerosInteiros);

    }
}
