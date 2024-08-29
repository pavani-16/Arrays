import java.util.Scanner;
import java.util.Arrays;
class RightRotationsOfAnArray 
{
	public static int [] rightRotation(int [] a, int n)
	{
		for(int x = 1; x<=n; x++)
		{
			int temp = a[a.length-1];
			for(int i = a.length-2; i>=0; i--)
			{
				a[i+1]=a[i];
			}
			a[0] = temp;
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
		System.out.println("Enter how many right Rotations.");
		int n = sc.nextInt();
		System.out.println("After "+n+"rotations"+Arrays.toString(rightRotation(a,n)));
	}
}
