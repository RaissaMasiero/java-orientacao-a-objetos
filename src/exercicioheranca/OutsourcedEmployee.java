package exercicioheranca;
public class OutsourcedEmployee extends Employee{

    private Double cargaAdicional;

    public OutsourcedEmployee(){
        super();
    }

    public OutsourcedEmployee(String nome, Integer horas, Double valorPorHora, Double cargaAdicional) {
        super(nome, horas, valorPorHora);
        this.cargaAdicional = cargaAdicional;
    }

    public Double getCargaAdicional() {
        return cargaAdicional;
    }

    public void setCargaAdicional(Double cargaAdicional) {
        this.cargaAdicional = cargaAdicional;
    }

    @Override
    public double pagamento(){
        return super.pagamento() + cargaAdicional * 1.1;
    }
}
