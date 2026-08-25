
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(134, "Soap", 150, "Housecleaning");
        Product product2 = new Product(134, "Soap", 150, "Housecleaning");
        Product product3 = new Product(137, "Mop", 300, "Housecleaning");
        Product product4 = new Product();
        Product product5 = new Product(137, "White mop", 400, "Housecleaning");
        Product product6 = new Product();
        System.out.println("product1: " + product1);
        System.out.println("product2: " + product2);
        System.out.println("product3: " + product3);
        System.out.println("product4: " + product4);
        System.out.println("product5: " + product5);
        System.out.println("product1 = product2: " + product1.equals(product2));
        System.out.println("product2 = product3: " + product2.equals(product3));
        System.out.println("product3 = product1: " + product3.equals(product1));
        System.out.println("product4 = product1: " + product4.equals(product1));
        System.out.println("product5 = product3: " + product5.equals(product3));
        System.out.println("product1 = product1: " + product1.equals(product1));
        Order order1 = new Order("Sarah", new Product[]{product1, product3});
        Order order2 = new Order("Jonn", new Product[]{product4, product2});
        Order order3 = new Order("Sarah", new Product[]{product1, product3});
        Order order4 = new Order("Sarah", new Product[]{});
        Order order5 = new Order("Sarah", new Product[]{});
        Order order6 = new Order("Sarah", new Product[]{product1, null});
        Order order7 = new Order("Sarah", new Product[]{product1, null});
        System.out.println("order1: " + order1);
        System.out.println("order2: " + order2);
        System.out.println("order3: " + order3);
        System.out.println("order4: " + order4);
        System.out.println("order5: " + order5);
        System.out.println("order6: " + order6);
        System.out.println("order7: " + order7);
        System.out.println("order2 = order1: " + order2.equals(order1));
        System.out.println("order1 = order3: " + order1.equals(order3));
        System.out.println("order3 = order2: " + order3.equals(order2));
        System.out.println("order5 = order4: " + order5.equals(order4));
        System.out.println("order6 = order7: " + order6.equals(order7));
    }
}