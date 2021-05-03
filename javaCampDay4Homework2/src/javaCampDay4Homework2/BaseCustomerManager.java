package javaCampDay4Homework2;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		
		System.out.println(customer.getFirstName() + " Saved to Db ");
		
	}

}
