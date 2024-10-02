package exercicios.lista_obj_distintos;

import java.util.ArrayList;

public class Principal_CalculoArea {
    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(5);

        Circulo circulo = new Circulo(6);

        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(new Quadrado(5));
        formas.add(new Circulo(6));

        for (Forma forma : formas) {
            forma.calcularArea();
            
        }

    }
}
