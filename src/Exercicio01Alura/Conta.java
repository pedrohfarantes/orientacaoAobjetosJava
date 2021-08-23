/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio01Alura;

/**
 *
 * @author phfar
 */
public class Conta {

    String nome;
    int numero;
    String agencia;
    double saldo;
    String dataAbertura;

    boolean saca(double valor) {
        if (this.saldo < valor) {
            return false;
        } else {
            this.saldo = this.saldo - valor;
            return true;
        }
    }

    void deposita(double valor) {
        this.saldo += valor;
    }

    double calculaRendimento() {
        return this.saldo * 0.1;
    }

}
