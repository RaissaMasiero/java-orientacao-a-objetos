package exercicioheranca;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProgramProduct {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ArrayList<>();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Número de produtos: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("Dados do Produto #" + i);
            System.out.print("Comum, usado ou importado (c/u/i): ");
            char ch = sc.next().charAt(0);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            if(ch == 'i') {
                System.out.print("Taxa da alfândega: ");
                double taxaAlfandega = sc.nextDouble();
                Product product = new ImportedProduct(nome, preco, taxaAlfandega);
                list.add(product);

            }else if(ch == 'u'){
                System.out.print("Data de fabricação (DD/MM/YYYY): ");
                LocalDate dataFabricacao = LocalDate.parse(sc.next(), dtf);
                Product product = new UsedProduct(nome, preco, dataFabricacao);
                list.add(product);
            }else{
                Product product = new Product(nome, preco);
                list.add(product);
            }
        }

        System.out.println();
        System.out.println("ETIQUETAS DE PREÇO:");

        for(Product product : list){
            System.out.println(product.etiquetaDePreco());
        }

        sc.close();
    }
}
