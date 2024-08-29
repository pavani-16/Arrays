import java.util.Scanner;
import java.util.Arrays;
class ZerosMovesToLast 
{
	public static int [] zeros(int [] a)
	{
		int [] b = new int [a.length];
		int index = 0;
		for(int i = 0; i<=a.length-1; i++)
		{
			if(a[i]!=0)
			{
				b[index]=a[i];
				index++;
			}
		}
		return b;
	}
	// 2nd method
	public static int [] zeros2(int [] a)
	{
		for(int i = 0; i<=a.length-1; i++)
		{
			if(a[i]==0)
			{
				for(int j = i+1; j<=a.length-1;j++)
				{
					if(a[j]!=0)
					{
						int temp = a[i];
						a[i]=a[j];
						a[j]=temp;
						break;
					}
				}
			}
		}
		return a;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size");
		int size = sc.nextInt();
		int [] a = new int [size];
		System.out.println("Enter Array elements.");
		for(int i = 0; i<=a.length-1; i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(zeros2(a)));
	}
}
