import Abstracts.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concretes.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"person_name","person_lastName","person_NationalityID",1923));
	}

}
