package entities;
public class Account {

    private int numeroConta;
    private String nomeTitular;
    protected double saldo;

    public Account(){}
    public Account(int numeroConta, String nomeTitular, double valorDeposito){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        deposito(valorDeposito);
    }
    public Account(int numeroConta, String nomeTitular){
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
    }
    public int getNumeroConta() {
        return this.numeroConta;
    }
    public String getNomeTitular() {
        return this.nomeTitular;
    }
    public void setNomeTitular(String nomeTitular) {
        this.nomeTitular = nomeTitular;
    }
    public double getSaldo() {
        return this.saldo;
    }
    public void deposito(double valorDeposito){
        this.saldo += valorDeposito;
    }
    public void saque(double valorSaque){
        this.saldo -= valorSaque + 5.0;
    }
    public String toString(){
        return "Account " + this.numeroConta + ", Titular: " + this.nomeTitular
                + ", Saldo: $ " + String.format("%.2f", this.saldo);
    }
}
