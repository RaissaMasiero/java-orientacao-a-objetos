package exercicioheranca;

public class Company extends Person{

    private Double numeroFuncionarios;

    public Company(){
        super();
    }

    public Company(String nome, Double rendaAnual, Double numeroFuncionarios) {
        super(nome, rendaAnual);
        this.numeroFuncionarios = numeroFuncionarios;
    }

    public Double getNumeroFuncionarios() {
        return numeroFuncionarios;
    }

    public void setNumeroFuncionarios(Double numeroFuncionarios) {
        this.numeroFuncionarios = numeroFuncionarios;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public double imposto() {
        double calculoImposto = 0.0;
        if(numeroFuncionarios < 10){
           calculoImposto = rendaAnual * 0.16;
        }else if(numeroFuncionarios >= 10){
           calculoImposto = rendaAnual * 0.14;
        }
        return calculoImposto;

    }
}
