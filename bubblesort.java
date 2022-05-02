package Assignmen1;

public class bubblesort 
{
	public static void main(String[] args) {

		int arr[]= {224,134,55,6,7,83,213};
		int temp;
		
		for( int j=0;j<arr.length-1; j++)

			{
			
			//by putting this -j we will run inner loop less time 
			//as in every iteration highest element goes on last so  no
			//need to check with last elements 
			for(int i=0;i<arr.length-1-j ;i++)
		    {
			if(arr[i]>arr[i+1])
			{
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		  }
			}
		
		
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		

	}

}

