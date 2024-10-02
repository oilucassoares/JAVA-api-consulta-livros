package exercicios.ordenando_dados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_Polimorfismo {
    public static void main(String[] args) {

        List<String> listaPolimorfismo;

        listaPolimorfismo = new ArrayList<>();

            listaPolimorfismo.add("Elemento 1 - Polimorfismo");
            listaPolimorfismo.add("Elemento 2 - Polimorfismo");
            System.out.println("ArrayList: " + listaPolimorfismo);

        listaPolimorfismo = new LinkedList<>();

            listaPolimorfismo.add("Elemento 3 - Polimorfismo");
            listaPolimorfismo.add("Elemento 4 - Polimorfismo");
            System.out.println("LinkedList: " + listaPolimorfismo);

    }
}
