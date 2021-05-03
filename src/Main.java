

import java.rmi.RemoteException;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args){
		
		
		BaseCustomerManager baseCustomerManager =  new StarbucksCustomerManager(new MernisServiceAdapter());
		Customer customer1 = new Customer(1, "Umut", "Mtl", 1900, "11111111111");
		baseCustomerManager.save(customer1);
		
	}

}
