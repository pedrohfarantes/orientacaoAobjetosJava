package Exercicio01Alura;

public class TestaBanco {

    public static void main(String[] args) {

        Conta c1 = new Conta();

        c1.agencia = "1234";
        c1.dataAbertura = "12/03/2021";
        c1.nome = "Pedro";
        c1.numero = 1;
        c1.saldo = 10000.0;

        System.out.println("Saldo inicial: " + c1.saldo);

        c1.deposita(5000.0);

        System.out.println("Saldo após o depósito: " + c1.saldo);

        c1.saca(500.0);

        System.out.println("Saldo após o saque: " + c1.saldo);

        System.out.println("Rendimentos: " + c1.calculaRendimento());
    }

}
