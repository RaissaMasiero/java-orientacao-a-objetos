package entities.exerciciocomposicao;

import entities.enums.OrderStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class ProgramOrder {

    public static void main(String[] args) {

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite os dados do cliente:");
        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("Data de nascimento(DD/MM/YYYY): ");
        LocalDate nascimento = LocalDate.parse(sc.next(), dtf);

        Client cliente = new Client(nome, email, nascimento);

        System.out.println("Digite os dados do pedido:");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());

        Order pedido = new Order(LocalDateTime.now(), status, cliente);

        System.out.print("Quantos itens no pedido: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("Dados do pedido #" + i);
            System.out.print("Nome: ");
            sc.nextLine();
            String nomeProduto = sc.nextLine();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            Product produto = new Product(nomeProduto, preco);
            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();
            OrderItem itemPedido = new OrderItem(quantidade, preco, produto);
            pedido.addItem(itemPedido);
        }

        System.out.println();
        System.out.println("DESCRIÇÃO DO PEDIDO:");
        System.out.println(pedido);

        sc.close();
    }
}
