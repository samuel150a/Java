class note
{
	public static void main(String[] args)
	
	{
		String Element1="ruled";
		String Element2="unruled";
		String Element3="both";
		String Element4="short";
		String Element5="long";
		String[] notess={Element1,Element2,Element3,Element4,Element5};
		for(int i=0;i<=2;i++)
		{
			System.out.println("the list is "+notes[i]);
			
		}
		for(String ForEach:notes)
		{
			System.out.println(ForEach);
		}
	}
}