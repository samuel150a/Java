class bag
{
	public static void main(String[] args)
	
	{
		String Element1="redbolt";
		String Element2="lunnas";
		String Element3="wildcraft";
		String Element4="hippo";
		String Element5="trek";
		String[] bags={Element1,Element2,Element3,Element4,Element5};
		for(int i=0;i<=2;i++)
		{
			System.out.println("the list is "+bags[i]);
			
		}
		for(String ForEach:bags)
		{
			System.out.println(ForEach);
		}
	}
}