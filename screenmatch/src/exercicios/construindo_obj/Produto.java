package exercicios.construindo_obj;

public class Produto {

    //ATRIBUTOS
    private String nome;
    private double preco;
    private int quantidade;


    //CONSTRUTOR
    public Produto (String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;

    }

    @Override
    public String toString() {
        return "\n[Produto: " + nome + "]---[Preço: R$ " + preco + "]---[Quantidade: " + quantidade + "]";
    }
}
