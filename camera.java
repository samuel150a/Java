class camera
{
	public static void main(String[] args)
	
	{
		String Element1="sony";
		String Element2="nikon";
		String Element3="canon";
		String Element4="sigma";
		String Element5="zeiss";
		String[] cameras={Element1,Element2,Element3,Element4,Element5};
		for(int i=0;i<=2;i++)
		{
			System.out.println("the list is "+cameras[i]);
			
		}
		for(String ForEach:cameras)
		{
			System.out.println(ForEach);
		}
	}
}