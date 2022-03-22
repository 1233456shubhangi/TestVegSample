package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import bean.Customer;


public class CustomerDaoimpl implements CustomerDao
{

	@Override
	public void addCustomer(Customer customer) {
		
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
				
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vegetable","root","root");
			Statement stmt=con.createStatement();
			int x=0;
			String query="INSERT INTO customer (`name`, `quantity`, `rate`) VALUES('"+customer.getName()+"','"+customer.getQuantity()+"','"+customer.getRate()+"')";
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

	
}
