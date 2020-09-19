package Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Customer;

public class CustomerService {

		private Map<String, Customer> customerMap;
		
		public CustomerService() {
			
			customerMap = new HashMap<String, Customer> ();
			
			addCusttomer(new Customer("id001","alice","aclie.hansung.ac.kr"));
			addCusttomer(new Customer("id002","bob","bob.hansung.ac.kr"));
			addCusttomer(new Customer("id003","charlie","charlie.hansung.ac.kr"));
			addCusttomer(new Customer("id004","daniel","daniel.hansung.ac.kr"));
			addCusttomer(new Customer("id005","trudy","trudy.hansung.ac.kr"));
		}

		private void addCusttomer(Customer customer) {
			// TODO Auto-generated method stub
			customerMap.put(customer.getId(), customer);
			
		}
		
		public Customer findCustomer(String id) {
			if(id != null) 
				return(customerMap.get(id.toLowerCase()));
			else
			return null;
	}
		public List<Customer> getALlCustomers() {
			List<Customer> customerList = new ArrayList<Customer>(customerMap.values());
			
			return customerList;
			
		}
}

