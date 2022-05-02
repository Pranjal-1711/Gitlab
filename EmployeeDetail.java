package IOPackage;

import java.io.*;
import java.util.Scanner;


class employee implements Serializable
{
	int empNo;
	String name;
	String address;
	
	void input()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the EmployeeNo.");
		empNo=s.nextInt();
		System.out.println("Enter the Employee Name");
		name=s.next();
		System.out.println("Enter the adress");
		address=s.next();
	}
	
	void display()
	{
		System.out.println(empNo+" "+name+" "+address);
	}
}


public class EmployeeDetail
{

	public static void main(String[] args) throws Exception
	{
		employee e=new employee();
		e.input();
		FileOutputStream f=new FileOutputStream("Employee.dat" );
		ObjectOutputStream o=new ObjectOutputStream(f);
		o.writeObject(e);
		o.close();
		ObjectInputStream i=new ObjectInputStream(new FileInputStream("Employee.dat"));
		employee k=(employee)i.readObject();
		k.display();
		i.close();

	}

}
