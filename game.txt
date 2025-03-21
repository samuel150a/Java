class game
{
	public static void main(String[] args)
	
	{
		String Element1="cricket";
		String Element2="kabbadi";
		String Element3="footdball";
		String Element4="carom";
		String Element5="chess";
		String[] games={Element1,Element2,Element3,Element4,Element5};
		for(int i=0;i<=2;i++)
		{
			System.out.println("the list is "+games[i]);
			
		}
		for(String ForEach:games)
		{
			System.out.println(ForEach);
		}
	}
}