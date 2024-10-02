package exercicios.construindo_obj;

import java.util.ArrayList;

public class Principal_Produto {
    public static void main(String[] args) {

        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Maça", 2, 1, "2024-09-15");


        //Criando uma lista de produtos
        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        Produto produto1 = new Produto("Notebook", 3500, 1);
        Produto produto2 = new Produto("Cadeira", 500, 1);
        Produto produto3 = new Produto("Fone", 200, 1);

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        System.out.println("Tamanho da lista: " + listaDeProdutos.size());
        System.out.println("\nSegundo produto da lista é: " + listaDeProdutos.get(1));
        System.out.println("\nLista completa dos produtos: " + listaDeProdutos);
        System.out.println("\nProduto perecível: " + produtoPerecivel);

    }
}
