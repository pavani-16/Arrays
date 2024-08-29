import java.util.Scanner;
import java.util.Arrays;
class InsertingElementInTheArray 
{
	public static int [] insert(int [] a, int n)
	{
		int [] b = new int [a.length+1];
		for(int i = 0; i<=a.length-1; i++)
		{
			b[i]=a[i];
		}
		b[b.length-1]=n;
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
		System.out.println(Arrays.toString(insert(a,n)));
	}
}
