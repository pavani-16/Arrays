import java.util.Scanner;
import java.util.Arrays;
class LeftRotationOfAnArray 
{
	public static int [] leftRotation(int [] a, int n)
	{
		for(int x = 0; x<=n; x++)
		{
			int temp = a[0];
			for(int i = 1; i<=a.length-1; i++)
			{
				a[i-1]=a[i];
			}
			a[a.length-1] = temp;
		}
		return a;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int size = sc.nextInt();
		int [] a = new int [size];
		System.out.println("Enter Array elements.");
		for(int i = 0; i<=a.length-1; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter how many left Rotations.");
		int n = sc.nextInt();
		System.out.println("After "+n+"rotations"+Arrays.toString(leftRotation(a,n)));
	}
}
