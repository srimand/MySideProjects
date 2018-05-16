
public class BinaryAddition {
	public static void main(String[] args)
	{
		System.out.println(binaryadd(25,34));
	}
	
	private static int binaryadd(int a, int b)
	{
		if (b==0)
		{
			return a;
		}
		int sum = a ^ b;
		int carry = (a & b) << 1;
		return binaryadd(sum,carry);
	}

}
