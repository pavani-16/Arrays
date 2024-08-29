import java.util.Arrays;
class ReverseEachWord 
{
	public static String reverse(String s)
	{
		String rev = "";
		for(int i = s.length()-1; i>=0; i--)
		{
			char ch = s.charAt(i);
			rev = rev + ch;
		}
		return rev;
	}
	public static void main(String[] args) 
	{
		String s = "HOW ARE YOU";
		String [] a = s.split(" ");
		System.out.println("Before reversing a each word");
		System.out.println(Arrays.toString(a));
		for(int i = 0; i<=a.length-1; i++)
		{
			a[i] = reverse(a[i]);
		}
		System.out.println("After reversing a each word");
		System.out.println(Arrays.toString(a));
		String ans = "";
		for(int i = 0; i<=a.length-1; i++)
		{
			if(i==a.length-1)
			{
				ans = ans + a[i];
			}
			else
			{
				ans = ans + a[i]+" ";
			}
		}
		System.out.println(ans);
	}
}
