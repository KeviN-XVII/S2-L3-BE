import com.github.javafaker.Faker;
import entities.Customer;
import entities.Order;
import entities.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Order> orders = new ArrayList<>();

        customers.add(new Customer("Kevin"));
        customers.add(new Customer("Umberto"));
        customers.add(new Customer("Daniele"));
        customers.add(new Customer("Marco"));
        customers.add(new Customer("Gianni"));
        customers.add(new Customer("Fabio"));


        products.add(new Product("Ps5","Boys"));
        products.add(new Product("Ciuccio","Baby"));
        products.add(new Product("Il vaggio di nessuno","Books"));
        products.add(new Product("Come perdere al Fantacalcio","Books"));
        products.add(new Product("Culla","Baby"));
        products.add(new Product("Televisione","Boys"));
        products.add(new Product("Lego Star Wars", "Boys"));
        products.add(new Product("Libro delle fiabe", "Books"));
        products.add(new Product("Passeggino Chicco", "Baby"));
        products.add(new Product("Harry Potter", "Books"));

//        ORDINE N1
        ArrayList<Product> carrelloKevin = new ArrayList();
        carrelloKevin.add(products.get(1));
        carrelloKevin.add(products.get(3));
        carrelloKevin.add(products.get(5));

        orders.add(new Order("Pagato",LocalDate.of(2021, 3, 5),carrelloKevin,customers.get(0)));

        //        ORDINE 2
        ArrayList<Product> carrelloUmberto = new ArrayList();
        carrelloKevin.add(products.get(2));
        carrelloKevin.add(products.get(4));
        carrelloKevin.add(products.get(6));
        carrelloKevin.add(products.get(8));

        orders.add(new Order("Pagato",LocalDate.of(2023, 7, 17),carrelloKevin,customers.get(1)));


        System.out.println("---------Customers");
        System.out.println(customers);
        System.out.println("---------Products");
        System.out.println(products);
        System.out.println("---------Orders");
        System.out.println(orders);

//        Esercizio 1
        System.out.println("---------------------ESERCIZIO 1-----------------");
        List<Product> listaBooks = products.stream()
                .filter(category->category.getCategory().equals("Books"))
                .filter(price->price.getPrice() > 100).toList();
        System.out.println(listaBooks);


        //        Esercizio 2
        System.out.println("---------------------ESERCIZIO 2-----------------");
        List<Order>listaBaby = products.stream()
                .filter(order->order.)
                .toList();



//        Esercizio 3
        System.out.println("---------------------ESERCIZIO 3-----------------");
        List<Product> listaBoys = products.stream()
                .filter(category->category.getCategory().equals("Boys"))
                .toList();
        listaBoys.forEach(price -> price.setPrice(price.getPrice()*0.9));
        System.out.println(listaBoys);


//        Esercizio 4
        System.out.println("---------------------ESERCIZIO 4-----------------");







    }
}