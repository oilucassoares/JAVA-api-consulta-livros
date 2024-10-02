package exercicios.colecoes_filmes;

import java.util.ArrayList;

public class Principal_Pessoa {
    public static void main(String[] args) {

        //Criando o ArrayList para a lista de pessoas
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa("Lucas", 27);
        Pessoa pessoa2 = new Pessoa("Gabriel", 17);
        Pessoa pessoa3 = new Pessoa("Karol", 26);

        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println(">>Tamanho da lista de pessoas: " + listaDePessoas.size());
        System.out.println("\n>>Primeira pessoa da listagem: " + listaDePessoas.get(0));
        System.out.println("\n>>Lista completa das pessoas: " + listaDePessoas);

    }
}
