import java.util.Scanner;
class SearchOFTargetElement 
{
	public static int search(int [] a, int target)
	{
		int index = -1;
		for(int i = 0; i<=a.length-1; i++)
		{
			if(a[i]==target)
			{
				index = i;
				break;
			}
		}
		return index;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int size = sc.nextInt();
		int [] a = new int [size];
		System.out.println("Enter Array Elements.");
		for(int i = 0; i<=a.length-1; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter target element.");
		int target = sc.nextInt();
		System.out.println("Array index is : "+search(a,target));
	}
}
