package exercicioheranca;
public class Product {

    protected String nome;
    protected Double preco;

    public Product(){}

    public Product(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String etiquetaDePreco(){
        return nome + " $ " + String.format("%.2f", preco);
    }
}
