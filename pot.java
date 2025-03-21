class pot
{
	public static void main(String[] args)
	
	{
		String Element1="overall";
		String Element2="runner up";
		String Element3="starter set";
		String Element4="design";
		String Element5="ceramic";
		String[] pots={Element1,Element2,Element3,Element4,Element5};
		for(int i=0;i<=2;i++)
		{
			System.out.println("the list is "+pots[i]);
			
		}
		for(String ForEach:pots)
		{
			System.out.println(ForEach);
		}
	}
}