package exercicios.construindo_obj;

public class ProdutoPerecivel extends Produto {

    //ATRIBUTO
    private String dataValidade;

    //Construtor da classe mãe(super)
    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return super.toString() + "---[Data de Validade: " + dataValidade + " ]";
    }
}
