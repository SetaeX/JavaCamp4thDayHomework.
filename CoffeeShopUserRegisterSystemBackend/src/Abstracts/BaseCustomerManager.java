package Abstracts;

import Entities.Customer;

public class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("save to db: "+customer.getFirstName());
	}
	
}
