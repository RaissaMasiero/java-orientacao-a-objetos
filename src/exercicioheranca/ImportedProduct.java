package exercicioheranca;
public class ImportedProduct extends Product{

    private Double taxaAlfandega;

    public ImportedProduct(){
        super();
    }

    public ImportedProduct(String nome, Double preco, Double taxaAlfandega) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }

    public Double getTaxaAlfandega() {
        return taxaAlfandega;
    }

    public void setTaxaAlfandega(Double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }

    public Double precoTotal(){
        return preco + taxaAlfandega;
    }

    @Override
    public String etiquetaDePreco(){
        return nome + " $ " + String.format("%.2f", precoTotal())
                    + " (Taxa alfândega: $ " + String.format("%.2f", taxaAlfandega) + ")";
    }
}
