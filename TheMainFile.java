package com.projectnew;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class TheMainFile 
{

	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("***Company Lockers Pvt. LTD.***");
		System.out.println("***Welcome to Locked.com***");
		System.out.println("***You can add,delete,search and get the list of files***");
		System.out.println("***Project By Shivam***");
		
		sc=new Scanner(System.in);
		
		System.out.println("Choose from below three Options");
		System.out.println("Choose 1.To view all files in ascending order ");
		System.out.println("Choose 2.To Add,Delete and Search Files");
		System.out.println("Choose 3.To Exit from the Application");
		System.out.println("Enter Your Choice");
		int ch= sc.nextInt();
		switch(ch)
		{
		case 1:
			Display dis=new Display();
			dis.Display();
			break;
			
		case 2:
			System.out.println("Choose from these 3 Option 1.Add-File 2.Delete-File 3.Search-File 4.Exit");
			System.out.println("Enter your choice");
			int ch1= sc.nextInt();
			switch(ch1)
			{
			case 1:
				Add add=new Add();
				add.Add();
				break;
			case 2:
				Delete del=new Delete();
				del.Delete();
				break;
			case 3:
				Search search = new Search();
				search.Search();
				break;
			case 4:
				System.out.println("Return to the Main-menu");
				break;
			}
			break;
		case 3:
			System.out.println("Exiting from the App");
			System.exit(ch);
		}
		
		
		
		

	}
}
class Display{
	void Display()
	{
		String path="D:\\caltech\\";
		File file=new File(path);
		//display operation
		File filename[]=file.listFiles();
		//for-each
		System.out.println("the list of files in asscending order in the "+ path +"is");
		for(File ff:filename) {
			System.out.println(ff.getName());
	}
}


}

class Delete
{
	void Delete()
	{
		String path="D:\\caltech\\";
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the file name");
		String filename=sc.next();
		String finalpath=path+filename;
		System.out.println(finalpath);
		
		File file=new File(finalpath);
		//delete operation
		file.delete();
		System.out.println("file gets deleted");
	}
}

class Add
{
	void Add() throws IOException
	{
		String path="D:\\caltech\\";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name");
		String filename=sc.next();
		String finalpath=path+filename;
		System.out.println(finalpath);
		File file=new File(finalpath);
		boolean res=file.createNewFile();
		if(res!=true) {
			System.out.println("file not created");
		}
		else
		{
			System.out.println("file is created");
		}
	}
}

class Search
{
	void Search()
	{
		String path="D:\\caltech\\";
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the file name to search");
		String namesearch=sc.next();
		File file = new File(path);
		File filename[]=file.listFiles();
		int flag=0;
		for(File ff:filename) {
			if(ff.getName().equals(namesearch))
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		if(flag==1) {
			System.out.println("The File is found");
		}
		else
		{
			System.out.println("File is not found");
		}
	}
}
