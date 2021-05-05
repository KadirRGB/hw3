package Adapter;

import Abstract.ICustomerCheckService;
import Entities.Customer;

/*import java.rmi.RemoteException;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;*/

public class MernisServiceAdapter implements ICustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		/*
		 * KPSPublicSoapProxy client = new KPSPublicSoapProxy(); boolean result = true;
		 * try { result = client.TCKimlikNoDogrula(Long.
		 * parseLong(customer.getNationalityId()),
		 * customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(),
		 * customer.getDateOfBirth().getYear()); } catch (RemoteException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); } return result;
		 */
		return true;
	}

}
