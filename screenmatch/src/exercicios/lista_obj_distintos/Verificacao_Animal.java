package exercicios.lista_obj_distintos;

public class Verificacao_Animal {

    public static void main(String[] args) {

        Animal Animal = new Cachorro();

        if (Animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) Animal;
            cachorro.latir();
        }else {
            System.out.println("O objeto não é um Cachorro.");
        }
    }
}
