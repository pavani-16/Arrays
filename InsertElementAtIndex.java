import java.util.Scanner;
import java.util.Arrays;
class InsertElementAtIndex 
{
	public static int [] insert(int [] a, int n, int index)
	{
		int [] b = new int[a.length+1];
		for(int i = 0; i<=b.length-1; i++)
		{
			if(i<index)
			{
				b[i]=a[i];
			}
			else if (i==index)
			{
				b[index]=n;
			}
			else 
			{
				b[i]=a[i-1];
			}
		}
		return b;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int size = sc.nextInt();
		int [] a = new int [size];
		System.out.println("Enter Array elements");
		for(int i = 0; i<=a.length-1; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the Insert element");
		int n = sc.nextInt();
		System.out.println("Enter index position");
		int index = sc.nextInt();
		System.out.println(Arrays.toString(insert(a, n, index)));
	}
}
