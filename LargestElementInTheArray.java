import java.util.Scanner;
class LargestElementInTheArray 
{
	public static int largest(int [] a)
	{
		int max = a[0];
		for(int i = 0; i<=a.length-1; i++)
		{
			if(a[i]>max)
				max=a[i];
		}
		return max;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of an Array.");
		int size = sc.nextInt();
		int [] a = new int[size];
		System.out.println("Enter the Array elements.");
		for(int i = 0; i<=a.length-1; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("largest element is : "+largest(a));
	}
}
