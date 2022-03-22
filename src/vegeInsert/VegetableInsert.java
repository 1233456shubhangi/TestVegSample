package vegeInsert;

import java.util.Scanner;

import bean.Vegetable;
import dao.VegetableDaoImpl;

public class VegetableInsert {

	
	public static void inserVege(Vegetable vegetable)
	{
	
		String name,desc;
		int quantity;
		float rate;
		

		 Scanner sc = new Scanner(System.in);
		//id=sc.nextInt();
		 System.out.println("enter vegetable name");
		name=sc.next();
		 System.out.println("enter vegetable description");
		desc=sc.next();
		System.out.println("enter vegetable rate");
		rate=sc.nextFloat();
		System.out.println("enter vegetable quantity");
		quantity=sc.nextInt();
		
		//vegetable.setId(id);
		
		vegetable.setName(name);
		vegetable.setDesc(desc);
		vegetable.setQuantity(quantity);
		vegetable.setRate(rate);
		VegetableDaoImpl impl=new VegetableDaoImpl();
		impl.addVegetable(vegetable);
		System.out.println("Would you like to add more Vegetables");
		String choice=sc.next();
		if(choice=="y")
		{
			VegetableInsert.inserVege(vegetable);
		}
		else
		{
			System.exit(1);// customer intiate 
		}
		
		
	}
	
	
}
