package exercicioexcecoes;

import exception.ValueException;

public class Account {

    private Integer numeroConta;
    private String titular;
    private Double saldo;
    private Double limiteSaque;

    public Account(){}

    public Account(Integer numeroConta, String titular, Double saldo, Double limiteSaque) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteSaque = limiteSaque;
    }

    public Integer getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(Integer numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Double getLimiteSaque() {
        return limiteSaque;
    }

    public void setLimiteSaque(Double limiteSaque) {
        this.limiteSaque = limiteSaque;
    }

    public void deposito(double valor){
        saldo += valor;
    }

    public void saque(double valor){
        if(valor > limiteSaque){
           throw new ValueException("O valor excede o limite de saque!");
        }
        if(valor > saldo){
           throw new ValueException("Saldo insuficiente!");
        }
        saldo -= valor;
    }
}
