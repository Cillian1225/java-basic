package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력할 주문의 갯수를 입력하세요");
        int n = scanner.nextInt();
        scanner.nextLine();
        ProductOrder[] orders = new ProductOrder[n];

        for(int i = 0; i<orders.length;i++){
            System.out.println((i+1)+"번째 주문정보를 입력하세요.");

            System.out.print("상품명을 입력하세요.");
            String productName = scanner.nextLine();

            System.out.print("가격을 입력하세요.");
            int price = scanner.nextInt();

            System.out.print("수량을 입력하세요.");
            int quantity = scanner.nextInt();
            scanner.nextLine(); //버퍼 비우기;

            orders[i] = creatOrder(productName, price, quantity);
        }

        printOrders(orders);
        int totalAmount = getTotalAmount(orders);
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