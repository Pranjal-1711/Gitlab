package Sorting;

import java.util.Scanner;

public class InsertionSort
{
	int i,j,n;
	int a[];
	Scanner s;
	
	
	void input()
	{
		s=new Scanner(System.in);
		System.out.println("Enter the size  of array");
		n=s.nextInt();
		a=new int[n];
		System.out.println("Enter the element");
		for(i=0; i<n; i++)
		{
			a[i]=s.nextInt();
		}
	}

	void display()
	{
		int temp;
		for(i=1; i<n; i++)
		{
			temp=a[i];
			j=i-1;
			while(j>=0 && a[j]>temp)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		System.out.println("Array after sorting :");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
		
	}
	public static void main(String[] args)
	{
	InsertionSort i=new InsertionSort();
	i.input();
	i.display();

	}

}
