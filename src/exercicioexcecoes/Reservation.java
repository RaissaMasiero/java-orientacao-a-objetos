package exercicioexcecoes;

import exception.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer numeroQuarto;
    private Date dataEntrada;
    private Date dataSaida;
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(){}

    public Reservation(Integer numeroQuarto, Date dataEntrada, Date dataSaida){
        if(!dataSaida.after(dataEntrada)){
            throw new DomainException("Data de saída deve ser depois da data de entrada!");
        }
        this.numeroQuarto = numeroQuarto;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public Integer getNumeroQuarto() {
        return numeroQuarto;
    }

    public void setNumeroQuarto(Integer numeroQuarto) {
        this.numeroQuarto = numeroQuarto;
    }

    public Date getDataEntrada() {
        return dataEntrada;
    }

    public Date getDataSaida() {
        return dataSaida;
    }

    public long duracao(){
        long dif = dataSaida.getTime() - dataEntrada.getTime();
        return TimeUnit.DAYS.convert(dif, TimeUnit.MILLISECONDS);
    }

    public void atualizarDatas(Date dataEntrada, Date dataSaida){
        Date agora = new Date();
        if(dataEntrada.before(agora) || dataSaida.before(agora)){
            throw new DomainException("Datas de reserva para atualização devem ser datas futuras!");
        }
        if(!dataSaida.after(dataEntrada)){
            throw new DomainException("Data de saída deve ser depois da data de entrada!");
        }
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    @Override
    public String toString() {
        return "Quarto " + numeroQuarto + ", entrada: " + sdf.format(dataEntrada) +
                ", saída: " + sdf.format(dataSaida) + ", " + duracao() + " noites";
    }
}
