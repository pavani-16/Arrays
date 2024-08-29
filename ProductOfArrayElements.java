import java.util.Scanner;
class ProductOfArrayElements
{
	public static int product(int [] a)
	{
		int pro = 1;
		for(int i = 0; i<=a.length-1; i++)
		{
			pro = pro * a[i];
		}
		return pro;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size = sc.nextInt();
		int [] a = new int [size];
		System.out.println("Enter the Array elements.");
		for(int i = 0; i<=a.length-1; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.println("product of array elements : "+product(a));
	}
}
