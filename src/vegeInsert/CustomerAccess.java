package vegeInsert;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import bean.Customer;
import bean.Vegetable;
import dao.CustomerDaoimpl;
import dao.VegetableDaoImpl;

public class CustomerAccess {
	
	public static void accessVeg(Customer customer)
	{
         
		
		
		 
			
	    Customer cus =new Customer();
		CustomerDaoimpl impl=new CustomerDaoimpl();
		impl.addCustomer(cus);
		System.out.println("Would you like to add more Vegetables");
		//String choice=sc.next();
		//if(choice=="y")
		{
			CustomerAccess.accessVeg(customer);
		}
		//else
		{
			System.exit(1);// customer intiate 
		}
		
		
	}
	
}
