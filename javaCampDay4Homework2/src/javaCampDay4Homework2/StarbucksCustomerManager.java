package javaCampDay4Homework2;

public class StarbucksCustomerManager extends BaseCustomerManager {

	CustomerCheckService customerCheckService;

	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		super();
		this.customerCheckService = customerCheckService;
	}

	public void save(Customer customer) {
		if (customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
			System.out.println("Dogrulama basarili!");
		} else {
			System.out.println("Lutfen bilgilerinizi kontrol ediniz!");
		}
	}

}
