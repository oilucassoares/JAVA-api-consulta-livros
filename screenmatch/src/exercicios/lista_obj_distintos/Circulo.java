package exercicios.lista_obj_distintos;

public class Circulo implements Forma {

    //ATRIBUTO
    double raio;

    //CONSTRUTOR
    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public void calcularArea() {
        double calculoArea = Math.PI * raio * raio;
        System.out.printf("Área do Círculo: %.2f%n", calculoArea);

    }
}
