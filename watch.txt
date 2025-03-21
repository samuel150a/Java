class watch
{
	public static void main(String[] args)
	
	{
		String Element1="titan";
		String Element2="sonato";
		String Element3="rolex";
		String Element4="patek";
		String Element5="longines";
		String[] watches={Element1,Element2,Element3,Element4,Element5};
		for(int i=0;i<=2;i++)
		{
			System.out.println("the list is "+watches[i]);
			
		}
		for(String ForEach:watches)
		{
			System.out.println(ForEach);
		}
	}
}