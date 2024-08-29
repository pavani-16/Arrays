import java.util.Scanner;
class SumOfDigitsOfEachElement 
{
	    public static int sumOfDigits(int num)
		{
			int sum = 0; 
			while(num>0)
			{
				int ld = num%10;
				sum+=ld;
				num/=10;
			}
			return sum;
		}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size.");
		int size = sc.nextInt();
		int [] a = new int [size];
		System.out.println("Enter Array Elements.");
		for(int i = 0; i<=a.length-1; i++)
		{
			a[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i = 0; i<=a.length-1; i++)
		{
			sum+=sumOfDigits(a[i]);
		}
		System.out.println("Sum of Each digits of Elements : "+sum);
	}
}
