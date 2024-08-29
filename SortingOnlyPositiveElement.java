import java.util.Scanner;
import java.util.Arrays;
class SortingOnlyPositiveElement 
{
	public static int [] positive(int [] a)
	{
		for(int i = 0; i<=a.length-1; i++)
		{
			if(a[i]>=0)
			{
				for(int j = i+1; j<=a.length-1; j++)
				{
					if(a[j]>=0)
					{
						if(a[i]>a[j])
						{
							int temp = a[i];
							a[i]=a[j];
							a[j]=temp;
						}
					}
				}
			}
		}
		return a;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array size");
		int size = sc.nextInt();
		int [] a = new int [size];
		System.out.println("Enter Array elements");
		for(int i = 0; i<=a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(positive(a)));
	}
}
