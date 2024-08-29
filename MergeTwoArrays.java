import java.util.Scanner;
import java.util.Arrays;
class MergeTwoArrays 
{
	public static int [] merge(int [] a, int [] b)
	{
		int [] c = new int[a.length + b.length];
		for(int i = 0; i<=c.length-1; i++)
		{
			if(i<=a.length-1)
			{
				c[i]=a[i];
			}
			else
			{
				c[i]=b[i-a.length];
			}
		}
		return c;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first Array size");
		int size1 = sc.nextInt();
		int [] a = new int [size1];
		System.out.println("enter first Array elements");
		for(int i =0; i<=a.length-1; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter second Array size");
		int size2 = sc.nextInt();
		int [] b = new int [size2];
		System.out.println("enter second Array elements");
		for(int i =0; i<=b.length-1; i++)
		{
			b[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(merge(a,b)));
	}
}
