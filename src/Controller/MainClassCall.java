package Controller;

import bean.Customer;
import bean.Vegetable;

import vegeInsert.VegetableInsert;

public class MainClassCall {

	public static void main(String[] args) {

		Vegetable vegetable=new Vegetable();
		VegetableInsert.inserVege(vegetable);
		System.out.println("Customer Module");
		
	
	}

}
