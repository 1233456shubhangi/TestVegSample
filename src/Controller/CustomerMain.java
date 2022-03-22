package Controller;

import bean.Customer;
import bean.Vegetable;
import dao.VegetableDaoImpl;
import vegeInsert.CustomerAccess;



public class CustomerMain {
	
	public static void main(String[] args) {

		Vegetable vegetable=new Vegetable();
		Customer customer=new Customer();
		VegetableDaoImpl.displayVegetable(vegetable);
		//CustomerAccess.accessVeg(customer);
		System.out.println("Thank You For Shopping");
		
	}
}
