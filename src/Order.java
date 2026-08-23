import java.util.Arrays;

public class Order {
    private String customer;
    private Product[] basket;
    public Order(String customer, Product[] basket){
        this.customer = customer;
        this.basket = basket;
    }
    public boolean basketEquals(Product[] basket){
        if (this.basket.length != basket.length){
            return false;
        }
        for (int i = 0; i < basket.length; i++) {
            if (this.basket[i] != null  && this.basket[i].equals(basket[i])){
                continue;
            }
            else{
                return false;
            }
        }
        return true;
    }
    public String toString(){
        return "Покупатель " + customer + ", товары: " + Arrays.toString(basket);
    }
    public boolean equals(Object o){
        if (this == o){
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Order order = (Order) o;
        return this.customer.equals(order.customer)
                && this.basketEquals(order.basket);
    }

}
