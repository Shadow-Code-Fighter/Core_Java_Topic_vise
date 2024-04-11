package StreamApi.practice_code;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Grouping {
    public static void main(String[] args) {
        List<Transaction> transactions = Arrays.asList(
            new Transaction("apple",10),
            new Transaction("banana",20),
            new Transaction("apple", 16),
            new Transaction("banana", 26),
            new Transaction("orange", 36)
        );

        Map<String, Double> totalSalesProduct = transactions.stream().collect(Collectors.groupingBy(t->t.getProduct(),Collectors.summingDouble(t->t.getPrice())));
        System.out.println(totalSalesProduct);
    }
}


class Transaction{
    private String product;
    private double price;

    public Transaction(String product,double price){
        this.product=product;
        this.price=price;
    }
    public String getProduct() {
        return product;
    }
    public void setProduct(String product) {
        this.product = product;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    
}