package javaCampDay4Homework2;

import java.sql.Date;

import Adapter.MernisServiceAdapter;


public class Main {

	public static void main(String[] args) {
		BaseCustomerManager baseCustomerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer1 = new Customer(1, "Emrah", "Þensoy", "39494022000", new Date(1992,8,05));
		Customer customer2 = new Customer(2, "Ýbrahim", "Akançay", "25519194000", new Date(1988,8,05));
		baseCustomerManager.save(customer2);
			
		
			
	

	}

}
