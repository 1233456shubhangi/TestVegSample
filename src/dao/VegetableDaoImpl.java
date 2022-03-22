package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import bean.Customer;
import bean.Vegetable;
import vegeInsert.CustomerAccess;

public class VegetableDaoImpl implements VegetableDao 
{

	@Override
	public void addVegetable(Vegetable vegetable) {
	
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
//			List<Vegetable> vegetables =new LinkedList<Vegetable>();
//			vegetables.add(vegetable);
				
				
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vegetable","root","root");
			Statement stmt=con.createStatement();
			int x=0;
			String query="INSERT INTO veggies (`name`,`desc`, `quantity`, `rate`) VALUES('"+vegetable.getName()+"', '"+vegetable.getDesc()+"','"+vegetable.getQuantity()+"', '"+vegetable.getRate()+"')";
			x=stmt.executeUpdate(query);
			if(x==0)
			{
				System.out.println("Data not inserted");
			}
			else
			{
				System.out.println("Data inserted successfully");
			}
		
		}
	
	
		 catch(Exception e)
		 {
			 System.out.println(e);
		 }
	
	}
	
	public static void displayVegetable(Vegetable vegetable) 
	{
	
		// This block will display all the vegtables
		try
		{
		  
			 
		      Scanner sc = new Scanner(System.in);
		      Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vegetable","root","root");
		Statement stmt= con.createStatement();
		ResultSet ob=stmt.executeQuery("SELECT * FROM `vegetable`.`veggies` " );
		List<Vegetable> list=new LinkedList<Vegetable>();

		int quantity[]=new int[10];
		float rate[]=new float[10];
		int i=0;
		
		while(ob.next())
		{
		i++;
		quantity[i]=ob.getInt(5);
		rate[i]=ob.getFloat(4);
		Vegetable vegi=new Vegetable();
		vegi.setId(ob.getInt(1));
		vegi.setName(ob.getString(2));
		vegi.setRate(ob.getFloat(4));
		vegi.setQuantity(ob.getInt(5));
		vegi.setDesc(ob.getString(3));
		list.add(vegi);
		}
		int size=list.size();
//		System.out.println("Size value="+size);
		
		System.out.println("Id\tDescription\tName\tQuantit\tRate");   
		for(Vegetable v:list)
	     {
			
	    	 System.out.println(v.getId()+"\t"+v.getDesc()+"\t\t"+v.getName()+"\t"+v.getQuantity()+"\t"+v.getRate());
	     }
		System.out.println();
		float billsum=0;
		 
		 float bill=0.0f;
		 System.out.println("How many items want to purchase");
		 int count=sc.nextInt();
		 for(int ii=0;ii<count;ii++)
		 {
			 System.out.println("Enter item id to purchase");
			 int id=sc.nextInt();
			 
			 System.out.println("enter item quantity");
			 int quantity1=sc.nextInt();
			//System.out.println(bill);
			 
			 bill=bill+quantity1*rate[id];
			 System.out.println("Quantity="+quantity1+"Rate="+rate[id]);
			 billsum=billsum+bill;
		
			 int remquan=quantity[id]-quantity1;
			 String query="UPDATE `vegetable`.`veggies` SET `quantity` = '"+remquan+"' WHERE (`id` = '"+id+"')";
			stmt.executeUpdate(query);
					 
		 }
		 System.out.println("bill is="+bill); 
	       //System.out.println(billsum);
	        
	       //
		System.out.println();
		System.out.println("Stocks are");
		System.out.println("Quantity \t Rate");
		for(int j=1;j<size;j++)
		{
			System.out.println(quantity[j]+"\t\t"+rate[j]);
		}
		}
		
		
		catch (Exception e) 
		{
			System.out.println(e);
		}
		}		
}
		
	
	
	
	
	

