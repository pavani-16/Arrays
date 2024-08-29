import java.util.Scanner;
class ReversingEachElements 
{
	public static int reverse(int num)
	{
		int rev = 0;
		while(num>0)
		{
			int ld = num%10;
			rev = rev * 10 +ld;
			num/=10;
		}
		return rev;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter tha size of an Array");
		int size = sc.nextInt();
		int [] a = new int [size];
		System.out.println("Enter the Array elements");
		for(int i = 0; i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i = 0; i<=a.length-1;i++)
		{
			a[i]=reverse(a[i]);
		}
		System.out.println("After reversing the Each Array Elements");
		System.out.print("[");
		for(int i = 0; i<=a.length-1;i++)
		{
			if(i==a.length-1)
				System.out.print(a[i]);
			else
				System.out.print(a[i]+", ");
		}
		System.out.println("]");
	}
}
