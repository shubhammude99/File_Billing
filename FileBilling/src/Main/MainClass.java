package Main;

import java.util.Scanner;

import Taj.Taj;

public class MainClass {
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		for(;;)
		{
			Taj t=new Taj();
			System.out.println("1.add user  4.exit");
		   switch(sc.nextInt())
		   {
		   case 1:
		   {
			   t.addUser();
			   break;
		   }
		   case 2:
		   {
			   t.makeOrder();
			   break;
		   }
		   case 3:
		   {
			  
			   t.bill();
			   break;
		   }
		   case 4:
		   {
			   System.out.println("application stopped");
			   System.exit(10);
		   }
		   }
		}
	}
}
