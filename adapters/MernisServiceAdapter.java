package adapters;

import java.rmi.RemoteException;

import abstracts.IPlayerCheckService;
import entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IPlayerCheckService {

	@Override
	public boolean checkIfRealPerson(Player player) {

		KPSPublicSoapProxy client = new KPSPublicSoapProxy();
		boolean result;
		try {
			result = client.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()),
					player.getFirstName().toUpperCase(), player.getLastName().toUpperCase(),
					player.getDataOfBirth().getYear());
			return result;
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NumberFormatException e) {
			e.printStackTrace();
		}
		return false;

	}
}
