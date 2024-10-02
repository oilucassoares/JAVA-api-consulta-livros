package exercicios.lista_obj_distintos;

public class Quadrado implements Forma {

    //ATRIBUTOS
    double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        double calculoArea = lado * lado;
        System.out.println("Área do Quadrado: " + calculoArea);
    }
}
