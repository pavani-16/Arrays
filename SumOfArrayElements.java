import java.util.Scanner;
class SumOfArrayElements 
{
	public static int sumOfElements(int [] a)
	{
		int sum = 0;
		for(int i = 0; i<=a.length-1; i++)
		{
			sum = sum+a[i];
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size = sc.nextInt();
		int [] a = new int[size];
		System.out.println("Enter the Array elements one by one");
		for(int i = 0; i<=a.length-1; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("sum of Array elements : "+sumOfElements(a));
	}
}
