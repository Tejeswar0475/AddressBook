package com.java.demo;

import java.util.Scanner;

public class userChoice
{	
	public static void main(String[] args)
	{
		int  userInput;
		int ans;
		AddressService obj = new AddressService();
		
		Scanner s = new Scanner(System.in);
		do {
			System.out.println("1.Add record");
			System.out.println("2.Edit record");
			System.out.println("3.Delete record");
			System.out.println("4.Sort by zip record");
			System.out.println("5.Sort by lastname record");
			System.out.println("6.Display record");
			userInput = s.nextInt();
			switch(userInput)
			{
				case 1:
					obj.Add();
					break;
				case 2:
					obj.Edit();
					break;
				case 3:
					obj.Delete();
					break;
				case 4:
					obj.Sort_Zip();
					break;
				case 5:
					obj.Sort_Name();
					break;
				case 6:
					obj.Display();
					break;
				default:System.out.println("Invalid option");
			}
			
			System.out.println("press 1 to start \n press 0 to disconnect");
			ans=s.nextInt();
		}while(ans==1);
				
	}

}