package exercicios.lista_obj_distintos;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Principal_ContaBancaria {
    public static void main(String[] args) {

        ContaBancaria conta1 = new ContaBancaria(123, 200, "conta 1");
        ContaBancaria conta2 = new ContaBancaria(456, 400, "conta 2");
        ContaBancaria conta3 = new ContaBancaria(789, 6000, "conta 3");
        ContaBancaria conta4 = new ContaBancaria(101112, 800, "conta 4");

        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        contas.add(conta4);

        ContaBancaria maiorSaldo = contas.get(0);
        for (ContaBancaria conta : contas) {
            if (conta.getSaldo() > maiorSaldo.getSaldo()) {
                maiorSaldo = conta;
            }
        }

        System.out.println("Conta com o maior saldo é: " + maiorSaldo);

    }
}
