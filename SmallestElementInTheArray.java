import java.util.Scanner;
class SmallestElementInTheArray 
{
	public static int smallest(int [] a)
	{
		int min = a[0];
		for(int i = 0; i<=a.length-1; i++)
		{
			if(a[i]<min)
				min=a[i];
		}
		return min;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an Array.");
		int size = sc.nextInt();
		int [] a = new int[size];
		System.out.println("Enter the Array elements.");
		for(int i = 0; i<=a.length-1; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("smallest element is : "+smallest(a));
	}
}
