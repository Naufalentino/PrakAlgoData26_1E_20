import java.util.ArrayList;
public class DemoArrayList20{
    public static void main(String[] args) {
        ArrayList<Customer20> customers = new ArrayList<>(2);
        
        Customer20 customer1 = new Customer20(1, "Zakia");
        Customer20 customer2 = new Customer20(5, "Budi");
        
        customers.add(customer1);
        customers.add(customer2);

        customers.add(new Customer20(4, "Cica"));
        
        customers.add(2, new Customer20(100, "Rosa"));
        
        System.out.println(customers.indexOf(customer2));
        
        Customer20 customer = customers.get(1);
        System.out.println(customer.name);
        customer.name = "Budi Utomo";
        
        for (Customer20 cust : customers){
            System.out.println(cust.toString());
        }
    }
}