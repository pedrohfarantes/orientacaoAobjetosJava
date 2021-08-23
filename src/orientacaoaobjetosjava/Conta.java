package orientacaoaobjetosjava;

public class Conta {

    int numero;
    double saldo;
    Cliente titular;

    boolean saca(double quantidade) {
        if (this.saldo < quantidade) {
            return false;
        } else {
            this.saldo = this.saldo - quantidade;
            return true;
        }
    }

    void deposita(double quantidade) {
        this.saldo += quantidade;
    }

    boolean transfere(Conta destino, double quantidade) {
        boolean retirou = this.saca(quantidade);

        if (retirou == false) {
            return false;
        } else {
            destino.deposita(quantidade);
            return true;

        }
    }

}
