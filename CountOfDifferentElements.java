import java.util.Scanner;
class CountOfDifferentElements 
{
	public static int countOfDifferentArrayElements(int a[])
	{
		int count = 0;
	for(int i = 0; i<=a.length-1; i++)
	{
		boolean isPreviousPresent = false;
		for(int j = 0; j<=i-1; j++)
		{
			if(a[j]==a[i])
			{
				isPreviousPresent = true;
				break;
			}
		}
		if(isPreviousPresent == false)
			count++;
	}
	return count;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		int size = sc.nextInt();
		int [] a = new int [size];
		System.out.println("Enter the Array elements.");
		for(int i = 0; i<=a.length-1; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("Count of elements is : "+countOfDifferentArrayElements(a));
	}
}
