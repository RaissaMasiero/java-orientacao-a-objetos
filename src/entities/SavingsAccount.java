package entities;
public final class SavingsAccount extends Account{

    private Double taxaJuros;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(int numeroConta, String nomeTitular, double valorDeposito, Double taxaJuros) {
        super(numeroConta, nomeTitular, valorDeposito);
        this.taxaJuros = taxaJuros;
    }

    public Double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(Double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    @Override
    public void saque(double valorSaque){
        this.saldo -= valorSaque;
    }

    public void atualizarTaxa(){
        saldo += saldo * taxaJuros;
    }
}
