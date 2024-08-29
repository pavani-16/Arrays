import java.util.Scanner;
import java.util.Arrays;
class RemoveDuplicateElements 
{
	public static int [] DuplicateElements(int a[])
	{
		int count = 0;
		for(int i = 0; i<=a.length-1; i++)
		{
			boolean previouslyPresent = false;
			for(int j = 0; j<=i-1; j++)
			{
				if(a[j]==a[i])
				{
					previouslyPresent = true;
					break;
				}
			}
			if(previouslyPresent == false)
			{
				count++;
			}
		}
		int index = 0;
		int [] b = new int [count];
		for(int i = 0; i<=a.length-1; i++)
		{
		boolean previouslyPresent = false;
		for(int j = 0; j<=i-1; j++)
		{
			if(a[j]==a[i])
			{
				previouslyPresent = true;
				break;
			}
		}
		if(previouslyPresent == false)
		{
			b[index]=a[i];
			index++;
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
		System.out.println("After remove the duplicate elements, array is : "+Arrays.toString(DuplicateElements(a)));
	}
}
