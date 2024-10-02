package exercicios.lista_obj_distintos;

import java.util.ArrayList;

public class ArrayList_Strings {
    public static void main(String[] args) {

        ArrayList<String> listaString = new ArrayList<>();

        listaString.add("Lucas");
        listaString.add("Karol");
        listaString.add("Laurinha");

        for (String lista : listaString) {
            System.out.println(lista);

        }
    }
}
