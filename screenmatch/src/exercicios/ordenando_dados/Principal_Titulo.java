package exercicios.ordenando_dados;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Principal_Titulo {
    public static void main(String[] args) {

        ArrayList<Titulo> listaTitulos = new ArrayList<>();

        listaTitulos.add(new Titulo ("Titulo 1"));
        listaTitulos.add(new Titulo ("Titulo 9"));
        listaTitulos.add(new Titulo ("Titulo 8"));
        listaTitulos.add(new Titulo ("Titulo 4"));

        Collections.sort(listaTitulos);

        for (Titulo titulo : listaTitulos) {

            System.out.println(listaTitulos);
            
        }

    }
}
