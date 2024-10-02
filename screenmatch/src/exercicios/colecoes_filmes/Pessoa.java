package exercicios.colecoes_filmes;

public class Pessoa {

    //ATRIBUTOS
    private String nome;
    private int idade;

    public Pessoa (String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    @Override
    public String toString() {
        return "\nNOME: " + nome + ". IDADE: " + idade + " anos.";
    }
}
