package Concretes;

import Abstracts.BaseCustomerManager;
import Abstracts.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	private CustomerCheckService checkService;

	public StarbucksCustomerManager(CustomerCheckService checkService) {
		super();
		this.checkService = checkService;
	}
	public void save(Customer customer) {
		if(checkService.checkIfRealPerson(customer)) {
			System.out.println("save to db: "+customer.getFirstName());
		}else {
			System.out.println("Geçersiz Bilgiler");
		}
	}
	
}
