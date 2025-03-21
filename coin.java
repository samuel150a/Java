class coin
{
	public static void main(String[] args)
	
	{
		String Element1="bitcoin";
		String Element2="binance";
		String Element3="usd coin";
		String Element4="dogecoin";
		String Element5="tether";
		String[] coins={Element1,Element2,Element3,Element4,Element5};
		for(int i=0;i<=2;i++)
		{
			System.out.println("the list is "+coins[i]);
			
		}
		for(String ForEach:coins)
		{
			System.out.println(ForEach);
		}
	}
}