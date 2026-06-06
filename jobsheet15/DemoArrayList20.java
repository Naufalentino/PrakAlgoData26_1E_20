import java.util.ArrayList;
public class DemoArrayList20{
    public static void main(String[] args) {
        ArrayList<Customer20> customers = new ArrayList<>(2);
        
        Customer20 customer1 = new Customer20(1, "Zakia");
        Customer20 customer2 = new Customer20(2, "Budi");
        
        customers.add(customer1);
        customers.add(customer2);

        for (Customer20 cust : customers){
            System.out.println(cust.toString());
        }
    }
}