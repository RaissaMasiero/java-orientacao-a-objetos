package exercicioheranca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product{

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    private LocalDate dataFabricacao;
    public UsedProduct(){
        super();
    }

    public UsedProduct(String nome, Double preco, LocalDate dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    public LocalDate getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(LocalDate dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String etiquetaDePreco(){
        return nome + " (usado) $ " + String.format("%.2f", preco)
                    + " (Data de fabricação: " + dtf.format(dataFabricacao) + ")";
    }
}
