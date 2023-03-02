package application;

import entities.Order;
import entities.enums.OrderStatus;

import java.util.Date;

public class ProgramOrder {

    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PAGAMENTO_PENDENTE);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.ENTREGUE;
        OrderStatus os2 = OrderStatus.valueOf("ENTREGUE");

        System.out.println(os1);
        System.out.println(os2);
    }
}
