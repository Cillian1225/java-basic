package ref.ex;

import ref.ex.ProductOrder;

public class ProductOrderMain {
    public static void main(String[] args) {
        ProductOrder[] orders = new ProductOrder[3];
        orders[0] = creatOrder("두부", 5000, 2);
        orders[1] = creatOrder("김치", 4000, 1);
        orders[2] = creatOrder("콜라", 1500, 1);
        printOrders(orders);
       int totalAmount =  getTotalAmount(orders);
        System.out.println("총결제금액은 : " + totalAmount + " 입니다.");
    }

    static ProductOrder creatOrder(String productName, int price, int quantity) {
        ProductOrder order = new ProductOrder();
        order.productName = productName;
        order.price = price;
        order.quantity = quantity;
        return order;
    }

    static void printOrders(ProductOrder[] orders) {
        for (ProductOrder order : orders) {
            System.out.println("상품명 " + order.productName + " 가격 : " + order.price + "수량: " + order.quantity);
//
        }
//
    }

    static int getTotalAmount(ProductOrder[] orders) {
        int totalAmount = 0;
        for (ProductOrder order : orders) {
            totalAmount += order.price * order.quantity;
        }

        return totalAmount;
    }
}