class EvenOdd
{
public static void main(String[] args)
{
	int[] num={3,11,4,7,32,101};
	for(int i=0;i<=num.length-1;i++)
	{
		if(num[i]%2==0)
		{
			System.out.println(num[i]+ "is even number");
		}
		else
		{
			System.out.println(num[i]+ "is odd number");
		}
		
	}
	
}

}