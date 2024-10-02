package exercicios.lista_obj_distintos;

public class ContaBancaria {

    //ATRIBUTOS
    private int numeroConta;
    private double saldo;
    private String nome;

    public ContaBancaria(int numeroConta, double saldo, String nome) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
        this.nome = nome;
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }


    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "\nNúmero da conta: " + numeroConta + ".\nSaldo de R$ " + saldo + "\nNome da conta: " + nome;
    }
}
