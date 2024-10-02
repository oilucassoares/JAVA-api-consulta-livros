package exercicios.ordenando_dados.desafio_final;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Informe o limite do cartão: R$ ");
        double limite = leitura.nextDouble();
        Cartao_Credito cartao = new Cartao_Credito(limite);

        int sair = 1;
        while (sair != 0) {
            System.out.println("Digite a descrição do produto: ");
            String descricao = leitura.next();

            System.out.println("Digite o valor do produto: R$ ");
            double valor = leitura.nextDouble();

            Compras compras = new Compras(valor, descricao);
            boolean compraRealizada = cartao.lancaCompras(compras);

            if (compraRealizada) {
                System.out.println("*****COMPRA REALIZADA!*****");
                System.out.println("-----------------------------------------");
                System.out.println("Escolha 0 ou 1: \n[0] - ENCERRAR COMPRAS \n[1] - CONTINUAR COMPRAS");
                System.out.println("-----------------------------------------");
                sair = leitura.nextInt();
            }
            else {
                System.out.println("SALDO INSUFICIENTE!");
                sair = 0;
            }
        }

        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS: \n");
        Collections.sort(cartao.getCompras()); // Ordenando por menor valor ao maior valor

        for (Compras compras : cartao.getCompras()) {
            System.out.println(compras.getDescricao() + " - " + compras.getValor());
        }
        System.out.println("***********************\n");

        System.out.println("--------------------------");
        System.out.println("Saldo do cartão: R$ " + cartao.getSaldo());
        System.out.println("--------------------------");

    }
}
