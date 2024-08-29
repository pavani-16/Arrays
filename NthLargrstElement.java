import java.util.Scanner;
class NthLargrstElement 
{
	public static int nthLargest(int [] a, int n)
	{
		int largest = 0;
		for(int i = 0; i<=a.length-1; i++)
		{
			int count = 0;
			for(int j = 0; j<=a.length-1; j++)
			{
				if(a[j] > a[i])
				{
					count++;
				}
			}
			if(count==(n-1))
			{
				largest = a[i];
			}
		}
		return largest;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int [] a = new int [size];
		System.out.println("Enter Array elements.");
		for(int i = 0; i<=a.length-1; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("enter the n value for nth largest number");
		int n = sc.nextInt();
		System.out.println(nthLargest(a,n));
	}
}