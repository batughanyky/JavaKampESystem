import business.absracts.CustomerService;
import business.concretes.CustomerManager;
import dataAccess.concretes.FacebookDao;
import dataAccess.concretes.GoogleDao;
import entities.concretes.Customer;

public class Main {
	public static void main(String[] args) {
		CustomerService customerService = new CustomerManager(new GoogleDao());
		Customer customer = new Customer("batuhan","yalcinkaya","batughanyky333@gmail.com","190404");
		Customer customer2= new Customer("batuhan","yalcinkaya","batughanyky333@gmail.com","190404");
		Customer customer3 = new Customer("batuhan","yalcinkaya","batughanyky333@gmail.com","190404");
		Customer customer4 = new Customer("batuhan","yalcinkaya","batughanyky333@gmail.com","190404");
		Customer customer5 = new Customer("batuhan","yalcinkaya","batughanyky333@gmail.com","190404","");
		
		customerService.checkCustomer(customer);
		customerService.checkCustomerSinngIn(customer2);
		customerService.checkCustomerEmail(customer, customer3);
		customerService.checkCustomer(customer4);
		customerService.checkCustomer(customer5);
		
		System.out.println("\n-------------------------------------------------------------------------------------\n");
		
        CustomerService customerService2 = new CustomerManager(new FacebookDao());

		
		Customer customer6 = new Customer("batuhan","yalcinkaya","batughanyky333@gmail.com","190404");
		Customer customer7 = new Customer("batuhan","yalcinkaya","batughanyky333@gmail.com","190404");
		Customer customer8 = new Customer("batuhan","yalcinkaya","batughanyky333@gmail.com","190404");
		Customer customer9 = new Customer("batuhan","yalcinkaya","batughanyky333@gmail.com","190404");
		Customer customer10 = new Customer("batuhan","yalcinkaya","batughanyky333@gmail.com","190404","");

		customerService2.checkCustomer(customer6);
		customerService2.checkCustomerSinngIn(customer6);
		customerService2.checkCustomerEmail(customer6, customer8);
		customerService2.checkCustomer(customer9);
		customerService2.checkCustomer(customer10);
		
		
}
	
	

}
