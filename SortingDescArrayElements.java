import java.util.Scanner;
import java.util.Arrays;
class SortingDescArrayElements 
{
	public static int [] sorting(int [] a)
	{
		for(int i = 0; i<=a.length-1; i++)
		{
			for(int j = 0; j<=a.length-2; j++)
			{
				if(a[j]<a[j+1])
				{
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}  
		}
		return a;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int size = sc.nextInt();
		int [] a = new int [size];
		System.out.println("enter Array elements");
		for(int i =0; i<=a.length-1; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(sorting(a)));
	}
}
