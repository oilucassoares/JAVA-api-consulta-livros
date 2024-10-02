package exercicios.lista_obj_distintos;

import java.util.ArrayList;

public class Principal_Produto {
    public static void main(String[] args) {

        Produto produto1 = new Produto("Notebook", 3500);
        Produto produto2 = new Produto("Fone", 300);
        Produto produto3 = new Produto("Mouse", 150);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);

        double soma = 0;
        for (Produto produto : listaProdutos) {
            soma += produto.getPreco();
        }

        double precoMedio = soma / listaProdutos.size();
        System.out.printf("O preço médio é R$ %.2f%n", precoMedio);

    }
}
