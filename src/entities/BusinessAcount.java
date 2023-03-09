package entities;

public class BusinessAcount extends Account{

    private Double limiteEmprestimo;

    public BusinessAcount(){
        super();
    }

    public BusinessAcount(int numeroConta, String nomeTitular, Double valorDeposito, Double limiteEmprestimo) {
        super(numeroConta, nomeTitular, valorDeposito);
        this.limiteEmprestimo = limiteEmprestimo;
    }

    public Double getLimiteEmprestimo() {
        return limiteEmprestimo;
    }

    public void setLimiteEmprestimo(Double limiteEmprestimo) {
        this.limiteEmprestimo = limiteEmprestimo;
    }

    @Override
    public void saque(double valorSaque){
        super.saque(valorSaque);
        saldo -= 2.0;
    }

    public void emprestimo(double valor){
        if(valor <= limiteEmprestimo){
            saldo += valor - 10.0;
        }
    }
}
