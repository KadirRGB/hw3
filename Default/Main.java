package Default;

import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseCustomerManager customerManager = new NeroCustomerManager();
		customerManager.save(new Customer(12, "kadir","enes", LocalDate.of(2001, 10, 12),"1241212"));
	}

}
