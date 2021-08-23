package orientacaoaobjetosjava.bancoExAlura;

import orientacaoaobjetosjava.bancoExAlura.Conta;
import orientacaoaobjetosjava.bancoExAlura.Cliente;

public class Programa {

    public static void main(String[] args) {

        Conta conta = new Conta();

        Cliente cliente = new Cliente();

        conta.titular = cliente;

    }

}
