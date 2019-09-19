package ex20;

import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class CustomerManager {

	private final Map<Integer,Card> cardMap = new HashMap<Integer,Card>();
	private final Set<String> set = new HashSet<String>();
	private int index = 0;
	
	
	public static void main(String[] args) {
		try {
		CustomerManager customerManager = new CustomerManager();
		customerManager.addCustomerCard("satoru konno","satoru@gmail.com");
		customerManager.addEmployeeCard("hasimotokanna","ilovesat@gmail.com");
		
		customerManager.printAll();
	}catch(Exception e) {
		System.out.println(e);
	}
	}
		
	void addCustomerCard(String name, String mailAddress)throws Exception{
		if(this.cardMap.size()>5){
			throw new Exception("you can add card less than 5");
		}
		if(set.contains(mailAddress)==true) {
			throw new Exception("address doubled");
		}
		
		set.add(mailAddress);
		CustomerCard _customerCard = new CustomerCard(index,name, mailAddress);
		Date date = new Date();
		_customerCard.setCreatedAt(date);
		_customerCard.setUpdatedAt(date);
		cardMap.put(index, _customerCard);
		index++;
	}
	
	void addEmployeeCard(String name,String mailAddress)throws Exception{
		if(this.cardMap.size()>5){
			throw new Exception("you can add card less than 5");
		}
		if(set.contains(mailAddress)==true) {
			throw new Exception("address doubled");
		}
		
		set.add(mailAddress);
		EmployeeCard _employeeCard = new EmployeeCard(index,name, mailAddress);
		Date date = new Date();
		_employeeCard.setCreatedAt(date);
		_employeeCard.setUpdatedAt(date);
		cardMap.put(index, _employeeCard);
		index++;
	}
	
	void printAll() {
		for(Map.Entry<Integer,Card> e: cardMap.entrySet()) {
			e.getValue().print();
		}
	}
		void updateCustomerCard(int id, String name)throws Exception{
			if(cardMap.get(id)==null) {
				throw new Exception("no data");
			}
				Date date = new Date();
				cardMap.get(id).setName(name);
				cardMap.get(id).setUpdatedAt(date);
			}
		void deleteCustomerCard(int id)throws Exception{
			if(cardMap.get(id)==null) {
				throw new Exception("no data");
			}
			cardMap.remove(id);
		}
}
		

		
		
		


		
	
		
	
