package exercicios.ordenando_dados.desafio_final;

public class Compras implements Comparable<Compras> { // implementando o Comparable para comparar as intancias

    private String descricao;
    private double valor;

    public Compras(double valor, String descricao) {
        this.valor = valor;
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
    public double getValor() {
        return valor;
    }

    // Metodo compareTo para comparar a compra ATUAL com outraCompra
    @Override
    public int compareTo(Compras outraCompra) {
        if (this.valor < outraCompra.valor) {   // Se o valor da compra atual for MENOR que a próxima compra, compra atual mostra 1º na lista
            return -1; // Aparece primeiro por isso -1
        }
        else if (this.valor > outraCompra.valor) {
            return 1; // Aparece depois da compra atual
        }
        else {
            return 0; // Valores iguais das duas compras.
        }
    }

    /*@Override
    public String toString() {
        return "Compras: descricao = " + descricao + "\nValor = " + valor;
    }*/
}
