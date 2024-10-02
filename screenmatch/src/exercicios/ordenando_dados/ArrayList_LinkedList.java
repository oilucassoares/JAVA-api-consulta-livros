package exercicios.ordenando_dados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayList_LinkedList {
    public static void main(String[] args) {

        List<String> listaList = new ArrayList<>();
        listaList.add("Lucas");
        listaList.add("Laurinha");
        listaList.add("Gabriel");

        LinkedList<Integer> idades = new LinkedList<>();
        idades.add(27);
        idades.add(8);
        idades.add(17);


        System.out.println("ArrayList: " + listaList);
        System.out.println("LinkedList " + idades);
    }
}
